package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 162 - Find Peak Element
 * Difficulty: Medium | Source: Top 150
 *
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 *
 * You may imagine that nums[-1] = nums[n] = -infinity. In other words, an element
 * is always considered to be strictly greater than a neighbor that is outside the array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example 1: nums = [1,2,3,1] -> Output: 2
 * Example 2: nums = [1,2,1,3,5,6,4] -> Output: 5 (or 1)
 *
 * Constraints:
 * - 1 <= nums.length <= 1000
 * - -2^31 <= nums[i] <= 2^31 - 1
 * - nums[i] != nums[i + 1] for all valid i
 *
 * PATTERN: Binary Search on slope
 * HINT: If nums[mid] < nums[mid + 1], a peak exists to the right; move left = mid + 1.
 *       Otherwise, a peak exists to the left (including mid); move right = mid.
 *
 * TIME: O(log n) | SPACE: O(1)
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        // TODO: Implement
        return 0;
    }
}
