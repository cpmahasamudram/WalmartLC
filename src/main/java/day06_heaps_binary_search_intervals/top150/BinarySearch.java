package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 704 - Binary Search
 * Difficulty: Easy | Source: Top 150
 *
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1: nums = [-1,0,3,5,9,12], target = 9 -> Output: 4
 * Example 2: nums = [-1,0,3,5,9,12], target = 2 -> Output: -1
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 < nums[i], target < 10^4
 * - All the integers in nums are unique
 * - nums is sorted in ascending order
 *
 * PATTERN: Classic Binary Search
 * HINT: Maintain left and right pointers. Compare mid element with target
 *       and narrow the search space by half each iteration.
 *
 * TIME: O(log n) | SPACE: O(1)
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        // TODO: Implement
        return -1;
    }
}
