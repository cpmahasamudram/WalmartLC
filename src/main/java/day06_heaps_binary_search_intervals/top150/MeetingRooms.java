package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 252 - Meeting Rooms
 * Difficulty: Easy | Source: Top 150
 *
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i],
 * determine if a person could attend all meetings.
 *
 * Example 1: intervals = [[0,30],[5,10],[15,20]] -> Output: false
 * Example 2: intervals = [[7,10],[2,4]] -> Output: true
 *
 * Constraints:
 * - 0 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= start_i < end_i <= 10^6
 *
 * PATTERN: Sort by start, check for overlap
 * HINT: Sort intervals by start time. If any interval starts before the previous one ends,
 *       there is a conflict and the person cannot attend all meetings.
 *
 * TIME: O(n log n) | SPACE: O(1)
 */
public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        // TODO: Implement
        return false;
    }
}
