package test.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.walmart.MergeKSortedLists;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    private final MergeKSortedLists solution = new MergeKSortedLists();

    @Test
    void basicCase() {
        ListNode[] lists = {
                ListNode.of(1, 4, 5),
                ListNode.of(1, 3, 4),
                ListNode.of(2, 6)
        };
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6},
                ListNode.toArray(solution.mergeKLists(lists)));
    }

    @Test
    void emptyArray() {
        assertNull(solution.mergeKLists(new ListNode[]{}));
    }

    @Test
    void singleList() {
        ListNode[] lists = {ListNode.of(1, 2, 3)};
        assertArrayEquals(new int[]{1, 2, 3},
                ListNode.toArray(solution.mergeKLists(lists)));
    }

    @Test
    void allEmpty() {
        ListNode[] lists = {null, null};
        assertNull(solution.mergeKLists(lists));
    }

    @Test
    void twoLists() {
        ListNode[] lists = {ListNode.of(1, 3), ListNode.of(2, 4)};
        assertArrayEquals(new int[]{1, 2, 3, 4},
                ListNode.toArray(solution.mergeKLists(lists)));
    }
}
