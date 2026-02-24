package main.java.day03_dynamic_programming.top150;

/**
 * LC 62 - Unique Paths
 * Difficulty: Medium | Source: Top 150
 *
 * There is a robot on an m x n grid. The robot is initially located at the
 * top-left corner (i.e., grid[0][0]). The robot tries to move to the
 * bottom-right corner (i.e., grid[m-1][n-1]). The robot can only move
 * either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths
 * that the robot can take to reach the bottom-right corner.
 *
 * Example 1: m = 3, n = 7 → Output: 28
 * Example 2: m = 3, n = 2 → Output: 3
 *   Explanation: Right→Down→Down, Down→Down→Right, Down→Right→Down.
 *
 * Constraints:
 * - 1 <= m, n <= 100
 *
 * PATTERN: 2D Dynamic Programming
 * HINT: dp[i][j] = dp[i-1][j] + dp[i][j-1]. First row and first column
 *       are all 1s (only one way to reach them). Can optimize to 1D array.
 *
 * TIME: O(m * n) | SPACE: O(n) with 1D optimization, O(m * n) with 2D array
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // TODO: Implement dp[i][j] = dp[i-1][j] + dp[i][j-1]
        return 0;
    }
}
