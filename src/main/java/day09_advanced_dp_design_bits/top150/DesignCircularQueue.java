package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 622 - Design Circular Queue
 * Difficulty: Medium | Source: Top 150
 *
 * Design your implementation of the circular queue. The circular queue is a
 * linear data structure in which the operations are performed based on FIFO
 * principle, and the last position is connected back to the first position
 * to make a circle.
 *
 * Implement the MyCircularQueue class:
 * - MyCircularQueue(int k) Initializes the object with the size of the queue to be k.
 * - boolean enQueue(int value) Inserts an element into the circular queue. Return true if successful.
 * - boolean deQueue() Deletes an element from the circular queue. Return true if successful.
 * - int Front() Gets the front item. If empty, return -1.
 * - int Rear() Gets the last item. If empty, return -1.
 * - boolean isEmpty() Checks whether the circular queue is empty.
 * - boolean isFull() Checks whether the circular queue is full.
 *
 * Example:
 *   MyCircularQueue cq = new MyCircularQueue(3);
 *   cq.enQueue(1); -> true
 *   cq.enQueue(2); -> true
 *   cq.enQueue(3); -> true
 *   cq.enQueue(4); -> false (full)
 *   cq.Rear();     -> 3
 *   cq.isFull();   -> true
 *   cq.deQueue();  -> true
 *   cq.enQueue(4); -> true
 *   cq.Rear();     -> 4
 *
 * Constraints:
 * - 1 <= k <= 1000
 * - 0 <= value <= 1000
 * - At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, isFull.
 *
 * PATTERN: Array with front/rear pointers
 * HINT: Use an array of size k, front pointer, and a count variable.
 *       rear = (front + count - 1) % k. enQueue at (front + count) % k.
 *       deQueue by advancing front = (front + 1) % k. Use count to track size.
 *
 * TIME: O(1) per operation | SPACE: O(k)
 */
public class DesignCircularQueue {

    public DesignCircularQueue(int k) {
        // TODO: Implement - initialize array and pointers
    }

    public boolean enQueue(int value) {
        // TODO: Implement - insert at rear, return false if full
        return false;
    }

    public boolean deQueue() {
        // TODO: Implement - remove from front, return false if empty
        return false;
    }

    public int Front() {
        // TODO: Implement - return front element or -1 if empty
        return -1;
    }

    public int Rear() {
        // TODO: Implement - return rear element or -1 if empty
        return -1;
    }

    public boolean isEmpty() {
        // TODO: Implement - return true if count == 0
        return true;
    }

    public boolean isFull() {
        // TODO: Implement - return true if count == capacity
        return false;
    }
}
