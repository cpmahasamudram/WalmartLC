package main.java.day10_hard_problems_mock.top150;

/**
 * LC 44 - Wildcard Matching
 * Difficulty: Hard | Source: Top 150
 *
 * Given an input string s and a pattern p, implement wildcard pattern matching with
 * support for '?' and '*' where:
 * - '?' Matches any single character.
 * - '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 *
 * Example 1: s = "aa", p = "a" -> Output: false
 * Example 2: s = "aa", p = "*" -> Output: true
 * Example 3: s = "cb", p = "?a" -> Output: false
 *
 * Constraints:
 * - 0 <= s.length, p.length <= 2000
 * - s contains only lowercase English letters
 * - p contains only lowercase English letters, '?', and '*'
 *
 * PATTERN: 2D Dynamic Programming with '?' and '*'
 * HINT: dp[i][j] = true if s[0..i-1] matches p[0..j-1]. For '*', either match zero chars
 *       (dp[i][j-1]) or match one more char (dp[i-1][j]). '?' matches any single char.
 *       Base: dp[0][0] = true, dp[0][j] = true only if p[0..j-1] are all '*'.
 *
 * TIME: O(m * n) | SPACE: O(m * n) where m = s.length, n = p.length
 */
public class WildcardMatching {

    public boolean isMatch(String s, String p) {
        if(s.equals(p)) return true;
        if(p.equals("*")) return  true;
        int si = 0, pi = 0;
        int sn = s.length(), pn = p.length();
        int star = -1;
        int match = -1;

        while(si< sn) {
            if(pi < pn && (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si))) {
                pi++;
                si++;
            } else if(pi < pn && p.charAt(pi) == '*') {
                star = pi;
                match = si;
                pi++;
            } else if(star != -1){
                pi = star + 1;
                match++;
                si = match;
            } else {
                return false;
            }
        }

        while(pi < pn && p.charAt(pi) == '*') {
            pi++;
        }

        return pi == pn;
    }
}
