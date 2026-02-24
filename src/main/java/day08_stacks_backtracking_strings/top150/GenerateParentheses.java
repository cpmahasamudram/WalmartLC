package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 22 - Generate Parentheses
 * Difficulty: Medium | Source: TOP 150
 *
 * Given n pairs of parentheses, write a function to generate all combinations of
 * well-formed parentheses.
 *
 * Example 1: n = 3 -> Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2: n = 1 -> Output: ["()"]
 *
 * Constraints:
 * - 1 <= n <= 8
 *
 * PATTERN: Backtracking with open/close count
 * HINT: Track open and close counts. Add '(' if open < n. Add ')' if close < open.
 *       When the string length equals 2*n, add it to the result. This ensures only
 *       valid combinations are generated.
 *
 * TIME: O(4^n / sqrt(n)) - Catalan number | SPACE: O(n) recursion depth
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // TODO: Implement your solution here
        return null;
    }
}
