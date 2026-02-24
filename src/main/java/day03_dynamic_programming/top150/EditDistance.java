package main.java.day03_dynamic_programming.top150;

/**
 * LC 72 - Edit Distance
 * Difficulty: Medium | Source: Top 150
 *
 * Given two strings word1 and word2, return the minimum number of operations
 * required to convert word1 to word2. You have the following three operations
 * permitted on a word:
 * - Insert a character
 * - Delete a character
 * - Replace a character
 *
 * Example 1: word1 = "horse", word2 = "ros" → Output: 3
 *   Explanation: horse → rorse (replace 'h' with 'r') → rose (remove 'r') → ros (remove 'e')
 * Example 2: word1 = "intention", word2 = "execution" → Output: 5
 *   Explanation: intention → inention → enention → exention → exection → execution
 *
 * Constraints:
 * - 0 <= word1.length, word2.length <= 500
 * - word1 and word2 consist of lowercase English letters.
 *
 * PATTERN: 2D Dynamic Programming
 * HINT: dp[i][j] = min edit distance between word1[0..i) and word2[0..j).
 *       If word1[i-1] == word2[j-1]: dp[i][j] = dp[i-1][j-1]
 *       Else: dp[i][j] = 1 + min(dp[i-1][j],     // delete
 *                                 dp[i][j-1],     // insert
 *                                 dp[i-1][j-1])   // replace
 *
 * TIME: O(m * n) | SPACE: O(m * n), can be optimized to O(min(m, n))
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        // TODO: Implement 2D DP for insert/delete/replace operations
        return 0;
    }
}
