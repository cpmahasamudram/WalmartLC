package test.java.day02_two_pointers_sliding_window.top150;

import main.java.day02_two_pointers_sliding_window.top150.FindAllAnagrams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class FindAllAnagramsTest {

    private final FindAllAnagrams solution = new FindAllAnagrams();

    @Test
    void basicCase() {
        assertEquals(List.of(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    void overlapping() {
        assertEquals(List.of(0, 1, 2), solution.findAnagrams("abab", "ab"));
    }

    @Test
    void noAnagrams() {
        assertEquals(List.of(), solution.findAnagrams("abcdef", "gh"));
    }

    @Test
    void entireString() {
        assertEquals(List.of(0), solution.findAnagrams("abc", "cba"));
    }

    @Test
    void sLongerThanP() {
        assertEquals(List.of(), solution.findAnagrams("a", "abc"));
    }

    @Test
    void singleCharMatch() {
        assertEquals(List.of(0, 1, 2), solution.findAnagrams("aaa", "a"));
    }
}
