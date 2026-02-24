package main.java.day03_dynamic_programming.walmart;

/**
 * LC 309 - Best Time to Buy and Sell Stock with Cooldown
 * Difficulty: Medium | Source: Walmart
 *
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day. Find the maximum profit you can achieve. You may complete as
 * many transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times) with the following restrictions:
 * - After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you
 * must sell the stock before you buy again).
 *
 * Example 1: prices = [1,2,3,0,2] → Output: 3
 *   Explanation: buy=1, sell=3, cooldown, buy=0, sell=2 → profit = 2 + 2 = 3 (wait, 3-1=2, 2-0=2 -> 4? No: buy@1, sell@3 => +2, cooldown, buy@0, sell@2 => +2, total=3? Actually profit = (3-1)+(2-0) = 4... LC expected is 3. Let me recheck: transactions=[buy,sell,cooldown,buy,sell], profit = (2-1)+(2-0) = 3)
 * Example 2: prices = [1] → Output: 0
 *
 * Constraints:
 * - 1 <= prices.length <= 5000
 * - 0 <= prices[i] <= 1000
 *
 * PATTERN: State Machine DP with three states: hold, sold, rest
 * HINT: Define three states per day:
 *       hold[i] = max profit on day i if holding stock = max(hold[i-1], rest[i-1] - prices[i])
 *       sold[i] = max profit on day i after selling = hold[i-1] + prices[i]
 *       rest[i] = max profit on day i in cooldown = max(rest[i-1], sold[i-1])
 *       Answer = max(sold[n-1], rest[n-1])
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class BestTimeBuySellCooldown {
    public int maxProfit(int[] prices) {
        // TODO: Implement state machine DP with hold/sold/rest states
        return 0;
    }
}
