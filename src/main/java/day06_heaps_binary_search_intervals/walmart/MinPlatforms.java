package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * GFG - Minimum Platforms
 * Difficulty: Medium | Source: Walmart (GeeksforGeeks)
 *
 * Given arrival and departure times of all trains that reach a railway station,
 * find the minimum number of platforms required for the railway station so that
 * no train is kept waiting.
 *
 * Consider that all the trains arrive on the same day and leave on the same day.
 * Arrival and departure times can never be the same for a train, but we can have
 * arrival time of one train equal to departure time of another.
 *
 * Example 1: arr = [900, 940, 950, 1100, 1500, 1800],
 *            dep = [910, 1200, 1120, 1130, 1900, 2000] -> Output: 3
 * Example 2: arr = [900, 1100, 1235], dep = [1000, 1200, 1240] -> Output: 1
 *
 * Constraints:
 * - 1 <= n <= 50000
 * - 0000 <= arr[i], dep[i] <= 2359
 *
 * PATTERN: Sort arrivals and departures separately, sweep line
 * HINT: Sort both arrays. Use two pointers: if next event is arrival, increment
 *       platform count; if departure, decrement. Track the maximum.
 *
 * TIME: O(n log n) | SPACE: O(1)
 */
public class MinPlatforms {
    public int findPlatform(int[] arr, int[] dep) {
        // TODO: Implement
        return 0;
    }
}
