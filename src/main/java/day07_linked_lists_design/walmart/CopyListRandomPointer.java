package main.java.day07_linked_lists_design.walmart;

import java.util.HashMap;
import java.util.Map;

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
    Map<Node, Node> visited = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        if(visited.containsKey(head)) {
            return visited.get(head);
        }
        Node cur = new Node(head.val);
        visited.put(head, cur);

        cur.next = copyRandomList(head.next);
        cur.random = copyRandomList(head.random);

        return cur;
    }

    /**
     * APPROACH 3: Interleave — O(1) space (Walmart follow-up)
     *
     * No HashMap. Three passes using the list structure itself as the mapping.
     *
     * PASS 1 — Interleave clones after each original:
     *   Before: A → B → C → null
     *   After:  A → A' → B → B' → C → C' → null
     *   Each original.next now points to its clone.
     *   This IS the "map" — given any original node, its clone is original.next.
     *
     * PASS 2 — Wire random pointers using the interleaved structure:
     *   A'.random = A.random.next
     *   Because A.random is the original node, and .next is its clone.
     *   e.g. if A.random → C, then A'.random → C.next → C'
     *
     * PASS 3 — Separate into two independent lists:
     *   Restore:  A → B → C → null        (original, untouched)
     *   Extract:  A' → B' → C' → null     (deep copy)
     *   Walk both lists in lockstep, rewiring .next for each.
     *
     * Example walkthrough:
     *   Original: 7 → 13 → 11    (7.random → 11, 13.random → 7)
     *
     *   Pass 1:   7 → 7' → 13 → 13' → 11 → 11' → null
     *   Pass 2:   7'.random = 7.random.next = 11.next = 11'  ✓
     *             13'.random = 13.random.next = 7.next = 7'   ✓
     *   Pass 3:   7 → 13 → 11         (original restored)
     *             7' → 13' → 11'      (deep copy returned)
     *
     * TIME: O(n) — three passes | SPACE: O(1) — no map, only pointer manipulation
     */
    public Node copyRandomListInterleave(Node head) {
        if (head == null) return null;

        // Pass 1: interleave — insert clone after each original
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        // Pass 2: wire random pointers
        cur = head;
        while (cur != null) {
            if (cur.random != null)
                cur.next.random = cur.random.next; // clone's random = original's random's clone
            cur = cur.next.next; // skip to next original
        }

        // Pass 3: separate the two interleaved lists
        cur = head;
        Node newHead = head.next;
        while (cur != null) {
            Node copy = cur.next;
            cur.next = copy.next;                                   // restore original's next
            copy.next = (copy.next != null) ? copy.next.next : null; // wire clone's next
            cur = cur.next;
        }

        return newHead;
    }
}
