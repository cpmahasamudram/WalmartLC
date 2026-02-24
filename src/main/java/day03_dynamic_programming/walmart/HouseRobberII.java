package main.java.day03_dynamic_programming.walmart;

/**
 * LC 213 - House Robber II
 * Difficulty: Medium | Source: Walmart
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed. All houses at this place
 * are arranged in a circle. That means the first house is the neighbor of
 * the last one. Adjacent houses have a security system connected and it will
 * automatically contact the police if two adjacent houses were broken into
 * on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1: nums = [2,3,2] → Output: 3
 *   Explanation: Cannot rob house 0 and house 2 (adjacent in circle). Rob house 1 = 3.
 * Example 2: nums = [1,2,3,1] → Output: 4
 *   Explanation: Rob house 0 (1) + house 2 (3) = 4.
 * Example 3: nums = [1,2,3] → Output: 3
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 1000
 *
 * PATTERN: 1D DP (two passes of House Robber I)
 * HINT: Since houses form a circle, house 0 and house n-1 cannot both be robbed.
 *       Run House Robber I on nums[0..n-2] and nums[1..n-1], return the max.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        // TODO: Implement two-pass House Robber I (exclude first or last)
        return 0;
    }
}
