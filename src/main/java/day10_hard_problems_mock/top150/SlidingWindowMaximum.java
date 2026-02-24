package main.java.day10_hard_problems_mock.top150;

/**
 * LC 239 - Sliding Window Maximum
 * Difficulty: Hard | Source: Top 150
 *
 * You are given an array of integers nums and a sliding window of size k which moves
 * from the very left to the very right. You can only see the k numbers in the window.
 * Each time the window moves right by one position, return the max in each window.
 *
 * Example 1: nums = [1,3,-1,-3,5,3,6,7], k = 3 -> Output: [3,3,5,5,6,7]
 * Example 2: nums = [1], k = 1 -> Output: [1]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 *
 * PATTERN: Monotonic Deque
 * HINT: Maintain a deque of indices in decreasing order of their values. When adding a new
 *       element, remove all indices from the back whose values are smaller. Remove indices
 *       from the front that are outside the window. The front of the deque is always the max.
 *
 * TIME: O(n) | SPACE: O(k)
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO: Implement your solution here
        return new int[0];
    }
}
