package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 155 - Min Stack
 * Difficulty: Medium | Source: TOP 150
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element
 * in constant time.
 *
 * Implement the MinStack class:
 * - MinStack() initializes the stack object.
 * - void push(int val) pushes the element val onto the stack.
 * - void pop() removes the element on the top of the stack.
 * - int top() gets the top element of the stack.
 * - int getMin() retrieves the minimum element in the stack.
 *
 * You must implement a solution with O(1) time complexity for each function.
 *
 * Example:
 *   MinStack minStack = new MinStack();
 *   minStack.push(-2); minStack.push(0); minStack.push(-3);
 *   minStack.getMin(); -> -3
 *   minStack.pop();
 *   minStack.top();    -> 0
 *   minStack.getMin(); -> -2
 *
 * Constraints:
 * - -2^31 <= val <= 2^31 - 1
 * - Methods pop, top and getMin will always be called on non-empty stacks
 * - At most 3 * 10^4 calls will be made to push, pop, top, and getMin
 *
 * PATTERN: Two stacks or stack of pairs
 * HINT: Maintain a second stack that tracks the current minimum. On push, push the
 *       new min (min of val and current min) onto the min stack. On pop, pop from both.
 *       getMin simply peeks the min stack.
 *
 * TIME: O(1) per operation | SPACE: O(n)
 */
public class MinStack {

    public MinStack() {
        // TODO: Implement
    }

    public void push(int val) {
        // TODO: Implement
    }

    public void pop() {
        // TODO: Implement
    }

    public int top() {
        // TODO: Implement
        return 0;
    }

    public int getMin() {
        // TODO: Implement
        return 0;
    }
}
