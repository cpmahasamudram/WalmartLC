package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 435 - Non-overlapping Intervals
 * Difficulty: Medium | Source: Top 150
 *
 * Given an array of intervals where intervals[i] = [start_i, end_i],
 * return the minimum number of intervals you need to remove to make
 * the rest of the intervals non-overlapping.
 *
 * Example 1: intervals = [[1,2],[2,3],[3,4],[1,3]] -> Output: 1
 *            (Remove [1,3] to make the rest non-overlapping)
 * Example 2: intervals = [[1,2],[1,2],[1,2]] -> Output: 2
 * Example 3: intervals = [[1,2],[2,3]] -> Output: 0
 *
 * Constraints:
 * - 1 <= intervals.length <= 10^5
 * - intervals[i].length == 2
 * - -5 * 10^4 <= start_i < end_i <= 5 * 10^4
 *
 * PATTERN: Greedy - sort by end time, count overlaps
 * HINT: Sort intervals by end time. Greedily keep the interval that ends earliest.
 *       If the next interval starts before the current end, it must be removed.
 *
 * TIME: O(n log n) | SPACE: O(1)
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        // TODO: Implement
        return 0;
    }
}
