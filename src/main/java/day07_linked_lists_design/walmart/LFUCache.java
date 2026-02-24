package main.java.day07_linked_lists_design.walmart;

/**
 * LC 460 - LFU Cache
 * Difficulty: Hard | Source: WALMART
 *
 * Design a data structure for a Least Frequently Used (LFU) cache.
 *
 * Implement LFUCache(int capacity), int get(int key), void put(int key, int value).
 * - get: Return value if key exists (increment frequency), else -1.
 * - put: Update or insert. If at capacity, evict the least frequently used key.
 *        If tie in frequency, evict the least recently used among them.
 *
 * Both operations must run in O(1) average time.
 *
 * Example:
 *   LFUCache cache = new LFUCache(2);
 *   cache.put(1, 1); cache.put(2, 2);
 *   cache.get(1);    → 1 (freq of key 1 becomes 2)
 *   cache.put(3, 3); → evicts key 2 (freq 1, least recent among freq-1 keys)
 *   cache.get(2);    → -1
 *   cache.get(3);    → 3
 *
 * Constraints:
 * - 1 <= capacity <= 10^4
 * - 0 <= key <= 10^5
 * - 0 <= value <= 10^9
 * - At most 2 * 10^5 calls to get and put
 *
 * PATTERN: HashMap + freq → DLL bucket map
 * HINT: Map key→node, map freq→DLL. Track minFreq. On access, move node from
 *       freq bucket to freq+1 bucket. On eviction, remove tail of minFreq bucket.
 *
 * TIME: O(1) get/put | SPACE: O(capacity)
 */
public class LFUCache {

    public LFUCache(int capacity) {
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
