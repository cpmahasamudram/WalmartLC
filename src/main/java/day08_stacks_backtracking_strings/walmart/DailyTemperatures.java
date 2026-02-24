package main.java.day08_stacks_backtracking_strings.walmart;

/**
 * LC 739 - Daily Temperatures
 * Difficulty: Medium | Source: WALMART
 *
 * Given an array of integers temperatures representing daily temperatures, return an array
 * answer such that answer[i] is the number of days you have to wait after the ith day to
 * get a warmer temperature. If there is no future day for which this is possible, keep
 * answer[i] == 0 instead.
 *
 * Example 1: temperatures = [73,74,75,71,69,72,76,73] -> Output: [1,1,4,2,1,1,0,0]
 * Example 2: temperatures = [30,40,50,60] -> Output: [1,1,1,0]
 * Example 3: temperatures = [30,60,90] -> Output: [1,1,0]
 *
 * Constraints:
 * - 1 <= temperatures.length <= 10^5
 * - 30 <= temperatures[i] <= 100
 *
 * PATTERN: Monotonic decreasing stack
 * HINT: Use a stack to store indices of temperatures. Iterate through the array; while
 *       the current temperature is greater than the temperature at the stack's top index,
 *       pop and compute the difference in indices. Push current index onto the stack.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // TODO: Implement your solution here
        return new int[0];
    }
}
