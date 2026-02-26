package test.java.day01_arrays_hashing.walmart;

import main.java.day01_arrays_hashing.walmart.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    void basicOdd() {
        String result = solution.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void basicEven() {
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    void singleChar() {
        assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    void twoSameChars() {
        assertEquals("aa", solution.longestPalindrome("aa"));
    }

    @Test
    void twoDiffChars() {
        String result = solution.longestPalindrome("ab");
        assertTrue(result.equals("a") || result.equals("b"));
    }

    @Test
    void entireStringIsPalindrome() {
        assertEquals("racecar", solution.longestPalindrome("racecar"));
    }

    @Test
    void evenPalindromeInMiddle() {
        assertEquals("abba", solution.longestPalindrome("xabba"));
    }

    @Test
    void allSameChars() {
        assertEquals("aaaa", solution.longestPalindrome("aaaa"));
    }

    @Test
    void palindromeAtEnd() {
        assertEquals("aba", solution.longestPalindrome("xxaba"));
    }

    @Test
    void longMixed() {
        String result = solution.longestPalindrome("forgeeksskeegfor");
        assertEquals("geeksskeeg", result);
    }

    @Test
    void noPalindromeGreaterThanOne() {
        String result = solution.longestPalindrome("abcde");
        // Any single char is valid
        assertEquals(1, result.length());
    }
}
