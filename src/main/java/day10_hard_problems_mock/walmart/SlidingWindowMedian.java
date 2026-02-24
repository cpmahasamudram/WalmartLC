package main.java.day10_hard_problems_mock.walmart;

/**
 * LC 480 - Sliding Window Median
 * Difficulty: Hard | Source: WALMART
 *
 * The median is the middle value in an ordered integer list. If the size is even,
 * the median is the average of the two middle values.
 *
 * Given an array nums and an integer k, return an array of the median of each window
 * of size k moving from left to right across the array.
 *
 * Example 1: nums = [1,3,-1,-3,5,3,6,7], k = 3 -> Output: [1.0,-1.0,-1.0,3.0,5.0,6.0]
 * Example 2: nums = [1,2,3,4,2,3,1,4,2], k = 3 -> Output: [2.0,3.0,3.0,3.0,2.0,3.0,2.0]
 *
 * Constraints:
 * - 1 <= k <= nums.length <= 10^5
 * - -2^31 <= nums[i] <= 2^31 - 1
 *
 * PATTERN: Two Heaps (max-heap + min-heap) with Lazy Deletion
 * HINT: Maintain a max-heap for the lower half and a min-heap for the upper half (like Find
 *       Median from Data Stream). When the window slides, use lazy deletion: mark elements
 *       to remove but only physically remove them when they appear at the top of a heap.
 *       Rebalance heaps after each add/remove to keep sizes within 1 of each other.
 *
 * TIME: O(n * log k) | SPACE: O(k)
 */
public class SlidingWindowMedian {

    public double[] medianSlidingWindow(int[] nums, int k) {
        // TODO: Implement your solution here
        return new double[0];
    }
}
