package day01_arrays_hashing.walmart;

/**
 * LC 42 - Trapping Rain Water
 * Difficulty: Hard | Source: WALMART (★★★★★ WALMART FAV)
 *
 * Given n non-negative integers representing an elevation map where the
 * width of each bar is 1, compute how much water it can trap after raining.
 *
 * Example 1: height = [0,1,0,2,1,0,1,3,2,1,2,1] → Output: 6
 * Example 2: height = [4,2,0,3,2,5] → Output: 9
 *
 * Constraints:
 * - n == height.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= height[i] <= 10^5
 *
 * PATTERN: Two Pointers (O(1) space) — know all 3 approaches!
 *
 * Approach 1 - Prefix Max Arrays: O(n) time, O(n) space
 *   Precompute leftMax[] and rightMax[]. Water at i = min(leftMax[i], rightMax[i]) - height[i].
 *
 * Approach 2 - Two Pointers: O(n) time, O(1) space
 *   Left and right pointers. Move the shorter side inward.
 *   Track maxLeft and maxRight as you go.
 *
 * Approach 3 - Monotonic Stack: O(n) time, O(n) space
 *   Push decreasing heights. On increase, pop and calculate trapped water.
 *
 * TIME: O(n) | SPACE: O(1) for two-pointer approach
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        // TODO: Implement your solution here
        return -1;
    }
}
