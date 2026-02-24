package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 76 - Minimum Window Substring
 * Difficulty: Hard | Source: WALMART
 *
 * Given two strings s and t, return the minimum window substring of s such that
 * every character in t (including duplicates) is included in the window.
 * If no such substring exists, return "".
 *
 * Example 1: s = "ADOBECODEBANC", t = "ABC" → Output: "BANC"
 * Example 2: s = "a", t = "a" → Output: "a"
 * Example 3: s = "a", t = "aa" → Output: ""
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 10^5
 * - s and t consist of uppercase and lowercase English letters
 *
 * PATTERN: Sliding Window + Frequency Map
 * HINT: Expand right to include chars. Track how many required chars are satisfied.
 *       Once all are satisfied, shrink from left to minimize. Track the best window.
 *
 * TIME: O(n + m) | SPACE: O(m) where m = |t|
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        // TODO: Implement your solution here
        return "";
    }
}
