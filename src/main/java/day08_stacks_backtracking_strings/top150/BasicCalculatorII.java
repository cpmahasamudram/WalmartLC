package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 227 - Basic Calculator II
 * Difficulty: Medium | Source: TOP 150
 *
 * Given a string s which represents an expression, evaluate this expression and return
 * its value. The integer division should truncate toward zero.
 *
 * You may assume that the given expression is always valid. All intermediate results
 * will be in the range of [-2^31, 2^31 - 1].
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as
 * mathematical expressions, such as eval().
 *
 * Example 1: s = "3+2*2" -> Output: 7
 * Example 2: s = " 3/2 " -> Output: 1
 * Example 3: s = " 3+5 / 2 " -> Output: 5
 *
 * Constraints:
 * - 1 <= s.length <= 3 * 10^5
 * - s consists of integers and operators ('+', '-', '*', '/') separated by spaces
 * - s represents a valid expression
 * - All integers in the expression are non-negative and fit in a 32-bit integer
 *
 * PATTERN: Stack with operator precedence
 * HINT: Track the previous operator. For + and -, push the number (negated for -) onto
 *       the stack. For * and /, pop the top and compute immediately, then push the result.
 *       At the end, sum all values in the stack.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class BasicCalculatorII {

    public int calculate(String s) {
        // TODO: Implement your solution here
        return 0;
    }
}
