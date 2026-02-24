package main.java.day07_linked_lists_design.walmart;

import main.java.common.ListNode;

/**
 * LC 23 - Merge k Sorted Lists
 * Difficulty: Hard | Source: WALMART
 *
 * Given an array of k linked-lists, each sorted in ascending order,
 * merge all into one sorted linked-list and return it.
 *
 * Example 1: lists = [[1,4,5],[1,3,4],[2,6]] → Output: [1,1,2,3,4,4,5,6]
 * Example 2: lists = [] → Output: []
 * Example 3: lists = [[]] → Output: []
 *
 * Constraints:
 * - k == lists.length
 * - 0 <= k <= 10^4
 * - 0 <= lists[i].length <= 500
 * - -10^4 <= lists[i][j] <= 10^4
 * - lists[i] is sorted in ascending order
 * - Total nodes <= 10^4
 *
 * PATTERN: Min-Heap (PriorityQueue) or Divide & Conquer
 * HINT (Heap): Add all list heads to a min-heap. Pop smallest, add to result,
 *       push its next if exists. O(N log k).
 * HINT (D&C): Pair up lists and merge, halving count each round. O(N log k).
 *
 * TIME: O(N log k) | SPACE: O(k)
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        // TODO: Implement your solution here
        return null;
    }
}
