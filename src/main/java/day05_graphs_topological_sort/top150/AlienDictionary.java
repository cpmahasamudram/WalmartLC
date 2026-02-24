package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 269 - Alien Dictionary
 * Difficulty: Hard | Source: TOP 150
 *
 * There is a new alien language that uses the English alphabet. However, the order of the
 * letters is unknown to you. You are given a list of strings words from the alien language's
 * dictionary, where the strings are sorted lexicographically by the rules of this new language.
 *
 * Derive the order of letters in this language, and return it. If the order is invalid,
 * return "". If there are multiple valid orderings, return any of them.
 *
 * Example 1:
 *   Input: words = ["wrt","wrf","er","ett","rftt"]
 *   Output: "wertf"
 *
 * Example 2:
 *   Input: words = ["z","x"]
 *   Output: "zx"
 *
 * Example 3:
 *   Input: words = ["z","x","z"]
 *   Output: ""
 *   Explanation: The order is invalid, so return "".
 *
 * Constraints:
 * - 1 <= words.length <= 100
 * - 1 <= words[i].length <= 100
 * - words[i] consists of only lowercase English letters
 *
 * PATTERN: Topological sort on character ordering derived from adjacent word comparison
 * HINT: Compare adjacent words to find ordering constraints (first differing char gives an
 *       edge). Build a directed graph of char dependencies. Run topological sort (Kahn's BFS).
 *       If a shorter word appears after a longer word with same prefix, return "". If cycle
 *       exists, return "".
 *
 * TIME: O(C) where C = total length of all words | SPACE: O(1) since at most 26 chars
 */
public class AlienDictionary {

    public String alienOrder(String[] words) {
        // TODO: Implement your solution here
        return "";
    }
}
