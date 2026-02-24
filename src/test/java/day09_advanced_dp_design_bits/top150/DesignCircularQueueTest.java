package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.DesignCircularQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignCircularQueueTest {

    @Test
    void basicEnqueueDequeue() {
        DesignCircularQueue cq = new DesignCircularQueue(3);
        assertTrue(cq.enQueue(1));
        assertTrue(cq.enQueue(2));
        assertTrue(cq.enQueue(3));
        assertFalse(cq.enQueue(4));
        assertEquals(3, cq.Rear());
        assertTrue(cq.isFull());
    }

    @Test
    void dequeueAndReenqueue() {
        DesignCircularQueue cq = new DesignCircularQueue(3);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        assertTrue(cq.deQueue());
        assertTrue(cq.enQueue(4));
        assertEquals(4, cq.Rear());
    }

    @Test
    void frontAndRear() {
        DesignCircularQueue cq = new DesignCircularQueue(3);
        assertEquals(-1, cq.Front());
        assertEquals(-1, cq.Rear());
        cq.enQueue(10);
        assertEquals(10, cq.Front());
        assertEquals(10, cq.Rear());
        cq.enQueue(20);
        assertEquals(10, cq.Front());
        assertEquals(20, cq.Rear());
    }

    @Test
    void emptyQueueOperations() {
        DesignCircularQueue cq = new DesignCircularQueue(2);
        assertTrue(cq.isEmpty());
        assertFalse(cq.deQueue());
        assertEquals(-1, cq.Front());
        assertEquals(-1, cq.Rear());
    }

    @Test
    void wrapAround() {
        DesignCircularQueue cq = new DesignCircularQueue(3);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.deQueue();
        cq.deQueue();
        cq.enQueue(4);
        cq.enQueue(5);
        assertEquals(3, cq.Front());
        assertEquals(5, cq.Rear());
    }

    @Test
    void capacityOne() {
        DesignCircularQueue cq = new DesignCircularQueue(1);
        assertTrue(cq.enQueue(7));
        assertTrue(cq.isFull());
        assertFalse(cq.enQueue(8));
        assertEquals(7, cq.Front());
        assertTrue(cq.deQueue());
        assertTrue(cq.isEmpty());
    }
}
