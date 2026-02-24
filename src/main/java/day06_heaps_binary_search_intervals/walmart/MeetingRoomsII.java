package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 253 - Meeting Rooms II
 * Difficulty: Medium | Source: Walmart
 *
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...], find the minimum number of conference rooms required.
 *
 * Example 1: intervals = [[0,30],[5,10],[15,20]] -> Output: 2
 * Example 2: intervals = [[7,10],[2,4]] -> Output: 1
 *
 * Constraints:
 * - 1 <= intervals.length <= 10^4
 * - 0 <= start_i < end_i <= 10^6
 *
 * PATTERN: Min-Heap on end times or Sweep Line
 * HINT: Use a min-heap to track the earliest ending meeting. If the next meeting
 *       starts after the earliest end, reuse that room (poll); otherwise allocate a new room.
 *
 * TIME: O(n log n) | SPACE: O(n)
 */
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        // TODO: Implement
        return 0;
    }
}
