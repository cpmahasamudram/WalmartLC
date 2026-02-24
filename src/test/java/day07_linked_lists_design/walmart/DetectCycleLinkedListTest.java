package test.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.walmart.DetectCycleLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DetectCycleLinkedListTest {

    private final DetectCycleLinkedList solution = new DetectCycleLinkedList();

    @Test
    void hasCycle() {
        ListNode head = ListNode.of(3, 2, 0, -4);
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head.next; // -4 → 2
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void noCycle() {
        assertFalse(solution.hasCycle(ListNode.of(1, 2, 3)));
    }

    @Test
    void singleNodeNoCycle() {
        assertFalse(solution.hasCycle(ListNode.of(1)));
    }

    @Test
    void singleNodeWithCycle() {
        ListNode head = new ListNode(1);
        head.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void emptyList() {
        assertFalse(solution.hasCycle(null));
    }
}
