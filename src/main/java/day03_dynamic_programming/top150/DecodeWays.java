package main.java.day03_dynamic_programming.top150;

/**
 * LC 91 - Decode Ways
 * Difficulty: Medium | Source: Top 150
 *
 * A message containing letters from A-Z can be encoded into numbers using
 * the following mapping: 'A' → "1", 'B' → "2", ..., 'Z' → "26".
 * To decode an encoded message, all the digits must be grouped then mapped
 * back into letters using the reverse of the mapping above. There may be
 * multiple ways to decode.
 *
 * Given a string s containing only digits, return the number of ways to decode it.
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 * Example 1: s = "12" → Output: 2
 *   Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
 * Example 2: s = "226" → Output: 3
 *   Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 * Example 3: s = "06" → Output: 0
 *   Explanation: "06" cannot be mapped to "F" because "6" != "06". Leading zeros are invalid.
 *
 * Constraints:
 * - 1 <= s.length <= 100
 * - s contains only digits and may contain leading zeros.
 *
 * PATTERN: 1D Dynamic Programming
 * HINT: dp[i] depends on whether s[i] is valid as a single digit (1-9) and whether
 *       s[i-1..i] forms a valid two-digit number (10-26).
 *       If s[i] != '0': dp[i] += dp[i-1]
 *       If s[i-1..i] in [10,26]: dp[i] += dp[i-2]
 *
 * TIME: O(n) | SPACE: O(1) with two variables, O(n) with dp array
 */
public class DecodeWays {
    public int numDecodings(String s) {
        // TODO: Implement DP based on 1-digit and 2-digit validity
        return 0;
    }
}
