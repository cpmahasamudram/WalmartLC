package main.java.day03_dynamic_programming.walmart;

/**
 * LC 322 - Coin Change
 * Difficulty: Medium | Source: Walmart
 *
 * You are given an integer array coins representing coins of different
 * denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins,
 * return -1. You may assume that you have an infinite number of each kind of coin.
 *
 * Example 1: coins = [1,5,11], amount = 11 → Output: 1
 *   Explanation: 11 = 11
 * Example 2: coins = [2], amount = 3 → Output: -1
 * Example 3: coins = [1], amount = 0 → Output: 0
 *
 * Constraints:
 * - 1 <= coins.length <= 12
 * - 1 <= coins[i] <= 2^31 - 1
 * - 0 <= amount <= 10^4
 *
 * PATTERN: Bottom-up DP (Unbounded Knapsack) or BFS
 * HINT: Build dp[0..amount] where dp[i] = min coins to make amount i.
 *       For each amount i, try every coin c: dp[i] = min(dp[i], dp[i-c] + 1).
 *
 * TIME: O(amount * coins.length) | SPACE: O(amount)
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // TODO: Implement dp[amount] = min coins needed
        return 0;
    }
}
