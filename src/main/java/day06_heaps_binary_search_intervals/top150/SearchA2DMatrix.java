package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 74 - Search a 2D Matrix
 * Difficulty: Medium | Source: Top 150
 *
 * You are given an m x n integer matrix with the following two properties:
 * - Each row is sorted in non-decreasing order.
 * - The first integer of each row is greater than the last integer of the previous row.
 *
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write an algorithm with O(log(m * n)) runtime complexity.
 *
 * Example 1: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 -> Output: true
 * Example 2: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 -> Output: false
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[i].length
 * - 1 <= m, n <= 100
 * - -10^4 <= matrix[i][j], target <= 10^4
 *
 * PATTERN: Binary Search on flattened sorted array
 * HINT: Treat the 2D matrix as a 1D sorted array. Map index mid to row = mid / n,
 *       col = mid % n, and perform standard binary search.
 *
 * TIME: O(log(m * n)) | SPACE: O(1)
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO: Implement
        return false;
    }
}
