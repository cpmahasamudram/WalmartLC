package main.java.day01_arrays_hashing.walmart;

/**
 * LC 5 - Longest Palindromic Substring
 * Difficulty: Medium | Source: WALMART
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1: s = "babad" → Output: "bab" (or "aba")
 * Example 2: s = "cbbd"  → Output: "bb"
 *
 * Constraints:
 * - 1 <= s.length <= 1000
 * - s consists of only digits and English letters
 *
 * PATTERN: Expand Around Center
 *
 * APPROACH:
 *   A palindrome mirrors around its center. There are 2n - 1 possible centers:
 *     - n single-char centers (odd-length palindromes): "aba" → center at 'b'
 *     - n-1 between-char centers (even-length palindromes): "abba" → center between 'b','b'
 *
 *   For each center, expand outward while characters match.
 *   Track the longest found.
 *
 *   Example walkthrough for s = "babad":
 *     center 'a' (index 1): expand → "bab" (length 3)
 *     center 'b' (index 2): expand → "aba" (length 3)
 *     No even-length palindrome longer than 1 found.
 *     Result: "bab" or "aba"
 *
 * TIME COMPLEXITY: O(n²)
 *   - 2n - 1 centers to try
 *   - Each expansion is O(n) worst case (e.g. "aaaa" expands fully from middle)
 *   - Total: O(n) centers × O(n) expansion = O(n²)
 *
 * SPACE COMPLEXITY: O(1)
 *   - Only tracking start index and max length — no extra data structures
 *   - (Note: the output string itself is O(n), but that's the answer, not auxiliary space)
 *
 * ALTERNATIVE APPROACHES:
 *   - DP: dp[i][j] = true if s[i..j] is palindrome. O(n²) time, O(n²) space. Less optimal.
 *   - Manacher's Algorithm: O(n) time, O(n) space. Overkill for interviews, but worth mentioning.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        // TODO: Implement expand around center
        // For each index i:
        //   1. Expand for odd-length palindrome: expand(s, i, i)
        //   2. Expand for even-length palindrome: expand(s, i, i+1)
        //   Track the longest result
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandString(s, i, i);
            String even = expandString(s, i, i+1);
            if(odd.length() > res.length()) res = odd;
            if(even.length() > res.length()) res = even;
        }
        return res;
    }

    private String expandString(String s, int i, int j) {
        int pal = 0;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            pal = j - i +1; // length
            i--; j++;
        }
        return s.substring(i + 1, j);
    }
}
