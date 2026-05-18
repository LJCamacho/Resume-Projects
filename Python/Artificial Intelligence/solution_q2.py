import heapq
from solution_q1 import parse_input, get_successors, is_goal



def get_cost(current, forward, model):
    M_left, C_left, M_right, C_right, boat = current
    n_ml, n_cl, n_mr, n_cr, n_boat = forward

    m_moved = abs(M_left - n_ml)
    c_moved = abs(C_left - n_cl)

    if model == 'A':
        return (m_moved * 2) + (c_moved * 1)
    elif model == 'B':
        return 2 if boat == 'L' else 1
    return 1


def ucs(start_state, model):
    pq = [(0, start_state, [start_state])]
    visited = {}
    expansions = 0

    while pq:
        cost, current, path = heapq.heappop(pq)

        if current in visited and visited[current] <= cost:
            continue
        visited[current] = cost
        expansions += 1

        if is_goal(current):
            return path, cost, expansions

        for forward in get_successors(current):
            step_cost = get_cost(current, forward, model)
            new_cost = cost + step_cost
            if forward not in visited or new_cost < visited.get(forward, float('inf')):
                heapq.heappush(pq, (new_cost, forward, path + [forward]))

    return None, 0, expansions


if __name__ == "__main__":

    for start in parse_input():
        print(f"--- Running for Initial State: {start} ---")

        path_a, cost_a, exp_a = ucs(start, 'A')
        print("The solution of Q2.1 (UCS, cost model A) is:")
        print(f"Solution Path: {path_a}")
        print(f"Total cost = {cost_a}")
        print(f"Number of node expansions = {exp_a}")

        path_b, cost_b, exp_b = ucs(start, 'B')
        print("\nThe solution of Q2.1 (UCS, cost model B) is:")
        print(f"Solution Path: {path_b}")
        print(f"Total cost = {cost_b}")
        print(f"Number of node expansions = {exp_b}\n")