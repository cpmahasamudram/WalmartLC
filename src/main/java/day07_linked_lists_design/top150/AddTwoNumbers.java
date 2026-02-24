package main.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;

/**
 * LC 2 - Add Two Numbers
 * Difficulty: Medium | Source: Top 150
 *
 * Given two non-empty linked lists representing two non-negative integers
 * (digits stored in reverse order), add them and return the sum as a linked list.
 *
 * Example 1: l1 = [2,4,3], l2 = [5,6,4] → Output: [7,0,8] (342 + 465 = 807)
 * Example 2: l1 = [0], l2 = [0] → Output: [0]
 * Example 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] → Output: [8,9,9,9,0,0,0,1]
 *
 * Constraints:
 * - 1 <= number of nodes <= 100
 * - 0 <= Node.val <= 9
 * - No leading zeros (except the number 0 itself)
 *
 * PATTERN: Linked list traversal with carry
 * HINT: Traverse both lists simultaneously, sum digits + carry. Create new node
 *       with sum % 10, carry = sum / 10. Don't forget the final carry.
 *
 * TIME: O(max(m, n)) | SPACE: O(max(m, n))
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // TODO: Implement your solution here
        return null;
    }
}
