package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 136 - Single Number
 * Difficulty: Easy | Source: Top 150
 *
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 *
 * Example 1: nums = [2,2,1] -> 1
 * Example 2: nums = [4,1,2,1,2] -> 4
 * Example 3: nums = [1] -> 1
 *
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -3 * 10^4 <= nums[i] <= 3 * 10^4
 * - Each element in the array appears twice except for one element which appears once.
 *
 * PATTERN: Bit Manipulation - XOR
 * HINT: XOR all elements together. Since a ^ a = 0 and a ^ 0 = a, all pairs cancel
 *       out, leaving only the single number. Result = nums[0] ^ nums[1] ^ ... ^ nums[n-1].
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        // TODO: Implement XOR of all elements to find the single number
        return 0;
    }
}
