package main.java.day03_dynamic_programming.walmart;

/**
 * LC 494 - Target Sum
 * Difficulty: Medium | Source: Walmart
 *
 * You are given an integer array nums and an integer target.
 * You want to build an expression out of nums by adding one of the symbols
 * '+' and '-' before each integer in nums and then concatenate all the integers.
 * Return the number of different expressions that you can build, which evaluates
 * to target.
 *
 * Example 1: nums = [1,1,1,1,1], target = 3 → Output: 5
 *   Explanation: -1 + 1 + 1 + 1 + 1 = 3 (5 ways to choose which one is negative)
 * Example 2: nums = [1], target = 1 → Output: 1
 *
 * Constraints:
 * - 1 <= nums.length <= 20
 * - 0 <= nums[i] <= 1000
 * - 0 <= sum(nums[i]) <= 1000
 * - -1000 <= target <= 1000
 *
 * PATTERN: DP / 0-1 Knapsack variant
 * HINT: Let P = subset with '+', N = subset with '-'. Then P - N = target and
 *       P + N = totalSum, so P = (target + totalSum) / 2. Reduce to subset-sum
 *       counting problem. Alternatively, use recursion with memoization on
 *       (index, currentSum).
 *
 * TIME: O(n * sum) | SPACE: O(sum)
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        // TODO: Implement DP knapsack or memoized recursion
        return 0;
    }
}
