package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 225 - Implement Stack using Queues
 * Difficulty: Easy | Source: TOP 150
 *
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented
 * stack should support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 * - void push(int x) pushes element x to the top of the stack.
 * - int pop() removes the element on the top of the stack and returns it.
 * - int top() returns the element on the top of the stack.
 * - boolean empty() returns true if the stack is empty, false otherwise.
 *
 * You must use only standard queue operations (push to back, peek/pop from front, size,
 * and is empty).
 *
 * Example:
 *   MyStack myStack = new MyStack();
 *   myStack.push(1); myStack.push(2);
 *   myStack.top();   -> 2
 *   myStack.pop();   -> 2
 *   myStack.empty(); -> false
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top, and empty
 * - All calls to pop and top are valid
 *
 * PATTERN: One or two queues
 * HINT: Use a single queue. On push, add the element then rotate all previous elements
 *       behind it by polling and re-offering (size-1 times). This makes push O(n) but
 *       pop and top O(1).
 *
 * TIME: O(n) push, O(1) pop/top | SPACE: O(n)
 */
public class ImplementStackUsingQueues {

    public ImplementStackUsingQueues() {
        // TODO: Implement
    }

    public void push(int x) {
        // TODO: Implement
    }

    public int pop() {
        // TODO: Implement
        return 0;
    }

    public int top() {
        // TODO: Implement
        return 0;
    }

    public boolean empty() {
        // TODO: Implement
        return true;
    }
}
