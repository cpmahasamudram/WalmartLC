package main.java.day02_two_pointers_sliding_window.walmart;

import java.util.List;

/**
 * LC 15 - 3Sum
 * Difficulty: Medium | Source: WALMART
 *
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * The solution set must not contain duplicate triplets.
 *
 * Example 1: nums = [-1,0,1,2,-1,-4] → Output: [[-1,-1,2],[-1,0,1]]
 * Example 2: nums = [0,1,1] → Output: []
 * Example 3: nums = [0,0,0] → Output: [[0,0,0]]
 *
 * Constraints:
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 *
 * PATTERN: Sort + Two Pointers
 * HINT: Sort the array. Fix one element, then use two pointers on the rest to find pairs
 *       that sum to its negation. Skip duplicates at all three levels.
 *
 * TIME: O(n^2) | SPACE: O(1) (ignoring output)
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // TODO: Implement your solution here
        return List.of();
    }
}