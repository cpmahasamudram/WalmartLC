package main.java.day03_dynamic_programming.walmart;

/**
 * LC 55 - Jump Game
 * Difficulty: Medium | Source: Walmart
 *
 * You are given an integer array nums. You are initially positioned at the
 * array's first index, and each element in the array represents your maximum
 * jump length at that position. Return true if you can reach the last index,
 * or false otherwise.
 *
 * Example 1: nums = [2,3,1,1,4] → Output: true
 *   Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2: nums = [3,2,1,0,4] → Output: false
 *   Explanation: You will always arrive at index 3, whose value is 0, stuck.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - 0 <= nums[i] <= 10^5
 *
 * PATTERN: Greedy (track farthest reachable index)
 * HINT: Maintain a variable 'farthest' that tracks the maximum index reachable.
 *       Iterate through the array; if current index > farthest, return false.
 *       Update farthest = max(farthest, i + nums[i]).
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        // TODO: Implement greedy approach tracking farthest reachable index
        return false;
    }
}
