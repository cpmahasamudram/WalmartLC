package main.java.day10_hard_problems_mock.top150;

/**
 * LC 10 - Regular Expression Matching
 * Difficulty: Hard | Source: Top 150
 *
 * Given an input string s and a pattern p, implement regular expression matching with
 * support for '.' and '*' where:
 * - '.' Matches any single character.
 * - '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * Example 1: s = "aa", p = "a" -> Output: false
 * Example 2: s = "aa", p = "a*" -> Output: true
 * Example 3: s = "ab", p = ".*" -> Output: true
 *
 * Constraints:
 * - 1 <= s.length <= 20
 * - 1 <= p.length <= 20
 * - s contains only lowercase English letters
 * - p contains only lowercase English letters, '.', and '*'
 * - It is guaranteed for each '*', there will be a previous valid character to match
 *
 * PATTERN: 2D Dynamic Programming with '.' and '*'
 * HINT: dp[i][j] = true if s[0..i-1] matches p[0..j-1]. For '*', either use zero copies
 *       (dp[i][j-2]) or one+ copies if current char matches (dp[i-1][j]). '.' matches any
 *       single character. Build the table bottom-up with base case dp[0][0] = true.
 *
 * TIME: O(m * n) | SPACE: O(m * n) where m = s.length, n = p.length
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        // TODO: Implement your solution here
        return false;
    }
}
