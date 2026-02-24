package main.java.day03_dynamic_programming.top150;

/**
 * LC 746 - Min Cost Climbing Stairs
 * Difficulty: Easy | Source: Top 150
 *
 * You are given an integer array cost where cost[i] is the cost of ith step
 * on a staircase. Once you pay the cost, you can either climb one or two steps.
 * You can either start from the step with index 0, or the step with index 1.
 * Return the minimum cost to reach the top of the floor.
 *
 * Example 1: cost = [10,15,20] → Output: 15
 *   Explanation: Start at index 1, pay 15, climb two steps to the top.
 * Example 2: cost = [1,100,1,1,1,100,1,1,100,1] → Output: 6
 *   Explanation: Start at index 0, taking steps with cost 1 strategically.
 *
 * Constraints:
 * - 2 <= cost.length <= 1000
 * - 0 <= cost[i] <= 999
 *
 * PATTERN: 1D Dynamic Programming
 * HINT: dp[i] = cost[i] + min(dp[i-1], dp[i-2]). The answer is
 *       min(dp[n-1], dp[n-2]) since you can reach the top from either
 *       of the last two steps.
 *
 * TIME: O(n) | SPACE: O(1) with two variables, O(n) with dp array
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // TODO: Implement dp[i] = cost[i] + min(dp[i-1], dp[i-2])
        return 0;
    }
}
