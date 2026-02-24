package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 416 - Partition Equal Subset Sum
 * Difficulty: Medium | Source: Top 150
 *
 * Given an integer array nums, return true if you can partition the array into
 * two subsets such that the sum of the elements in both subsets is equal, or
 * false otherwise.
 *
 * Example 1: nums = [1,5,11,5] -> true
 *   Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * Example 2: nums = [1,2,3,5] -> false
 *   Explanation: The array cannot be partitioned into equal sum subsets.
 *
 * Constraints:
 * - 1 <= nums.length <= 200
 * - 1 <= nums[i] <= 100
 *
 * PATTERN: 0/1 Knapsack Dynamic Programming
 * HINT: If total sum is odd, return false. Target = sum / 2.
 *       Use boolean dp[j] where dp[j] = true if subset summing to j exists.
 *       For each num, iterate j from target down to num: dp[j] = dp[j] || dp[j - num].
 *       Return dp[target].
 *
 * TIME: O(n * target) where n = nums.length, target = sum/2 | SPACE: O(target)
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        // TODO: Implement 0/1 knapsack DP to find if subset with sum/2 exists
        return false;
    }
}
