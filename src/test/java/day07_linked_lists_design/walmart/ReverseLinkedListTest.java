package test.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.walmart.ReverseLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private final ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1},
                ListNode.toArray(solution.reverseList(ListNode.of(1, 2, 3, 4, 5))));
    }

    @Test
    void twoNodes() {
        assertArrayEquals(new int[]{2, 1},
                ListNode.toArray(solution.reverseList(ListNode.of(1, 2))));
    }

    @Test
    void singleNode() {
        assertArrayEquals(new int[]{1},
                ListNode.toArray(solution.reverseList(ListNode.of(1))));
    }

    @Test
    void emptyList() {
        assertNull(solution.reverseList(null));
    }
}
