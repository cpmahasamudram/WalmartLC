package main.java.day02_two_pointers_sliding_window.top150;

/**
 * LC 209 - Minimum Size Subarray Sum
 * Difficulty: Medium | Source: Top 150
 *
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum >= target.
 * If no such subarray exists, return 0.
 *
 * Example 1: target = 7, nums = [2,3,1,2,4,3] → Output: 2 ([4,3])
 * Example 2: target = 4, nums = [1,4,4] → Output: 1
 * Example 3: target = 11, nums = [1,1,1,1,1,1,1,1] → Output: 0
 *
 * Constraints:
 * - 1 <= target <= 10^9
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^4
 *
 * PATTERN: Sliding Window (variable size)
 * HINT: Expand right to grow sum. Once sum >= target, shrink from left while still valid.
 *       Track minimum window length.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }
}
