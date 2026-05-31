import heapq
import math
from solution_q1 import parse_input, get_successors, is_goal
from solution_q2 import get_cost


def h1(state):
    # 2*M_left+C_left
    return 2 * state[0] + 1 * state[1]


def h2(state):
    # (2*M_left+C_left)/3
    return math.ceil((2 * state[0] + 1 * state[1]) / 3)

# returns same as h2
def h3(state):

    return h2(state)


def a_star(start_state, heuristic_func):
    pq = [(heuristic_func(start_state), 0, start_state, [start_state])]
    visited = {}
    expansions = 0

    while pq:
        f, g, current, path = heapq.heappop(pq)

        if current in visited and visited[current] <= g:
            continue
        visited[current] = g
        expansions += 1

        if is_goal(current):
            return path, g, expansions

        for forward in get_successors(current):
            new_g = g + get_cost(current, forward, 'A')
            new_f = new_g + heuristic_func(forward)
            if forward not in visited or new_g < visited.get(forward, float('inf')):
                heapq.heappush(pq, (new_f, new_g, forward, path + [forward]))

    return None, 0, expansions


if __name__ == "__main__":
    for start in parse_input():
        print(f"--- Running for Initial State: {start} ---")

        path1, cost1, exp1 = a_star(start, h1)
        print("The solution of Q3.1 (Heuristic 1) is:")
        print(f"Solution Path: {path1}")
        print(f"Total cost = {cost1}")
        print(f"Number of node expansions = {exp1}")

        path2, cost2, exp2 = a_star(start, h2)
        print("\nThe solution of Q3.1 (Heuristic 2) is:")
        print(f"Solution Path: {path2}")
        print(f"Total cost = {cost2}")
        print(f"Number of node expansions = {exp2}")

        path3, cost3, exp3 = a_star(start, h3)
        print("\nThe solution of Q3.1 (Heuristic 3 - Custom) is:")
        print(f"Solution Path: {path3}")
        print(f"Total cost = {cost3}")
        print(f"Number of node expansions = {exp3}\n")