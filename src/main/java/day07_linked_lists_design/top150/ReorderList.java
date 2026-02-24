package main.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;

/**
 * LC 143 - Reorder List
 * Difficulty: Medium | Source: Top 150
 *
 * Given head of a singly linked list: L0 → L1 → ... → Ln-1 → Ln,
 * reorder it to: L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...
 * Do not modify node values, only rearrange nodes.
 *
 * Example 1: [1,2,3,4] → [1,4,2,3]
 * Example 2: [1,2,3,4,5] → [1,5,2,4,3]
 *
 * Constraints:
 * - 1 <= number of nodes <= 5 * 10^4
 * - 1 <= Node.val <= 1000
 *
 * PATTERN: Find middle + Reverse second half + Merge
 * HINT: 1) Find middle with slow/fast. 2) Reverse the second half.
 *       3) Merge the two halves by interleaving.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        // TODO: Implement your solution here
    }
}
