package main.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;

/**
 * LC 19 - Remove Nth Node From End of List
 * Difficulty: Medium | Source: Top 150
 *
 * Given the head of a linked list, remove the nth node from the end and return the head.
 *
 * Example 1: head = [1,2,3,4,5], n = 2 → Output: [1,2,3,5]
 * Example 2: head = [1], n = 1 → Output: []
 * Example 3: head = [1,2], n = 1 → Output: [1]
 *
 * Constraints:
 * - 1 <= number of nodes <= 30
 * - 0 <= Node.val <= 100
 * - 1 <= n <= number of nodes
 *
 * PATTERN: Two pointers with gap of n
 * HINT: Advance fast pointer n steps ahead. Then move both until fast reaches end.
 *       Slow is now at the node before the target. Use a dummy head to handle removing the first node.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: Implement your solution here
        return null;
    }
}
