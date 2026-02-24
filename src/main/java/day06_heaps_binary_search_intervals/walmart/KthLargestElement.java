package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 215 - Kth Largest Element in an Array
 * Difficulty: Medium | Source: Walmart
 *
 * Given an integer array nums and an integer k, return the kth largest
 * element in the array. Note that it is the kth largest element in the
 * sorted order, not the kth distinct element.
 *
 * Can you solve it without sorting?
 *
 * Example 1: nums = [3,2,1,5,6,4], k = 2 -> Output: 5
 * Example 2: nums = [3,2,3,1,2,4,5,5,6], k = 4 -> Output: 4
 *
 * Constraints:
 * - 1 <= k <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 *
 * PATTERN: Quickselect or Min-Heap of size k
 * HINT: Maintain a min-heap of size k. The top of the heap is the kth largest.
 *       Alternatively, use quickselect to partition around the kth largest in O(n) average.
 *
 * TIME: O(n) average with quickselect, O(n log k) with heap | SPACE: O(k) with heap, O(1) with quickselect
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        // TODO: Implement
        return 0;
    }
}
