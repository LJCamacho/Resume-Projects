#!/usr/bin/env python3

import argparse
import ast
import os
import re
import subprocess
import sys
from dataclasses import dataclass
from typing import Any, List, Optional, Tuple


@dataclass
class BlockSpec:
    name: str
    title_regex: re.Pattern
    solution_path_regex: re.Pattern
    total_cost_regex: re.Pattern
    expansions_regex: re.Pattern


@dataclass
class CheckResult:
    file: str
    ok: bool
    returncode: int
    stdout: str
    stderr: str
    messages: List[str]


def _compile_patterns():
    q1_dfs_title = re.compile(r"^The\s+solution\s+of\s+Q1\.1\.a\s+\(DFS\)\s+is\s*:\s*$", re.MULTILINE)
    q1_bfs_title = re.compile(r"^The\s+solution\s+of\s+Q1\.1\.b\s+\(BFS\)\s+is\s*:\s*$", re.MULTILINE)

    q2_A_title = re.compile(r"^The\s+solution\s+of\s+Q2\.1\s+\(UCS,\s*cost\s+model\s+A\)\s+is\s*:\s*$", re.MULTILINE)
    q2_B_title = re.compile(r"^The\s+solution\s+of\s+Q2\.1\s+\(UCS,\s*cost\s+model\s+B\)\s+is\s*:\s*$", re.MULTILINE)

    q3_h1_title = re.compile(r"^The\s+solution\s+of\s+Q3\.1\s+\(Heuristic\s+1\)\s+is\s*:\s*$", re.MULTILINE)
    q3_h2_title = re.compile(r"^The\s+solution\s+of\s+Q3\.1\s+\(Heuristic\s+2\)\s+is\s*:\s*$", re.MULTILINE)

    sol_path = re.compile(r"^Solution\s+Path\s*:\s*(.+)\s*$", re.MULTILINE)
    total_cost = re.compile(r"^Total\s+cost\s*=\s*([+-]?\d+(?:\.\d+)?)\s*$", re.MULTILINE)
    expansions = re.compile(r"^Number\s+of\s+node\s+expansions\s*=\s*([+-]?\d+)\s*$", re.MULTILINE)

    return {
        "q1": [
            BlockSpec("Q1 DFS", q1_dfs_title, sol_path, total_cost, expansions),
            BlockSpec("Q1 BFS", q1_bfs_title, sol_path, total_cost, expansions),
        ],
        "q2": [
            BlockSpec("Q2 UCS Model A", q2_A_title, sol_path, total_cost, expansions),
            BlockSpec("Q2 UCS Model B", q2_B_title, sol_path, total_cost, expansions),
        ],
        "q3": [
            BlockSpec("Q3 A* Heuristic 1", q3_h1_title, sol_path, total_cost, expansions),
            BlockSpec("Q3 A* Heuristic 2", q3_h2_title, sol_path, total_cost, expansions),
        ],
    }


PATTERNS = _compile_patterns()


def run_script(python_exe: str, script: str, timeout_s: int) -> CheckResult:
    if not os.path.exists(script):
        return CheckResult(script, False, 127, "", "", [f"File not found: {script}"])
    try:
        proc = subprocess.run(
            [python_exe, script],
            capture_output=True,
            text=True,
            timeout=timeout_s,
            check=False,
        )
    except subprocess.TimeoutExpired as e:
        return CheckResult(script, False, 124, e.stdout or "", e.stderr or "", ["Timed out."])
    except Exception as e:
        return CheckResult(script, False, 1, "", "", [f"Failed to run: {e!r}"])
    return CheckResult(script, proc.returncode == 0, proc.returncode, proc.stdout or "", proc.stderr or "", [])


def _find_title_positions(text: str, title_re: re.Pattern) -> List[int]:
    return [m.start() for m in title_re.finditer(text)]


def _slice_block(text: str, start_idx: int, end_idx: Optional[int]) -> str:
    return text[start_idx:end_idx] if end_idx is not None else text[start_idx:]


def _normalize_state(x: Any) -> Tuple[int, int, int, int, str]:
    if isinstance(x, (tuple, list)):
        if len(x) != 5:
            raise ValueError(f"State must have 5 elements, got {len(x)}")
        mL, cL, mR, cR, boat = x
        boat = str(boat).strip().strip('"').strip("'")
        return (int(mL), int(cL), int(mR), int(cR), boat)

    if isinstance(x, dict):
        def getk(*keys):
            for k in keys:
                if k in x:
                    return x[k]
            raise KeyError(keys[0])
        boat = str(x.get("Boat", x.get("boat", ""))).strip().strip('"').strip("'")
        return (
            int(getk("M_left", "m_left", "ml", "Mleft", "MLeft")),
            int(getk("C_left", "c_left", "cl", "Cleft", "CLeft")),
            int(getk("M_right", "m_right", "mr", "Mright", "MRight")),
            int(getk("C_right", "c_right", "cr", "Cright", "CRight")),
            boat,
        )

    if isinstance(x, str):
        s = x.strip().strip("()[] ")
        parts = [p.strip() for p in s.split(",")]
        if len(parts) != 5:
            raise ValueError(f"String state must have 5 comma-separated fields, got {len(parts)}")
        mL, cL, mR, cR = map(int, parts[:4])
        boat = parts[4].strip().strip('"').strip("'")
        return (mL, cL, mR, cR, boat)

    raise ValueError(f"Unrecognized state type: {type(x).__name__}")


def parse_solution_path_payload(payload: str) -> List[Tuple[int, int, int, int, str]]:
    s = payload.strip()
    if not s:
        raise ValueError("Empty Solution Path payload.")

    patched = re.sub(r",\s*([LR])\s*([\]\)\}])", r",'\1'\2", s)
    patched = re.sub(r",\s*([LR])\s*,", r",'\1',", patched)

    try:
        obj = ast.literal_eval(patched)
    except Exception:
        if "->" in s:
            parts = [p.strip() for p in s.split("->") if p.strip()]
            return [_normalize_state(p) for p in parts]
        raise ValueError("Not a parsable Python literal list/tuple; print a Python list of 5-tuples.")

    if isinstance(obj, (tuple, list)):
        states_raw = list(obj)
    else:
        raise ValueError("Solution Path must evaluate to a list/tuple of states.")

    return [_normalize_state(x) for x in states_raw]


def _shape_only_checks(states: List[Tuple[int, int, int, int, str]]) -> List[str]:
    issues: List[str] = []
    if not states:
        return ["Solution Path is empty."]

    for i, st in enumerate(states):
        if len(st) != 5:
            issues.append(f"State at index {i} does not have 5 fields: {st!r}")
            continue
        mL, cL, mR, cR, boat = st
        if boat not in ("L", "R"):
            issues.append(f"State at index {i} has Boat={boat!r}; expected 'L' or 'R'.")
        for vname, v in [("M_left", mL), ("C_left", cL), ("M_right", mR), ("C_right", cR)]:
            if not isinstance(v, int):
                issues.append(f"State at index {i} has non-integer {vname}: {v!r}")
    return issues


def check_format_for_script(script: str, output: str) -> List[str]:
    issues: List[str] = []

    base = os.path.basename(script)
    if base == "solution_q1.py":
        specs = PATTERNS["q1"]
    elif base == "solution_q2.py":
        specs = PATTERNS["q2"]
    elif base == "solution_q3.py":
        specs = PATTERNS["q3"]
    else:
        return [f"Unknown script name {base}."]

    title_positions: List[Tuple[BlockSpec, int]] = []
    for spec in specs:
        positions = _find_title_positions(output, spec.title_regex)
        if len(positions) != 1:
            issues.append(f"[{spec.name}] Title line missing or duplicated.")
        if positions:
            title_positions.append((spec, positions[0]))

    title_positions.sort(key=lambda x: x[1])

    for i, (spec, pos) in enumerate(title_positions):
        next_pos = title_positions[i + 1][1] if i + 1 < len(title_positions) else None
        block_text = _slice_block(output, pos, next_pos)

        m_path = spec.solution_path_regex.search(block_text)
        if not m_path:
            issues.append(f"[{spec.name}] Missing 'Solution Path:' line.")
        else:
            payload = (m_path.group(1) or "").strip()
            try:
                states = parse_solution_path_payload(payload)
                for pi in _shape_only_checks(states):
                    issues.append(f"[{spec.name}] {pi}")
            except Exception as e:
                issues.append(
                    f"[{spec.name}] Solution Path could not be parsed.\n"
                    f"  payload: {payload!r}\n"
                    f"  error: {e}\n"
                    f"  expected: a Python list of 5-tuples like [(3,3,0,0,'L'), ...]"
                )

        m_cost = spec.total_cost_regex.search(block_text)
        if not m_cost:
            issues.append(f"[{spec.name}] Missing or malformed 'Total cost =' line.")
        else:
            try:
                float(m_cost.group(1))
            except Exception:
                issues.append(f"[{spec.name}] Total cost is not numeric: {m_cost.group(1)!r}")

        m_exp = spec.expansions_regex.search(block_text)
        if not m_exp:
            issues.append(f"[{spec.name}] Missing or malformed 'Number of node expansions =' line.")
        else:
            try:
                int(m_exp.group(1))
            except Exception:
                issues.append(f"[{spec.name}] Node expansions is not an integer: {m_exp.group(1)!r}")

    if base == "solution_q2.py":
        if PATTERNS["q2"][0].title_regex.search(output) and not PATTERNS["q2"][1].title_regex.search(output):
            issues.append("Cost model B output missing.")

    return issues


def print_report(result: CheckResult, format_issues: List[str]) -> bool:
    ok = (result.returncode == 0) and (len(format_issues) == 0)

    print("=" * 80)
    print(f"Script: {result.file}")
    print(f"Exit code: {result.returncode}")
    if result.stderr.strip():
        print("-" * 80)
        print("stderr:")
        print(result.stderr.rstrip())
    print("-" * 80)
    print("stdout:")
    print(result.stdout.rstrip() if result.stdout.strip() else "<EMPTY>")
    print("-" * 80)

    print("RUNTIME CHECK: PASS" if result.returncode == 0 else "RUNTIME CHECK: FAIL")
    if format_issues:
        print("FORMAT CHECK: FAIL")
        for iss in format_issues:
            print("  -", iss)
    else:
        print("FORMAT CHECK: PASS")

    return ok


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--python", default=sys.executable)
    ap.add_argument("--timeout", type=int, default=10)
    args = ap.parse_args()

    scripts = ["solution_q1.py", "solution_q2.py", "solution_q3.py"]

    all_ok = True
    for s in scripts:
        res = run_script(args.python, s, args.timeout)
        fmt_issues = check_format_for_script(s, res.stdout)
        ok = print_report(res, fmt_issues)
        all_ok = all_ok and ok

    print("=" * 80)
    print("OVERALL: PASS" if all_ok else "OVERALL: FAIL")
    sys.exit(0 if all_ok else 1)


if __name__ == "__main__":
    main()