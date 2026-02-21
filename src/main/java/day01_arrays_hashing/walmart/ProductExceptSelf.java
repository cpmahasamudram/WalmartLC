package day01_arrays_hashing.walmart;

/**
 * LC 238 - Product of Array Except Self
 * Difficulty: Medium | Source: BOTH (Walmart + Top 150)
 *
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * You must write an algorithm that runs in O(n) time and without using
 * the division operation.
 *
 * Example 1: nums = [1,2,3,4] → Output: [24,12,8,6]
 * Example 2: nums = [-1,1,0,-3,3] → Output: [0,0,9,0,0]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^5
 * - -30 <= nums[i] <= 30
 * - Product of any prefix/suffix fits in a 32-bit integer
 *
 * PATTERN: Prefix/Suffix Products
 * HINT: Left pass builds prefix products, right pass builds suffix products.
 *       O(1) space trick: use output array for left pass, single variable for right pass.
 *
 * TIME: O(n) | SPACE: O(1) (output array doesn't count)
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // TODO: Implement your solution here
        return new int[0];
    }
}