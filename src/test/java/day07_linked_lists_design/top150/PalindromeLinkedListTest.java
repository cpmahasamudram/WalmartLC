package test.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;
import main.java.day07_linked_lists_design.top150.PalindromeLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList solution = new PalindromeLinkedList();

    @Test
    void evenPalindrome() {
        assertTrue(solution.isPalindrome(ListNode.of(1, 2, 2, 1)));
    }

    @Test
    void oddPalindrome() {
        assertTrue(solution.isPalindrome(ListNode.of(1, 2, 1)));
    }

    @Test
    void notPalindrome() {
        assertFalse(solution.isPalindrome(ListNode.of(1, 2)));
    }

    @Test
    void singleNode() {
        assertTrue(solution.isPalindrome(ListNode.of(1)));
    }

    @Test
    void allSame() {
        assertTrue(solution.isPalindrome(ListNode.of(1, 1, 1, 1)));
    }
}
