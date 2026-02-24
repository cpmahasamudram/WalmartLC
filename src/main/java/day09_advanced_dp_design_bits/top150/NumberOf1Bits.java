package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 191 - Number of 1 Bits
 * Difficulty: Easy | Source: Top 150
 *
 * Write a function that takes the binary representation of a positive integer
 * and returns the number of set bits it has (also known as the Hamming weight).
 *
 * Example 1: n = 11 (binary: 1011) -> 3
 * Example 2: n = 128 (binary: 10000000) -> 1
 * Example 3: n = 2147483645 (binary: 1111111111111111111111111111101) -> 30
 *
 * Constraints:
 * - 1 <= n <= 2^31 - 1
 *
 * PATTERN: Bit Manipulation - Brian Kernighan's Algorithm
 * HINT: Use n & (n - 1) to clear the lowest set bit. Count how many times you
 *       can do this before n becomes 0. Each operation removes exactly one set bit.
 *       Alternatively, check each bit with n & 1 and right-shift.
 *
 * TIME: O(k) where k = number of set bits (at most 32) | SPACE: O(1)
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        // TODO: Implement using n & (n-1) trick to count set bits
        return 0;
    }
}
