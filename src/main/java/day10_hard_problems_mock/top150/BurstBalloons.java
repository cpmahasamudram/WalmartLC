package main.java.day10_hard_problems_mock.top150;

/**
 * LC 312 - Burst Balloons
 * Difficulty: Hard | Source: Top 150
 *
 * You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number
 * on it represented by nums[i]. You are asked to burst all the balloons. If you burst
 * balloon i, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1
 * goes out of bounds, treat it as if there is a balloon with a 1 painted on it.
 * Return the maximum coins you can collect by bursting the balloons wisely.
 *
 * Example 1: nums = [3,1,5,8] -> Output: 167
 *   Explanation: nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
 *                coins = 3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 = 167
 * Example 2: nums = [1,5] -> Output: 10
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 300
 * - 0 <= nums[i] <= 100
 *
 * PATTERN: Interval DP - think of the last balloon to burst
 * HINT: Instead of which balloon to burst first, think of which balloon to burst LAST in a
 *       subrange [left, right]. If balloon k is the last to burst in range (left, right),
 *       then dp[left][right] = dp[left][k] + dp[k][right] + nums[left]*nums[k]*nums[right].
 *       Pad the array with 1s on both ends.
 *
 * TIME: O(n^3) | SPACE: O(n^2)
 */
public class BurstBalloons {

    public int maxCoins(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }
}
