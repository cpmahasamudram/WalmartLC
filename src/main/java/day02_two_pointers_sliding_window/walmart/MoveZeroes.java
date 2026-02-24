package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 283 - Move Zeroes
 * Difficulty: Easy | Source: WALMART
 *
 * Given an integer array nums, move all 0's to the end while maintaining
 * the relative order of the non-zero elements. Must be done in-place.
 *
 * Example 1: nums = [0,1,0,3,12] → Output: [1,3,12,0,0]
 * Example 2: nums = [0] → Output: [0]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 *
 * PATTERN: Two Pointers (read/write)
 * HINT: Use a write pointer. Walk through with a read pointer — when you find a
 *       non-zero, write it at the write pointer and advance. Fill the rest with 0.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // TODO: Implement your solution here
    }
}
