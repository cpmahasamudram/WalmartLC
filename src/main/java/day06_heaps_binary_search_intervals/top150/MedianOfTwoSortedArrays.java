package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 4 - Median of Two Sorted Arrays
 * Difficulty: Hard | Source: Top 150
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1: nums1 = [1,3], nums2 = [2] -> Output: 2.0
 *            (merged = [1,2,3], median is 2)
 * Example 2: nums1 = [1,2], nums2 = [3,4] -> Output: 2.5
 *            (merged = [1,2,3,4], median is (2+3)/2 = 2.5)
 *
 * Constraints:
 * - nums1.length == m
 * - nums2.length == n
 * - 0 <= m <= 1000
 * - 0 <= n <= 1000
 * - 1 <= m + n <= 2000
 * - -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * PATTERN: Binary Search on partition
 * HINT: Binary search on the shorter array to find a partition where
 *       maxLeft1 <= minRight2 and maxLeft2 <= minRight1. The median
 *       is derived from the four boundary elements.
 *
 * TIME: O(log(min(m, n))) | SPACE: O(1)
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: Implement
        return 0.0;
    }
}
