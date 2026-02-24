package main.java.day10_hard_problems_mock.walmart;

/**
 * LC 41 - First Missing Positive
 * Difficulty: Hard | Source: WALMART
 *
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 * Example 1: nums = [1,2,0] -> Output: 3
 * Example 2: nums = [3,4,-1,1] -> Output: 2
 * Example 3: nums = [7,8,9,11,12] -> Output: 1
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -2^31 <= nums[i] <= 2^31 - 1
 *
 * PATTERN: Cyclic Sort / Index as Hash
 * HINT: Place each positive number nums[i] at index nums[i] - 1 (i.e., value k goes to index k-1).
 *       After rearranging, scan for the first index i where nums[i] != i + 1. Answer is i + 1.
 *       Ignore values <= 0 or > n during the swap phase.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }
}
