package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.ImplementStackUsingQueues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementStackUsingQueuesTest {

    @Test
    void basicOperations() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
    }

    @Test
    void emptyCheck() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
    }

    @Test
    void lifoOrder() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void topDoesNotRemove() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(5);
        assertEquals(5, stack.top());
        assertEquals(5, stack.top());
        assertFalse(stack.empty());
    }

    @Test
    void interleavedPushPop() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
    }
}
