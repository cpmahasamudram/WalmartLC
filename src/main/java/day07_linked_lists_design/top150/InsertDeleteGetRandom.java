package main.java.day07_linked_lists_design.top150;

/**
 * LC 380 - Insert Delete GetRandom O(1)
 * Difficulty: Medium | Source: Top 150
 *
 * Implement the RandomizedSet class:
 * - bool insert(int val): Insert if not present. Return true if inserted.
 * - bool remove(int val): Remove if present. Return true if removed.
 * - int getRandom(): Return a random element. Each element must have equal probability.
 *
 * All operations must work in average O(1) time.
 *
 * Example:
 *   insert(1) → true; remove(2) → false; insert(2) → true;
 *   getRandom() → 1 or 2; remove(1) → true; insert(2) → false;
 *   getRandom() → 2
 *
 * Constraints:
 * - -2^31 <= val <= 2^31 - 1
 * - At most 2 * 10^5 calls
 * - There will be at least one element when getRandom is called
 *
 * PATTERN: ArrayList + HashMap (val → index)
 * HINT: Insert at end of list. Remove by swapping target with last element, then removing last.
 *       Map tracks each value's index for O(1) lookup.
 *
 * TIME: O(1) average all ops | SPACE: O(n)
 */
public class InsertDeleteGetRandom {

    public InsertDeleteGetRandom() {
        // TODO: Implement
    }

    public boolean insert(int val) {
        // TODO: Implement
        return false;
    }

    public boolean remove(int val) {
        // TODO: Implement
        return false;
    }

    public int getRandom() {
        // TODO: Implement
        return 0;
    }
}
