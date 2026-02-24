package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 338 - Counting Bits
 * Difficulty: Easy | Source: Top 150
 *
 * Given an integer n, return an array ans of length n + 1 such that for each i
 * (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 *
 * Example 1: n = 2 -> [0, 1, 1]
 *   Explanation: 0 -> 0, 1 -> 1, 2 -> 10
 * Example 2: n = 5 -> [0, 1, 1, 2, 1, 2]
 *   Explanation: 0->0, 1->1, 2->10, 3->11, 4->100, 5->101
 *
 * Constraints:
 * - 0 <= n <= 10^5
 *
 * PATTERN: Dynamic Programming + Bit Manipulation
 * HINT: dp[i] = dp[i >> 1] + (i & 1). Right-shifting i by 1 gives a smaller number
 *       whose bit count is already computed. Add 1 if the last bit of i is set.
 *       This builds the answer array in O(n) time without counting bits individually.
 *
 * TIME: O(n) | SPACE: O(n) for the output array
 */
public class CountingBits {
    public int[] countBits(int n) {
        // TODO: Implement dp[i] = dp[i >> 1] + (i & 1)
        return new int[0];
    }
}
