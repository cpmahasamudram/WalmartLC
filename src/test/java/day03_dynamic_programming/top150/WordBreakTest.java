package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.WordBreak;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    private final WordBreak solution = new WordBreak();

    @Test
    void basicCaseSegmentable() {
        assertTrue(solution.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    void basicCaseReusedWord() {
        assertTrue(solution.wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    void basicCaseNotSegmentable() {
        assertFalse(solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    void singleCharMatch() {
        assertTrue(solution.wordBreak("a", List.of("a")));
    }

    @Test
    void singleCharNoMatch() {
        assertFalse(solution.wordBreak("b", List.of("a")));
    }

    @Test
    void overlappingPrefixes() {
        assertTrue(solution.wordBreak("cars", List.of("car", "ca", "rs")));
    }
}
