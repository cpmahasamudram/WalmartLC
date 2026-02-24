package main.java.day10_hard_problems_mock.top150;

/**
 * LC 190 - Reverse Bits
 * Difficulty: Easy | Source: Top 150
 *
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example 1: n = 00000010100101000001111010011100 (43261596)
 *   -> Output: 00111001011110000010100101000000 (964176192)
 * Example 2: n = 11111111111111111111111111111101 (4294967293)
 *   -> Output: 10111111111111111111111111111111 (3221225471)
 *
 * Constraints:
 * - The input must be a binary string of length 32
 *
 * PATTERN: Bit Manipulation
 * HINT: Iterate 32 times. Each iteration, shift result left by 1, extract the last bit of n
 *       with (n & 1), OR it into result, then shift n right by 1. This builds the reversed
 *       number bit by bit from LSB to MSB.
 *
 * TIME: O(1) (always 32 iterations) | SPACE: O(1)
 */
public class ReverseBits {

    public int reverseBits(int n) {
        // TODO: Implement your solution here
        return 0;
    }
}
