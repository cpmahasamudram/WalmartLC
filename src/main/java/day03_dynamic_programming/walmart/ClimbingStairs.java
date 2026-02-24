package main.java.day03_dynamic_programming.walmart;

/**
 * LC 70 - Climbing Stairs
 * Difficulty: Easy | Source: Walmart
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct
 * ways can you climb to the top?
 *
 * Example 1: n = 2 → Output: 2
 *   Explanation: (1+1), (2)
 * Example 2: n = 3 → Output: 3
 *   Explanation: (1+1+1), (1+2), (2+1)
 *
 * Constraints:
 * - 1 <= n <= 45
 *
 * PATTERN: 1D Dynamic Programming (Fibonacci-style)
 * HINT: dp[i] = dp[i-1] + dp[i-2]. The number of ways to reach step i
 *       is the sum of ways to reach step i-1 (take 1 step) and step i-2 (take 2 steps).
 *
 * TIME: O(n) | SPACE: O(1) with two variables, O(n) with dp array
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        // TODO: Implement dp[i] = dp[i-1] + dp[i-2]
        return 0;
    }
}
