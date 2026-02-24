package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.LongestSubstringWithoutRepeating;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {

    private final LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();

    @Test
    void basicCase() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allSameChars() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void repeatInMiddle() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void allUnique() {
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }

    @Test
    void withSpacesAndDigits() {
        assertEquals(7, solution.lengthOfLongestSubstring("ab1 2cd1"));
    }

    @Test
    void duplicateAtEnd() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }
}