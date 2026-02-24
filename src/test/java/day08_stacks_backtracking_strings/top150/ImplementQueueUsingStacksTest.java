package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.ImplementQueueUsingStacks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {

    @Test
    void basicOperations() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
    }

    @Test
    void emptyCheck() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        assertTrue(queue.empty());
        queue.push(1);
        assertFalse(queue.empty());
    }

    @Test
    void fifoOrder() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
    }

    @Test
    void peekDoesNotRemove() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(5);
        assertEquals(5, queue.peek());
        assertEquals(5, queue.peek());
        assertFalse(queue.empty());
    }

    @Test
    void interleavedPushPop() {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());
        queue.push(3);
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
    }
}
