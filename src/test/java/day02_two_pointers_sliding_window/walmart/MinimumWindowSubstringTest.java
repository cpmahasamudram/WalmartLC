package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.MinimumWindowSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    private final MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    void basicCase() {
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void exactMatch() {
        assertEquals("a", solution.minWindow("a", "a"));
    }

    @Test
    void impossible() {
        assertEquals("", solution.minWindow("a", "aa"));
    }

    @Test
    void tContainsAll() {
        assertEquals("abc", solution.minWindow("abc", "abc"));
    }

    @Test
    void duplicatesInT() {
        assertEquals("aa", solution.minWindow("aab", "aa"));
    }

    @Test
    void windowAtEnd() {
        assertEquals("ba", solution.minWindow("acbbaca", "aba"));
    }
}
