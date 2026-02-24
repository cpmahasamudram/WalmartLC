package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 131 - Palindrome Partitioning
 * Difficulty: Medium | Source: TOP 150
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitionings of s.
 *
 * Example 1: s = "aab" -> Output: [["a","a","b"],["aa","b"]]
 * Example 2: s = "a" -> Output: [["a"]]
 *
 * Constraints:
 * - 1 <= s.length <= 16
 * - s contains only lowercase English letters
 *
 * PATTERN: Backtracking checking palindromes
 * HINT: At each position, try all substrings starting there. If the substring is a
 *       palindrome, add it to the current partition and recurse from the end of that
 *       substring. When the start index reaches the string length, add the partition.
 *       Backtrack by removing the last added substring.
 *
 * TIME: O(n * 2^n) | SPACE: O(n) recursion depth
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // TODO: Implement your solution here
        return null;
    }
}
