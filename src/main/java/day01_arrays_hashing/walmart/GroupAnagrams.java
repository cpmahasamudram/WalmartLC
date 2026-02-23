package main.java.day01_arrays_hashing.walmart;

import java.util.*;

/**
 * LC 49 - Group Anagrams
 * Difficulty: Medium | Source: BOTH (Walmart + Top 150)
 *
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * Example 1: strs = ["eat","tea","tan","ate","nat","bat"]
 *            → Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2: strs = [""] → Output: [[""]]
 * Example 3: strs = ["a"] → Output: [["a"]]
 *
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters
 *
 * PATTERN: Sorted Key HashMap
 * HINT: Sort each string's characters → use as HashMap key.
 *       All anagrams produce the same sorted key.
 *       Alternative: use char frequency array as key (avoids sort overhead).
 *
 * TIME: O(n * k log k) where k = max string length | SPACE: O(n * k)
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement your solution here
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
