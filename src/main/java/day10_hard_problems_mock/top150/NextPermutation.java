package main.java.day10_hard_problems_mock.top150;

/**
 * LC 31 - Next Permutation
 * Difficulty: Medium | Source: Top 150
 *
 * A permutation of an array of integers is an arrangement of its members into a sequence.
 * The next permutation of an array is the next lexicographically greater permutation.
 * If such arrangement is not possible (array is in descending order), rearrange as the
 * lowest possible order (ascending order). The replacement must be in place with O(1) extra memory.
 *
 * Example 1: nums = [1,2,3] -> Output: [1,3,2]
 * Example 2: nums = [3,2,1] -> Output: [1,2,3]
 * Example 3: nums = [1,1,5] -> Output: [1,5,1]
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 100
 *
 * PATTERN: Find rightmost ascent, swap, reverse
 * HINT: 1) Find the largest index i such that nums[i] < nums[i + 1] (rightmost ascent).
 *       2) Find the largest index j > i such that nums[i] < nums[j].
 *       3) Swap nums[i] and nums[j].
 *       4) Reverse the suffix starting at nums[i + 1].
 *       If no ascent found, just reverse the entire array.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        // TODO: Implement your solution here
    }
}
