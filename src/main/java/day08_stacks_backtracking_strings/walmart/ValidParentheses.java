package main.java.day08_stacks_backtracking_strings.walmart;

/**
 * LC 20 - Valid Parentheses
 * Difficulty: Easy | Source: WALMART
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1: s = "()" -> Output: true
 * Example 2: s = "()[]{}" -> Output: true
 * Example 3: s = "(]" -> Output: false
 * Example 4: s = "([])" -> Output: true
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of parentheses only '()[]{}'
 *
 * PATTERN: Stack matching brackets
 * HINT: Push opening brackets onto a stack. For each closing bracket, check if the top
 *       of the stack is the matching opening bracket. If not, return false. At the end,
 *       the stack must be empty.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        // TODO: Implement your solution here
        return false;
    }
}
