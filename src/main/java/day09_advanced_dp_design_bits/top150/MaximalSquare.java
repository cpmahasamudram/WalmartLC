package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 221 - Maximal Square
 * Difficulty: Medium | Source: Top 150
 *
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square
 * containing only 1's and return its area.
 *
 * Example 1:
 *   matrix = [["1","0","1","0","0"],
 *             ["1","0","1","1","1"],
 *             ["1","1","1","1","1"],
 *             ["1","0","0","1","0"]]
 *   Output: 4
 *   Explanation: The largest square of 1's has side length 2, so area = 4.
 * Example 2:
 *   matrix = [["0","1"],["1","0"]]
 *   Output: 1
 * Example 3:
 *   matrix = [["0"]]
 *   Output: 0
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[i].length
 * - 1 <= m, n <= 300
 * - matrix[i][j] is '0' or '1'.
 *
 * PATTERN: 2D Dynamic Programming
 * HINT: dp[i][j] = side length of largest square with bottom-right corner at (i,j).
 *       If matrix[i][j] == '1': dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1.
 *       Track the maximum side length and return maxSide * maxSide.
 *
 * TIME: O(m * n) | SPACE: O(m * n), optimizable to O(n)
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        // TODO: Implement dp[i][j] = min(left, top, diagonal) + 1 for '1' cells
        return 0;
    }
}
