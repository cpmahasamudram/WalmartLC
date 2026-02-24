package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 767 - Reorganize String
 * Difficulty: Medium | Source: Top 150
 *
 * Given a string s, rearrange the characters of s so that any two adjacent
 * characters are not the same. Return any possible rearrangement of s or
 * return "" if not possible.
 *
 * Example 1: s = "aab" -> "aba"
 * Example 2: s = "aaab" -> ""
 *   Explanation: No valid rearrangement exists.
 *
 * Constraints:
 * - 1 <= s.length <= 500
 * - s consists of lowercase English letters.
 *
 * PATTERN: Greedy with Max-Heap
 * HINT: If any character count > (s.length + 1) / 2, return "".
 *       Use a max-heap ordered by frequency. Each step, pop top two characters,
 *       append both to result, decrement counts, push back if count > 0.
 *       Alternatively, place the most frequent char at even indices first, then fill rest.
 *
 * TIME: O(n log 26) = O(n) | SPACE: O(26) = O(1)
 */
public class ReorganizeString {
    public String reorganizeString(String s) {
        // TODO: Implement greedy approach using max-heap or even/odd index placement
        return "";
    }
}
