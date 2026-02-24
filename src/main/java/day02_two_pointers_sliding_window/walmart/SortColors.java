package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 75 - Sort Colors
 * Difficulty: Medium | Source: WALMART
 *
 * Given an array nums with n objects colored red (0), white (1), or blue (2),
 * sort them in-place so that objects of the same color are adjacent,
 * in the order red, white, blue.
 *
 * Do not use the library sort function. Solve in one pass.
 *
 * Example 1: nums = [2,0,2,1,1,0] → Output: [0,0,1,1,2,2]
 * Example 2: nums = [2,0,1] → Output: [0,1,2]
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 300
 * - nums[i] is 0, 1, or 2
 *
 * PATTERN: Dutch National Flag (three-way partition)
 * HINT: Three pointers — low, mid, high. If nums[mid]==0 swap with low and advance both.
 *       If nums[mid]==2 swap with high and decrement high (don't advance mid).
 *       If nums[mid]==1 just advance mid.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class SortColors {

    public void sortColors(int[] nums) {
        // TODO: Implement your solution here
    }
}
