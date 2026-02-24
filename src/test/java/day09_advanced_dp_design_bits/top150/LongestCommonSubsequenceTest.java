package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.LongestCommonSubsequence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void basicSubsequence() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void identicalStrings() {
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void noCommonSubsequence() {
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void singleCharMatch() {
        assertEquals(1, solution.longestCommonSubsequence("a", "a"));
    }

    @Test
    void singleCharNoMatch() {
        assertEquals(0, solution.longestCommonSubsequence("a", "b"));
    }

    @Test
    void longerStrings() {
        assertEquals(4, solution.longestCommonSubsequence("abcdefg", "aebdfg"));
    }
}
