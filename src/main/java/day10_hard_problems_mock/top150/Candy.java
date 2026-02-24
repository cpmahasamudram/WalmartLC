package main.java.day10_hard_problems_mock.top150;

/**
 * LC 135 - Candy
 * Difficulty: Hard | Source: Top 150
 *
 * There are n children standing in a line. Each child is assigned a rating value given in
 * the integer array ratings. You are giving candies to these children subject to:
 * - Each child must have at least one candy.
 * - Children with a higher rating than their neighbor get more candies than that neighbor.
 * Return the minimum number of candies you need to distribute.
 *
 * Example 1: ratings = [1,0,2] -> Output: 5 (candies = [2,1,2])
 * Example 2: ratings = [1,2,2] -> Output: 4 (candies = [1,2,1])
 *
 * Constraints:
 * - n == ratings.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= ratings[i] <= 2 * 10^4
 *
 * PATTERN: Two-pass Greedy (left-to-right, right-to-left)
 * HINT: First pass left-to-right: if ratings[i] > ratings[i-1], give one more candy than
 *       the left neighbor. Second pass right-to-left: if ratings[i] > ratings[i+1], ensure
 *       candy[i] >= candy[i+1] + 1. Take the max of both passes for each child. Sum all.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class Candy {

    public int candy(int[] ratings) {
        // TODO: Implement your solution here
        return 0;
    }
}
