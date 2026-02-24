package main.java.day01_arrays_hashing.top150;

/**
 * LC 121 - Best Time to Buy and Sell Stock
 * Difficulty: Easy | Source: Top 150
 *
 * You are given an array prices where prices[i] is the price of a given
 * stock on the ith day. You want to maximize your profit by choosing a
 * single day to buy and a single day to sell in the future.
 *
 * Return the maximum profit you can achieve. If no profit is possible, return 0.
 *
 * Example 1: prices = [7,1,5,3,6,4] → Output: 5 (buy day 1, sell day 4)
 * Example 2: prices = [7,6,4,3,1] → Output: 0 (no profitable transaction)
 *
 * Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 *
 * PATTERN: Track running minimum
 * HINT: Track the min price seen so far. At each step, check if selling today
 *       gives a better profit than your current best.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i :prices) {
            profit = Math.max(profit, i - min);
            min = Math.min(i, min);
        }
        return Math.max(profit, 0);
    }
}