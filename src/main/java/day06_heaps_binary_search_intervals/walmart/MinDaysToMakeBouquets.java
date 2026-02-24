package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 1482 - Minimum Number of Days to Make m Bouquets
 * Difficulty: Medium | Source: Walmart
 *
 * You are given an integer array bloomDay, an integer m and an integer k.
 * You want to make m bouquets. To make a bouquet, you need to use k adjacent
 * flowers from the garden. The garden consists of n flowers, the ith flower
 * will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
 *
 * Return the minimum number of days you need to wait to be able to make m
 * bouquets from the garden. If it is impossible to make m bouquets return -1.
 *
 * Example 1: bloomDay = [1,10,3,10,2], m = 3, k = 1 -> Output: 3
 * Example 2: bloomDay = [1,10,3,10,2], m = 3, k = 2 -> Output: -1
 * Example 3: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3 -> Output: 12
 *
 * Constraints:
 * - bloomDay.length == n
 * - 1 <= n <= 10^5
 * - 1 <= bloomDay[i] <= 10^9
 * - 1 <= m <= 10^6
 * - 1 <= k <= n
 *
 * PATTERN: Binary Search on answer (days)
 * HINT: Binary search on the number of days. For a given day, count how many
 *       bouquets of k adjacent bloomed flowers can be made. If >= m, search lower.
 *
 * TIME: O(n log(max(bloomDay))) | SPACE: O(1)
 */
public class MinDaysToMakeBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        // TODO: Implement
        return -1;
    }
}
