package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.DesignAddSearchWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignAddSearchWordsTest {

    @Test
    void exactSearch() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        assertTrue(wd.search("bad"));
        assertFalse(wd.search("pad"));
    }

    @Test
    void dotWildcardSearch() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        assertTrue(wd.search(".ad"));
        assertTrue(wd.search("b.."));
    }

    @Test
    void allDotsSearch() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        wd.addWord("abc");
        assertTrue(wd.search("..."));
        assertFalse(wd.search(".."));
    }

    @Test
    void searchEmptyDictionary() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        assertFalse(wd.search("a"));
        assertFalse(wd.search("."));
    }

    @Test
    void searchDifferentLengths() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        wd.addWord("a");
        wd.addWord("ab");
        assertTrue(wd.search("a"));
        assertFalse(wd.search("a."));
        assertTrue(wd.search("ab"));
    }

    @Test
    void dotAtVariousPositions() {
        DesignAddSearchWords wd = new DesignAddSearchWords();
        wd.addWord("hello");
        assertTrue(wd.search("h.llo"));
        assertTrue(wd.search("hell."));
        assertTrue(wd.search(".ello"));
        assertFalse(wd.search("h.ll"));
    }
}
