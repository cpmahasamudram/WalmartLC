package test.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.top150.RemoveNthNodeFromEnd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndTest {

    private final RemoveNthNodeFromEnd solution = new RemoveNthNodeFromEnd();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{1, 2, 3, 5},
                ListNode.toArray(solution.removeNthFromEnd(ListNode.of(1, 2, 3, 4, 5), 2)));
    }

    @Test
    void removeOnlyNode() {
        assertNull(solution.removeNthFromEnd(ListNode.of(1), 1));
    }

    @Test
    void removeFirst() {
        assertArrayEquals(new int[]{1},
                ListNode.toArray(solution.removeNthFromEnd(ListNode.of(1, 2), 1)));
    }

    @Test
    void removeHead() {
        assertArrayEquals(new int[]{2},
                ListNode.toArray(solution.removeNthFromEnd(ListNode.of(1, 2), 2)));
    }

    @Test
    void removeLast() {
        assertArrayEquals(new int[]{1, 2, 3, 4},
                ListNode.toArray(solution.removeNthFromEnd(ListNode.of(1, 2, 3, 4, 5), 1)));
    }
}
