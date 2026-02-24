package main.java.day02_two_pointers_sliding_window.top150;

/**
 * LC 1423 - Maximum Points You Can Obtain from Cards
 * Difficulty: Medium | Source: Top 150
 *
 * Given cardPoints[] and integer k, you can take k cards from the beginning
 * or end of the row. Return the maximum score you can obtain.
 *
 * Example 1: cardPoints = [1,2,3,4,5,6,1], k = 3 → Output: 12
 * Example 2: cardPoints = [2,2,2], k = 2 → Output: 4
 * Example 3: cardPoints = [9,7,7,9,7,7,9], k = 7 → Output: 55
 *
 * Constraints:
 * - 1 <= cardPoints.length <= 10^5
 * - 1 <= cardPoints[i] <= 10^4
 * - 1 <= k <= cardPoints.length
 *
 * PATTERN: Sliding Window (inverse thinking)
 * HINT: Taking k cards from ends = leaving a window of size (n-k) in the middle.
 *       Find the minimum sum window of size (n-k). Answer = totalSum - minWindowSum.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class MaxPointsFromCards {

    public int maxScore(int[] cardPoints, int k) {
        // TODO: Implement your solution here
        return 0;
    }
}
