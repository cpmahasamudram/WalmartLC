package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 57 - Insert Interval
 * Difficulty: Medium | Source: Top 150
 *
 * You are given an array of non-overlapping intervals where intervals[i] = [start_i, end_i]
 * represent the start and end of the ith interval and intervals is sorted in ascending order
 * by start_i. You are also given an interval newInterval = [start, end] that represents the
 * start and end of another interval.
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order
 * by start_i and intervals still does not have any overlapping intervals (merge overlapping
 * intervals if necessary). Return intervals after the insertion.
 *
 * Example 1: intervals = [[1,3],[6,9]], newInterval = [2,5] -> Output: [[1,5],[6,9]]
 * Example 2: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 *            -> Output: [[1,2],[3,10],[12,16]]
 *
 * Constraints:
 * - 0 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= start_i <= end_i <= 10^5
 * - intervals is sorted by start_i in ascending order
 * - newInterval.length == 2
 * - 0 <= start <= end <= 10^5
 *
 * PATTERN: Find overlap range and merge
 * HINT: Add all intervals that end before newInterval starts. Merge all overlapping intervals
 *       with newInterval. Add remaining intervals after the merged interval.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO: Implement
        return new int[0][0];
    }
}
