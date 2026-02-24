package main.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;

/**
 * LC 141 - Linked List Cycle
 * Difficulty: Easy | Source: WALMART
 *
 * Given head, determine if the linked list has a cycle in it.
 * A cycle exists if some node can be reached again by continuously following next.
 *
 * Example 1: head = [3,2,0,-4], pos = 1 → Output: true
 * Example 2: head = [1,2], pos = 0 → Output: true
 * Example 3: head = [1], pos = -1 → Output: false
 *
 * Constraints:
 * - 0 <= number of nodes <= 10^4
 * - -10^5 <= Node.val <= 10^5
 *
 * PATTERN: Floyd's Cycle Detection (slow/fast pointers)
 * HINT: slow moves 1 step, fast moves 2 steps. If they meet, there's a cycle.
 *       If fast reaches null, no cycle.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class DetectCycleLinkedList {

    public boolean hasCycle(ListNode head) {
        // TODO: Implement your solution here
        return false;
    }
}
