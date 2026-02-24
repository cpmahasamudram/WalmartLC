package main.java.day02_two_pointers_sliding_window.walmart;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 3 - Longest Substring Without Repeating Characters
 * Difficulty: Medium | Source: WALMART
 *
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 *
 * Example 1: s = "abcabcbb" → Output: 3 ("abc")
 * Example 2: s = "bbbbb" → Output: 1 ("b")
 * Example 3: s = "pwwkew" → Output: 3 ("wke")
 *
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols and spaces
 *
 * PATTERN: Sliding Window + HashSet/HashMap
 * HINT: Expand right pointer. When a duplicate is found, shrink from the left
 *       until the window is valid again. Track max window size.
 *
 * TIME: O(n) | SPACE: O(min(n, m)) where m = charset size
 */
public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        char[] c = s.toCharArray();

        return 0;
    }
}