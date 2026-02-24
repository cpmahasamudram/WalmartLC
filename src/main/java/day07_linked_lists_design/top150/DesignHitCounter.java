package main.java.day07_linked_lists_design.top150;

/**
 * LC 362 - Design Hit Counter
 * Difficulty: Medium | Source: Top 150
 *
 * Design a hit counter which counts the number of hits received in the past 5 minutes
 * (300 seconds). Each function accepts a timestamp parameter (in seconds, chronological).
 *
 * Implement: void hit(int timestamp), int getHits(int timestamp).
 *
 * Example:
 *   hit(1); hit(2); hit(3);
 *   getHits(4)   → 3
 *   hit(300);
 *   getHits(300) → 4
 *   getHits(301) → 3
 *
 * Constraints:
 * - 1 <= timestamp <= 2 * 10^9
 * - Calls are made in chronological order
 * - At most 300 calls to hit and getHits
 *
 * PATTERN: Circular buffer (fixed array of size 300)
 * HINT: Use two arrays of size 300: times[i] and hits[i]. Index = timestamp % 300.
 *       If times[idx] != timestamp, reset. Else increment. getHits sums entries within window.
 *
 * TIME: O(1) hit, O(300) = O(1) getHits | SPACE: O(300) = O(1)
 */
public class DesignHitCounter {

    public DesignHitCounter() {
        // TODO: Implement
    }

    public void hit(int timestamp) {
        // TODO: Implement
    }

    public int getHits(int timestamp) {
        // TODO: Implement
        return 0;
    }
}
