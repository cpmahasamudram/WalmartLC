package main.java.day07_linked_lists_design.top150;

import main.java.common.ListNode;

/**
 * LC 21 - Merge Two Sorted Lists
 * Difficulty: Easy | Source: Top 150
 *
 * Merge two sorted linked lists and return it as a sorted list.
 *
 * Example 1: l1 = [1,2,4], l2 = [1,3,4] → Output: [1,1,2,3,4,4]
 * Example 2: l1 = [], l2 = [] → Output: []
 * Example 3: l1 = [], l2 = [0] → Output: [0]
 *
 * Constraints:
 * - 0 <= number of nodes in both lists <= 50
 * - -100 <= Node.val <= 100
 * - Both lists are sorted in non-decreasing order
 *
 * PATTERN: Dummy head + two-pointer merge
 * HINT: Use a dummy node. Compare heads of both lists, attach the smaller one,
 *       advance that pointer. Attach remaining tail when one list is exhausted.
 *
 * TIME: O(m + n) | SPACE: O(1)
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: Implement your solution here
        return null;
    }
}
