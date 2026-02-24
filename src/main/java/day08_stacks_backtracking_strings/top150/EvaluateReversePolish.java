package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 150 - Evaluate Reverse Polish Notation
 * Difficulty: Medium | Source: TOP 150
 *
 * You are given an array of strings tokens that represents an arithmetic expression
 * in Reverse Polish Notation. Evaluate the expression and return an integer that
 * represents the value of the expression.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * Division between two integers truncates toward zero.
 * It is guaranteed the expression is always valid and will not cause division by zero.
 *
 * Example 1: tokens = ["2","1","+","3","*"] -> Output: 9  ((2+1)*3)
 * Example 2: tokens = ["4","13","5","/","+"] -> Output: 6  (4+(13/5))
 * Example 3: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 *            -> Output: 22
 *
 * Constraints:
 * - 1 <= tokens.length <= 10^4
 * - tokens[i] is either an operator or an integer in range [-200, 200]
 *
 * PATTERN: Stack evaluation
 * HINT: Iterate through tokens. If it's a number, push onto the stack. If it's an operator,
 *       pop two operands (b then a), compute a op b, and push the result. The final
 *       value on the stack is the answer.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class EvaluateReversePolish {

    public int evalRPN(String[] tokens) {
        // TODO: Implement your solution here
        return 0;
    }
}
