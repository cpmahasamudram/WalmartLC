package main.java.day03_dynamic_programming.top150;

import java.util.List;

/**
 * LC 139 - Word Break
 * Difficulty: Medium | Source: Top 150
 *
 * Given a string s and a dictionary of strings wordDict, return true if s
 * can be segmented into a space-separated sequence of one or more dictionary words.
 * Note that the same word in the dictionary may be reused multiple times
 * in the segmentation.
 *
 * Example 1: s = "leetcode", wordDict = ["leet","code"] → Output: true
 *   Explanation: "leetcode" can be segmented as "leet code".
 * Example 2: s = "applepenapple", wordDict = ["apple","pen"] → Output: true
 *   Explanation: "applepenapple" can be segmented as "apple pen apple".
 * Example 3: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"] → Output: false
 *
 * Constraints:
 * - 1 <= s.length <= 300
 * - 1 <= wordDict.length <= 1000
 * - 1 <= wordDict[i].length <= 20
 * - s and wordDict[i] consist of only lowercase English letters.
 * - All the strings of wordDict are unique.
 *
 * PATTERN: 1D Dynamic Programming
 * HINT: dp[i] = true if s[0..i) can be segmented using wordDict.
 *       For each position i, check all words w in wordDict:
 *       if dp[i - w.length()] is true and s.substring(i - w.length(), i) equals w, set dp[i] = true.
 *
 * TIME: O(n^2 * m) where n = s.length, m = max word length | SPACE: O(n)
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // TODO: Implement dp[i] = can s[0..i) be segmented
        return false;
    }
}
