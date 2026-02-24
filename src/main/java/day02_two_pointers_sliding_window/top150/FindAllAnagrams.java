package main.java.day02_two_pointers_sliding_window.top150;

import java.util.List;

/**
 * LC 438 - Find All Anagrams in a String
 * Difficulty: Medium | Source: Top 150
 *
 * Given two strings s and p, return an array of all the start indices of p's
 * anagrams in s. An anagram is a rearrangement of all characters.
 *
 * Example 1: s = "cbaebabacd", p = "abc" → Output: [0,6]
 * Example 2: s = "abab", p = "ab" → Output: [0,1,2]
 *
 * Constraints:
 * - 1 <= s.length, p.length <= 3 * 10^4
 * - s and p consist of lowercase English letters
 *
 * PATTERN: Fixed-size Sliding Window + Frequency Count
 * HINT: Build frequency map of p. Slide a window of size p.length() over s.
 *       Compare window frequency to p's frequency. Use a "matches" counter to avoid
 *       comparing all 26 chars each time.
 *
 * TIME: O(n) | SPACE: O(1) (fixed 26-char arrays)
 */
public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        // TODO: Implement your solution here
        return List.of();
    }
}
