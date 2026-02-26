package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 11 - Container With Most Water
 * Difficulty: Medium | Source: WALMART
 *
 * Given n non-negative integers height[i] representing vertical lines,
 * find two lines that together with the x-axis form a container that holds the most water.
 *
 * Example 1: height = [1,8,6,2,5,4,8,3,7] → Output: 49
 * Example 2: height = [1,1] → Output: 1
 *
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 *
 * PATTERN: Two Pointers (greedy)
 * HINT: Start with widest container (l=0, r=n-1). Move the shorter side inward —
 *       moving the taller side can only decrease area.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        // TODO: Implement your solution here
        int l = 0, r = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        int curArea = 0;
        while(l < r) {
            curArea = (r - l) * Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, curArea);

            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
