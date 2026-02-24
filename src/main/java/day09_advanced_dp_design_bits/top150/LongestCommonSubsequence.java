package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 1143 - Longest Common Subsequence
 * Difficulty: Medium | Source: Top 150
 *
 * Given two strings text1 and text2, return the length of their longest common
 * subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string
 * with some characters (can be none) deleted without changing the relative order
 * of the remaining characters.
 *
 * Example 1: text1 = "abcde", text2 = "ace" -> 3
 *   Explanation: The longest common subsequence is "ace" and its length is 3.
 * Example 2: text1 = "abc", text2 = "abc" -> 3
 * Example 3: text1 = "abc", text2 = "def" -> 0
 *
 * Constraints:
 * - 1 <= text1.length, text2.length <= 1000
 * - text1 and text2 consist of only lowercase English characters.
 *
 * PATTERN: 2D Dynamic Programming
 * HINT: dp[i][j] = LCS length for text1[0..i-1] and text2[0..j-1].
 *       If text1[i-1] == text2[j-1]: dp[i][j] = dp[i-1][j-1] + 1.
 *       Else: dp[i][j] = max(dp[i-1][j], dp[i][j-1]).
 *
 * TIME: O(m * n) where m, n = lengths of text1, text2 | SPACE: O(m * n), optimizable to O(min(m,n))
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // TODO: Implement 2D DP table comparing characters of text1 and text2
        return 0;
    }
}
