package main.java.day07_linked_lists_design.walmart;

/**
 * LC 138 - Copy List with Random Pointer
 * Difficulty: Medium | Source: WALMART
 *
 * A linked list of length n where each node has an additional random pointer
 * that could point to any node or null. Construct a deep copy of the list.
 *
 * Example 1: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 *   → Output: deep copy of the same structure
 * Example 2: head = [[1,1],[2,1]] → Output: deep copy
 * Example 3: head = [[3,null],[3,0],[3,null]] → Output: deep copy
 *
 * Constraints:
 * - 0 <= n <= 1000
 * - -10^4 <= Node.val <= 10^4
 * - random is null or points to a node in the list
 *
 * PATTERN: HashMap (old → new) OR interleave nodes
 * HINT (Map): Pass 1: create new nodes, map old→new. Pass 2: wire next and random.
 * HINT (O(1) space): Interleave cloned nodes (A→A'→B→B'→...), set randoms, then separate.
 *
 * TIME: O(n) | SPACE: O(n) with map, O(1) with interleave
 */
public class CopyListRandomPointer {

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {
        // TODO: Implement your solution here
        return null;
    }
}
