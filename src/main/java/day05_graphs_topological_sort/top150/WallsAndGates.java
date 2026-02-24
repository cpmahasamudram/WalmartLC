package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 286 - Walls and Gates
 * Difficulty: Medium | Source: TOP 150
 *
 * You are given an m x n grid rooms initialized with these three possible values:
 *   -1 = a wall or an obstacle
 *    0 = a gate
 *   INF (2147483647) = an empty room
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach
 * a gate, leave it as INF.
 *
 * Example 1:
 *   Input: rooms = [[2147483647,-1,0,2147483647],
 *                   [2147483647,2147483647,2147483647,-1],
 *                   [2147483647,-1,2147483647,-1],
 *                   [0,-1,2147483647,2147483647]]
 *   Output:        [[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]
 *
 * Example 2:
 *   Input: rooms = [[-1]]
 *   Output: [[-1]]
 *
 * Example 3:
 *   Input: rooms = [[2147483647]]
 *   Output: [[2147483647]]
 *
 * Constraints:
 * - m == rooms.length
 * - n == rooms[i].length
 * - 1 <= m, n <= 250
 * - rooms[i][j] is -1, 0, or 2147483647
 *
 * PATTERN: Multi-source BFS from all gates simultaneously
 * HINT: Enqueue all gate cells (value 0). BFS outward: for each cell, check 4 neighbors.
 *       If neighbor is INF (empty room), update its distance to current + 1 and enqueue it.
 *       Walls and already-visited cells are skipped. This fills all rooms optimally.
 *
 * TIME: O(m * n) | SPACE: O(m * n)
 */
public class WallsAndGates {

    public void wallsAndGates(int[][] rooms) {
        // TODO: Implement your solution here
    }
}
