package main.java.day10_hard_problems_mock.top150;

/**
 * LC 45 - Jump Game II
 * Difficulty: Medium | Source: Top 150
 *
 * You are given a 0-indexed array of integers nums. You are initially positioned at
 * nums[0]. Each element nums[i] represents the maximum length of a forward jump from
 * index i. Return the minimum number of jumps to reach nums[n - 1].
 * The test cases are generated such that you can always reach nums[n - 1].
 *
 * Example 1: nums = [2,3,1,1,4] -> Output: 2 (Jump 1 step from 0 to 1, then 3 steps to 4)
 * Example 2: nums = [2,3,0,1,4] -> Output: 2
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - 0 <= nums[i] <= 1000
 * - It's guaranteed that you can reach nums[n - 1]
 *
 * PATTERN: Greedy - track farthest reachable in current jump
 * HINT: Maintain currentEnd (farthest index reachable with current jumps) and farthest
 *       (farthest index reachable from any index seen so far). When i reaches currentEnd,
 *       increment jumps and set currentEnd = farthest. Stop when currentEnd >= n - 1.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class JumpGameII {

    public int jump(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }
}
