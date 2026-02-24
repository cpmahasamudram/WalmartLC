package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 232 - Implement Queue using Stacks
 * Difficulty: Easy | Source: TOP 150
 *
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented
 * queue should support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 * - void push(int x) pushes element x to the back of the queue.
 * - int pop() removes the element from the front of the queue and returns it.
 * - int peek() returns the element at the front of the queue.
 * - boolean empty() returns true if the queue is empty, false otherwise.
 *
 * You must use only standard stack operations (push to top, peek/pop from top, size,
 * and is empty).
 *
 * Example:
 *   MyQueue myQueue = new MyQueue();
 *   myQueue.push(1); myQueue.push(2);
 *   myQueue.peek();  -> 1
 *   myQueue.pop();   -> 1
 *   myQueue.empty(); -> false
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, peek, and empty
 * - All calls to pop and peek are valid
 *
 * PATTERN: Two stacks (lazy transfer)
 * HINT: Use an input stack and an output stack. Push always goes to input. For pop/peek,
 *       if output is empty, transfer all elements from input to output (reversing order).
 *       This gives amortized O(1) per operation.
 *
 * TIME: O(1) amortized per operation | SPACE: O(n)
 */
public class ImplementQueueUsingStacks {

    public ImplementQueueUsingStacks() {
        // TODO: Implement
    }

    public void push(int x) {
        // TODO: Implement
    }

    public int pop() {
        // TODO: Implement
        return 0;
    }

    public int peek() {
        // TODO: Implement
        return 0;
    }

    public boolean empty() {
        // TODO: Implement
        return true;
    }
}
