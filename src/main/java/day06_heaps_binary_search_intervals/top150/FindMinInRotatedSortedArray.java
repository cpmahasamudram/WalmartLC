package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 153 - Find Minimum in Rotated Sorted Array
 * Difficulty: Medium | Source: Top 150
 *
 * Suppose an array of length n sorted in ascending order is rotated between
 * 1 and n times. Given the sorted rotated array nums of unique elements,
 * return the minimum element of this array.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example 1: nums = [3,4,5,1,2] -> Output: 1
 * Example 2: nums = [4,5,6,7,0,1,2] -> Output: 0
 * Example 3: nums = [11,13,15,17] -> Output: 11
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 5000
 * - -5000 <= nums[i] <= 5000
 * - All the integers of nums are unique
 * - nums is sorted and rotated between 1 and n times
 *
 * PATTERN: Binary Search comparing with rightmost element
 * HINT: If nums[mid] > nums[right], the minimum is in the right half.
 *       Otherwise, the minimum is in the left half (including mid).
 *
 * TIME: O(log n) | SPACE: O(1)
 */
public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        // TODO: Implement
        return 0;
    }
}
