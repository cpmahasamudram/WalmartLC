package main.java.day09_advanced_dp_design_bits.walmart;

/**
 * LC 208 - Implement Trie (Prefix Tree)
 * Difficulty: Medium | Source: WALMART
 *
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to
 * efficiently store and retrieve keys in a dataset of strings. There are various
 * applications of this data structure, such as autocomplete and spellchecker.
 *
 * Implement the Trie class:
 * - Trie() Initializes the trie object.
 * - void insert(String word) Inserts the string word into the trie.
 * - boolean search(String word) Returns true if the string word is in the trie
 *   (i.e., was inserted before), and false otherwise.
 * - boolean startsWith(String prefix) Returns true if there is a previously
 *   inserted string word that has the prefix prefix, and false otherwise.
 *
 * Example:
 *   Trie trie = new Trie();
 *   trie.insert("apple");
 *   trie.search("apple");   -> true
 *   trie.search("app");     -> false
 *   trie.startsWith("app"); -> true
 *   trie.insert("app");
 *   trie.search("app");     -> true
 *
 * Constraints:
 * - 1 <= word.length, prefix.length <= 2000
 * - word and prefix consist only of lowercase English letters.
 * - At most 3 * 10^4 calls in total will be made to insert, search, and startsWith.
 *
 * PATTERN: Trie with TrieNode array (children[26])
 * HINT: Each TrieNode has a children array of size 26 (for 'a'-'z') and an isEnd flag.
 *       insert: walk/create nodes for each char. search: walk nodes, check isEnd.
 *       startsWith: walk nodes, return true if all chars found (no isEnd check needed).
 *
 * TIME: O(m) per operation where m = word/prefix length | SPACE: O(n * m) total for n words
 */
public class ImplementTrie {

    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    public ImplementTrie() {
        // TODO: Implement - initialize root TrieNode
    }

    public void insert(String word) {
        // TODO: Implement - walk/create nodes for each character, mark last as end
    }

    public boolean search(String word) {
        // TODO: Implement - walk nodes for each character, check isEnd at last node
        return false;
    }

    public boolean startsWith(String prefix) {
        // TODO: Implement - walk nodes for each character, return true if all found
        return false;
    }
}
