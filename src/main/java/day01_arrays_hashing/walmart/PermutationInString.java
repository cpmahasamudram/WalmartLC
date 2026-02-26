package main.java.day01_arrays_hashing.walmart;

import java.util.Arrays;

/**
 * LC 567 - Permutation in String
 * Difficulty: Medium | Source: WALMART
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1,
 * or false otherwise. In other words, return true if one of s1's permutations
 * is a substring of s2.
 *
 * Example 1: s1 = "ab", s2 = "eidbaooo" → Output: true
 *   Explanation: s2 contains "ba" which is a permutation of "ab".
 *
 * Example 2: s1 = "ab", s2 = "eidboaoo" → Output: false
 *
 * Constraints:
 * - 1 <= s1.length, s2.length <= 10^4
 * - s1 and s2 consist of lowercase English letters
 *
 * PATTERN: Fixed-size Sliding Window + Frequency Count
 * HINT: Window of size s1.length() slides over s2.
 *       Maintain a freq count (int[26]) for the window.
 *       Compare window freq with s1 freq at each step.
 *       Optimization: track a "matches" counter (how many of 26 chars have equal freq)
 *       — when matches == 26, return true. Avoids comparing arrays each time.
 *
 * TIME: O(n) where n = s2.length | SPACE: O(1) — fixed int[26]
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return  false;
        int[] freq = new int[26];
        int[] freqs2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freqs2[(s2.charAt(i) - 'a')]++;
        }
        int windowSize = s1.length();

        for (int i = windowSize; i < s2.length(); i++) {
            if(Arrays.equals(freq, freqs2))
                return true;
            freqs2[s2.charAt(i) - 'a']++;
            freqs2[s2.charAt(i - windowSize) - 'a']--;
            if(Arrays.equals(freq, freqs2))
                return true;
        }
        return Arrays.equals(freq, freqs2);

    }
}
