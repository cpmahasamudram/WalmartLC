package main.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;

/**
 * LC 206 - Reverse Linked List
 * Difficulty: Easy | Source: WALMART
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1: head = [1,2,3,4,5] → Output: [5,4,3,2,1]
 * Example 2: head = [1,2] → Output: [2,1]
 * Example 3: head = [] → Output: []
 *
 * Constraints:
 * - 0 <= number of nodes <= 5000
 * - -5000 <= Node.val <= 5000
 *
 * PATTERN: Iterative pointer reversal
 * HINT: Track prev, curr, next. At each step: save next, point curr.next to prev,
 *       advance prev and curr. Return prev when done.
 *
 * TIME: O(n) | SPACE: O(1) iterative, O(n) recursive
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // TODO: Implement your solution here
        return null;
    }
}
