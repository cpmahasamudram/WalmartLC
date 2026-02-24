package main.java.day03_dynamic_programming.top150;

/**
 * LC 198 - House Robber
 * Difficulty: Medium | Source: Top 150
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses have
 * security systems connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1: nums = [1,2,3,1] → Output: 4
 *   Explanation: Rob house 0 (1) + house 2 (3) = 4.
 * Example 2: nums = [2,7,9,3,1] → Output: 12
 *   Explanation: Rob house 0 (2) + house 2 (9) + house 4 (1) = 12.
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 *
 * PATTERN: 1D Dynamic Programming
 * HINT: dp[i] = max(dp[i-1], dp[i-2] + nums[i]). At each house, choose to
 *       rob it (add to dp[i-2]) or skip it (keep dp[i-1]).
 *
 * TIME: O(n) | SPACE: O(1) with two variables, O(n) with dp array
 */
public class HouseRobber {
    public int rob(int[] nums) {
        // TODO: Implement dp[i] = max(dp[i-1], dp[i-2] + nums[i])
        return 0;
    }
}
