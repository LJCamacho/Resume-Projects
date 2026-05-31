import sys
from collections import deque

# input parsing, get successors, and goal state checking
def parse_input(filename="input.txt"):
    states = []
    try:
        with open(filename, 'r') as f:
            for line in f:
                params = line.strip().split(',')
                if len(params) == 5:
                    states.append((int(params[0]), int(params[1]), int(params[2]), int(params[3]), params[4].strip()))
    except FileNotFoundError:
        print(f"Error: {filename} not found.")
    return states

def get_successors(state):
    M_left, C_left, M_right, C_right, boat = state
    successors = []

    # number of Missionaries (L) and Cannibals (R)
    actions = [(1, 0), (2, 0), (0, 1), (0, 2), (1, 1)]

    for m, c in actions:
        if boat == 'L':
            new_state = (M_left - m, C_left - c, M_right + m, C_right + c, 'R')
        else:
            new_state = (M_left + m, C_left + c, M_right - m, C_right - c, 'L')
        if is_valid(new_state):
            successors.append(new_state)
    return successors


def is_goal(state):
    return state[0] == 0 and state[1] == 0

#
def is_valid(state):
    M_left, C_left, M_right, C_right, boat = state
    if M_left < 0 or C_left < 0 or M_right < 0 or C_right < 0: return False
    if (M_left > 0 and M_left < C_left) or (M_right > 0 and M_right < C_right): return False
    return True





def dfs(start_state):
    stack = [(start_state, [start_state])]
    visited = set()
    expansions = 0

    while stack:
        current, path = stack.pop()
        if current in visited:
            continue
        visited.add(current)
        expansions += 1

        if is_goal(current):
            return path, len(path) - 1, expansions

        for forward in get_successors(current):
            if forward not in visited:
                stack.append((forward, path + [forward]))
    return None, 0, expansions


def bfs(start_state):
    queue = deque([(start_state, [start_state])])
    visited = {start_state}
    expansions = 0

    while queue:
        current, path = queue.popleft()
        expansions += 1

        if is_goal(current): return path, len(path) - 1, expansions

        for forward in get_successors(current):
            if forward not in visited:
                visited.add(forward)
                queue.append((forward, path + [forward]))
    return None, 0, expansions


if __name__ == "__main__":

    initial_states = parse_input()
    for start in initial_states:
        print(f"--- Running for Initial State: {start} ---")

        path_dfs, cost_dfs, exp_dfs = dfs(start)
        print("The solution of Q1.1.a (DFS) is:")
        print(f"Solution Path: {path_dfs}")
        print(f"Total cost = {cost_dfs}")
        print("Number of node expansions =")
        print(exp_dfs)
        print("\n")

        path_bfs, cost_bfs, exp_bfs = bfs(start)
        print("The solution of Q1.1.b (BFS) is:")
        print(f"Solution Path: {path_bfs}")
        print(f"Total cost = {cost_bfs}")
        print("Number of node expansions =")
        print(exp_bfs)
        print("\n")