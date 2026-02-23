package main.java.day01_arrays_hashing.walmart;

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
 *   l=0, r=n-1, maxL=0, maxR=0.
 *   If height[l] < height[r]: water at l is bounded by maxL (right side is guaranteed taller).
 *     If height[l] >= maxL → update maxL. Else → add (maxL - height[l]). l++.
 *   Else: mirror logic on right side. r--.
 *   Key insight: the shorter pointer's water is fully determined — the other side has something taller.
 *
 * Approach 3 - Monotonic Stack (decreasing): O(n) time, O(n) space
 *   Maintain a stack of indices with decreasing heights.
 *   For each i: while stack not empty AND height[i] > height[stack.peek()]:
 *     pop mid = stack.pop(). If stack empty, break.
 *     width = i - stack.peek() - 1.
 *     bounded_height = min(height[i], height[stack.peek()]) - height[mid].
 *     area += width * bounded_height.
 *   Push i. Computes water layer-by-layer (horizontal) vs. column-by-column (vertical).
 *
 * TIME: O(n) | SPACE: O(1) for two-pointer approach
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        // TODO: Implement your solution here

        int l = height.length;
        int[] p = new int[l];
        int[] s = new int[l];

        p[0] = height[0];
        for (int i = 1; i < l; i++) {
            p[i] = Math.max(p[i-1], height[i]);
        }

        s[l-1] = height[l-1];
        for (int i = l-2; i >=0 ; i--) {
            s[i] = Math.max(s[i+1], height[i]);
        }

        int[] res = new int[l];

        int area = 0;
        for (int i = 0; i < l; i++) {
            res[i] = Math.min(p[i], s[i]) - height[i];
            area += res[i];
        }

        return area;
    }
}
