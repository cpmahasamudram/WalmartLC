package test.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.top150.AddTwoNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private final AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    void basicCase() {
        // 342 + 465 = 807
        assertArrayEquals(new int[]{7, 0, 8},
                ListNode.toArray(solution.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4))));
    }

    @Test
    void bothZero() {
        assertArrayEquals(new int[]{0},
                ListNode.toArray(solution.addTwoNumbers(ListNode.of(0), ListNode.of(0))));
    }

    @Test
    void differentLengths() {
        // 9999999 + 9999 = 10009998
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1},
                ListNode.toArray(solution.addTwoNumbers(
                        ListNode.of(9, 9, 9, 9, 9, 9, 9), ListNode.of(9, 9, 9, 9))));
    }

    @Test
    void carryAtEnd() {
        // 5 + 5 = 10
        assertArrayEquals(new int[]{0, 1},
                ListNode.toArray(solution.addTwoNumbers(ListNode.of(5), ListNode.of(5))));
    }

    @Test
    void noCarry() {
        assertArrayEquals(new int[]{3, 5, 7},
                ListNode.toArray(solution.addTwoNumbers(ListNode.of(1, 2, 3), ListNode.of(2, 3, 4))));
    }
}
