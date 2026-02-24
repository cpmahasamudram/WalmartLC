package main.java.day03_dynamic_programming.top150;

/**
 * LC 300 - Longest Increasing Subsequence
 * Difficulty: Medium | Source: Top 150
 *
 * Given an integer array nums, return the length of the longest strictly
 * increasing subsequence.
 *
 * Example 1: nums = [10,9,2,5,3,7,101,18] → Output: 4
 *   Explanation: The longest increasing subsequence is [2,3,7,101], length = 4.
 * Example 2: nums = [0,1,0,3,2,3] → Output: 4
 * Example 3: nums = [7,7,7,7,7,7,7] → Output: 1
 *
 * Constraints:
 * - 1 <= nums.length <= 2500
 * - -10^4 <= nums[i] <= 10^4
 *
 * PATTERN: DP or Patience Sort (Binary Search)
 * HINT: DP approach: dp[i] = length of LIS ending at index i.
 *       For each i, dp[i] = max(dp[j] + 1) for all j < i where nums[j] < nums[i].
 *       O(n log n) approach: maintain a tails array; for each num, binary search
 *       for its position in tails.
 *
 * TIME: O(n^2) DP or O(n log n) patience sort | SPACE: O(n)
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        // TODO: Implement DP or patience sort with binary search
        return 0;
    }
}
