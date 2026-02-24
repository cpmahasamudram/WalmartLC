package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 56 - Merge Intervals
 * Difficulty: Medium | Source: Walmart
 *
 * Given an array of intervals where intervals[i] = [start_i, end_i],
 * merge all overlapping intervals, and return an array of the non-overlapping
 * intervals that cover all the intervals in the input.
 *
 * Example 1: intervals = [[1,3],[2,6],[8,10],[15,18]] -> Output: [[1,6],[8,10],[15,18]]
 * Example 2: intervals = [[1,4],[4,5]] -> Output: [[1,5]]
 *
 * Constraints:
 * - 1 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= start_i <= end_i <= 10^4
 *
 * PATTERN: Sort by start, then merge overlapping intervals
 * HINT: Sort intervals by start time. Iterate and merge if current start <= previous end.
 *
 * TIME: O(n log n) | SPACE: O(n)
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // TODO: Implement
        return new int[0][0];
    }
}
