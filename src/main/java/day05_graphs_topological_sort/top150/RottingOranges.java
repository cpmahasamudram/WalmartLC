package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 994 - Rotting Oranges
 * Difficulty: Medium | Source: TOP 150
 *
 * You are given an m x n grid where each cell can have one of three values:
 *   0 = empty cell, 1 = fresh orange, 2 = rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange
 * becomes rotten. Return the minimum number of minutes that must elapse until no cell
 * has a fresh orange. If this is impossible, return -1.
 *
 * Example 1:
 *   Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 *   Output: 4
 *
 * Example 2:
 *   Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 *   Output: -1
 *   Explanation: The orange in the bottom-left corner is never reached.
 *
 * Example 3:
 *   Input: grid = [[0,2]]
 *   Output: 0
 *   Explanation: No fresh oranges at minute 0, so answer is 0.
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 10
 * - grid[i][j] is 0, 1, or 2
 *
 * PATTERN: Multi-source BFS from all rotten oranges simultaneously
 * HINT: Enqueue all initially rotten oranges. BFS level by level: each level is one minute.
 *       For each rotten orange, rot its 4-directional fresh neighbors. Track fresh count.
 *       After BFS, if fresh > 0 return -1, else return minutes elapsed.
 *
 * TIME: O(m * n) | SPACE: O(m * n)
 */
public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        // TODO: Implement your solution here
        return 0;
    }
}
