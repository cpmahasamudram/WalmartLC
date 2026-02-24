package test.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.top150.MergeTwoSortedLists;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4},
                ListNode.toArray(solution.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4))));
    }

    @Test
    void bothEmpty() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void oneEmpty() {
        assertArrayEquals(new int[]{0},
                ListNode.toArray(solution.mergeTwoLists(null, ListNode.of(0))));
    }

    @Test
    void differentLengths() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                ListNode.toArray(solution.mergeTwoLists(ListNode.of(1, 3, 5), ListNode.of(2, 4))));
    }

    @Test
    void oneBeforeOther() {
        assertArrayEquals(new int[]{1, 2, 3, 4},
                ListNode.toArray(solution.mergeTwoLists(ListNode.of(1, 2), ListNode.of(3, 4))));
    }
}
