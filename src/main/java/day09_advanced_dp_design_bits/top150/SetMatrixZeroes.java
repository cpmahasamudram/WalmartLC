package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 73 - Set Matrix Zeroes
 * Difficulty: Medium | Source: Top 150
 *
 * Given an m x n integer matrix, if an element is 0, set its entire row and
 * column to 0's. You must do it in place.
 *
 * Example 1:
 *   Input:  [[1,1,1],[1,0,1],[1,1,1]]
 *   Output: [[1,0,1],[0,0,0],[1,0,1]]
 * Example 2:
 *   Input:  [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 *   Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[0].length
 * - 1 <= m, n <= 200
 * - -2^31 <= matrix[i][j] <= 2^31 - 1
 *
 * PATTERN: Use first row/col as markers
 * HINT: Use the first row and first column as flags. First pass: mark matrix[i][0]
 *       and matrix[0][j] as 0 if matrix[i][j] == 0. Track whether the first row/col
 *       themselves originally had zeros. Second pass: zero out cells based on markers.
 *       Finally, zero out first row/col if needed.
 *
 * TIME: O(m * n) | SPACE: O(1) using first row/col as markers
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        // TODO: Implement using first row/col as markers, then zero out in second pass
    }
}
