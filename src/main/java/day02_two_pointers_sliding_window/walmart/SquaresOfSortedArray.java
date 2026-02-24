package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 977 - Squares of a Sorted Array
 * Difficulty: Easy | Source: WALMART
 *
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 *
 * Example 1: nums = [-4,-1,0,3,10] → Output: [0,1,9,16,100]
 * Example 2: nums = [-7,-3,2,3,11] → Output: [4,9,9,49,121]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums is sorted in non-decreasing order
 *
 * PATTERN: Two Pointers (from ends)
 * HINT: Largest squares are at the extremes (most negative or most positive).
 *       Use two pointers at both ends, compare abs values, fill result array from the back.
 *
 * TIME: O(n) | SPACE: O(n) (output array)
 */
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        // TODO: Implement your solution here
        return new int[0];
    }
}
