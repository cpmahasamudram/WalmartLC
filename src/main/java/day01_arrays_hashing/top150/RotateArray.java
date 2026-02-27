package main.java.day01_arrays_hashing.top150;

/**
 * LC 189 - Rotate Array
 * Difficulty: Medium | Source: TOP 150
 *
 * Given an integer array nums, rotate the array to the right by k steps.
 *
 * Example 1: nums = [1,2,3,4,5,6,7], k = 3 → Output: [5,6,7,1,2,3,4]
 * Example 2: nums = [-1,-100,3,99], k = 2 → Output: [3,99,-1,-100]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -2^31 <= nums[i] <= 2^31 - 1
 * - 0 <= k <= 10^5
 *
 * PATTERN: Reverse Trick (3 reverses)
 *
 * APPROACH:
 *   Rotating right by k is equivalent to:
 *     1. Reverse the entire array
 *     2. Reverse the first k elements
 *     3. Reverse the remaining n - k elements
 *
 *   Example: [1,2,3,4,5,6,7], k = 3
 *     Step 1: reverse all    → [7,6,5,4,3,2,1]
 *     Step 2: reverse [0,k)  → [5,6,7,4,3,2,1]
 *     Step 3: reverse [k,n)  → [5,6,7,1,2,3,4] ✓
 *
 *  ===== IMPORTANT: k can be >= nums.length, so always do k = k % nums.length first. =======
 *
 * TIME: O(n) — each element reversed at most twice
 * SPACE: O(1) — in-place swaps only
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        // TODO: Implement your solution here
        // Don't forget: k = k % nums.length
        // Use a helper: reverse(nums, start, end)
        if(nums.length == 1) return;
        k = k % nums.length;
        reverse(0, nums.length-1, nums);

        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }

    void reverse(int i, int j, int[] nums) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

}
