package test.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.top150.ReorderList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    private final ReorderList solution = new ReorderList();

    @Test
    void evenLength() {
        ListNode head = ListNode.of(1, 2, 3, 4);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 4, 2, 3}, ListNode.toArray(head));
    }

    @Test
    void oddLength() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 5, 2, 4, 3}, ListNode.toArray(head));
    }

    @Test
    void twoNodes() {
        ListNode head = ListNode.of(1, 2);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 2}, ListNode.toArray(head));
    }

    @Test
    void singleNode() {
        ListNode head = ListNode.of(1);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1}, ListNode.toArray(head));
    }
}
