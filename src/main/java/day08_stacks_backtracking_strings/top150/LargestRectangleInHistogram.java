package main.java.day08_stacks_backtracking_strings.top150;

/**
 * LC 84 - Largest Rectangle in Histogram
 * Difficulty: Hard | Source: TOP 150
 *
 * Given an array of integers heights representing the histogram's bar height where the
 * width of each bar is 1, return the area of the largest rectangle in the histogram.
 *
 * Example 1: heights = [2,1,5,6,2,3] -> Output: 10
 *            Explanation: The largest rectangle has area = 10 (bars at index 2 and 3,
 *            height 5, width 2).
 * Example 2: heights = [2,4] -> Output: 4
 *
 * Constraints:
 * - 1 <= heights.length <= 10^5
 * - 0 <= heights[i] <= 10^4
 *
 * PATTERN: Monotonic stack
 * HINT: Use a stack storing indices in increasing height order. When a shorter bar is
 *       encountered, pop bars and compute areas using the popped height and the width
 *       between the current index and the new stack top. Process remaining bars after
 *       the loop ends.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {

        return 0;
    }
}
