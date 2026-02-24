package main.java.day07_linked_lists_design.top150;

/**
 * LC 430 - Flatten a Multilevel Doubly Linked List
 * Difficulty: Medium | Source: Top 150
 *
 * Given the head of a multilevel doubly linked list where nodes may have a child pointer
 * to a separate doubly linked list. Flatten the list so all nodes appear in a single-level
 * doubly linked list. Child lists are inserted between the node and its next.
 *
 * Example 1: [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 *   → [1,2,3,7,8,11,12,9,10,4,5,6]
 * Example 2: [1,2,null,3] → [1,3,2]
 * Example 3: [] → []
 *
 * Constraints:
 * - Number of nodes <= 1000
 * - 1 <= Node.val <= 10^5
 *
 * PATTERN: Iterative or Recursive DFS
 * HINT: When you find a child, insert the child chain between curr and curr.next.
 *       Find the tail of the child chain, connect it to curr.next, then clear the child pointer.
 *
 * TIME: O(n) | SPACE: O(1) iterative, O(depth) recursive
 */
public class FlattenMultilevelDoublyLL {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        // TODO: Implement your solution here
        return null;
    }
}
