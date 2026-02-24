package main.java.day10_hard_problems_mock.top150;

/**
 * LC 32 - Longest Valid Parentheses
 * Difficulty: Hard | Source: Top 150
 *
 * Given a string containing just the characters '(' and ')', return the length of the
 * longest valid (well-formed) parentheses substring.
 *
 * Example 1: s = "(()" -> Output: 2   (the longest valid parentheses substring is "()")
 * Example 2: s = ")()())" -> Output: 4 (the longest valid parentheses substring is "()()")
 * Example 3: s = "" -> Output: 0
 *
 * Constraints:
 * - 0 <= s.length <= 3 * 10^4
 * - s[i] is '(' or ')'
 *
 * PATTERN: Stack or DP
 * HINT: Stack approach: push -1 as base, then for '(' push index, for ')' pop and if stack
 *       is empty push current index as new base, otherwise max = max(max, i - stack.peek()).
 *       DP approach: dp[i] = length of longest valid ending at i. Only update when s[i]=')'.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        // TODO: Implement your solution here
        return 0;
    }
}
