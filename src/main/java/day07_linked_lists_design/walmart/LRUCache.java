package main.java.day07_linked_lists_design.walmart;

/**
 * LC 146 - LRU Cache
 * Difficulty: Medium | Source: WALMART (★★★★★ WALMART FAV)
 *
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement LRUCache(int capacity), int get(int key), void put(int key, int value).
 * - get: Return value if key exists, else -1. Mark as recently used.
 * - put: Update or insert. If at capacity, evict the least recently used key first.
 *
 * Both operations must run in O(1) average time.
 *
 * Example:
 *   LRUCache cache = new LRUCache(2);
 *   cache.put(1, 1); cache.put(2, 2);
 *   cache.get(1);    → 1
 *   cache.put(3, 3); → evicts key 2
 *   cache.get(2);    → -1
 *
 * Constraints:
 * - 1 <= capacity <= 3000
 * - 0 <= key <= 10^4
 * - 0 <= value <= 10^5
 * - At most 2 * 10^5 calls to get and put
 *
 * PATTERN: HashMap + Doubly Linked List
 * HINT: Map stores key → node. DLL tracks usage order (head = most recent, tail = least).
 *       get: move node to head. put: add to head, if over capacity remove from tail.
 *
 * TIME: O(1) get/put | SPACE: O(capacity)
 */
public class LRUCache {
    class Node {
        int value;
        int key;

        Node next;
        Node prev;
    }

    public LRUCache(int capacity) {
        // TODO: Implement
    }

    public int get(int key) {
        // TODO: Implement
        return -1;
    }

    public void put(int key, int value) {
        // TODO: Implement
    }
}
