package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 211 - Design Add and Search Words Data Structure
 * Difficulty: Medium | Source: Top 150
 *
 * Design a data structure that supports adding new words and finding if a string
 * matches any previously added string.
 *
 * Implement the WordDictionary class:
 * - WordDictionary() Initializes the object.
 * - void addWord(word) Adds word to the data structure; it can be matched later.
 * - boolean search(word) Returns true if there is any string in the data structure
 *   that matches word. word may contain dots '.' where each dot can match any letter.
 *
 * Example:
 *   WordDictionary wd = new WordDictionary();
 *   wd.addWord("bad");
 *   wd.addWord("dad");
 *   wd.addWord("mad");
 *   wd.search("pad");  -> false
 *   wd.search("bad");  -> true
 *   wd.search(".ad");  -> true
 *   wd.search("b..");  -> true
 *
 * Constraints:
 * - 1 <= word.length <= 25
 * - word in addWord consists of lowercase English letters.
 * - word in search consists of '.' or lowercase English letters.
 * - At most 10^4 calls will be made to addWord and search.
 *
 * PATTERN: Trie with '.' wildcard DFS
 * HINT: Build a standard Trie for addWord. For search, when encountering '.', recurse
 *       on all 26 children. For regular chars, follow the specific child. Return true
 *       at end if isEnd is set.
 *
 * TIME: O(m) addWord, O(26^m) worst-case search with dots, O(m) typical | SPACE: O(total chars)
 */
public class DesignAddSearchWords {

    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    public DesignAddSearchWords() {
        // TODO: Implement - initialize root TrieNode
    }

    public void addWord(String word) {
        // TODO: Implement - insert word into trie
    }

    public boolean search(String word) {
        // TODO: Implement - search with '.' wildcard support using DFS
        return false;
    }
}
