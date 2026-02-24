package test.java.day09_advanced_dp_design_bits.walmart;

import main.java.day09_advanced_dp_design_bits.walmart.ImplementTrie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieTest {

    @Test
    void insertAndSearchWord() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
    }

    @Test
    void searchNonExistentWord() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertFalse(trie.search("app"));
    }

    @Test
    void startsWithPrefix() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertTrue(trie.startsWith("app"));
    }

    @Test
    void insertPrefixThenSearch() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        trie.insert("app");
        assertTrue(trie.search("app"));
        assertTrue(trie.search("apple"));
    }

    @Test
    void searchEmptyTrie() {
        ImplementTrie trie = new ImplementTrie();
        assertFalse(trie.search("anything"));
        assertFalse(trie.startsWith("a"));
    }

    @Test
    void multipleWordsWithSharedPrefix() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        assertTrue(trie.search("car"));
        assertTrue(trie.search("card"));
        assertTrue(trie.search("care"));
        assertFalse(trie.search("ca"));
        assertTrue(trie.startsWith("car"));
    }
}
