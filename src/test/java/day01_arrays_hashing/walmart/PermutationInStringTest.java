package test.java.day01_arrays_hashing.walmart;

import main.java.day01_arrays_hashing.walmart.PermutationInString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    private final PermutationInString solution = new PermutationInString();

    @Test
    void basicTrue() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void exactMatch() {
        assertTrue(solution.checkInclusion("abc", "abc"));
    }

    @Test
    void s1LongerThanS2() {
        assertFalse(solution.checkInclusion("abcdef", "abc"));
    }

    @Test
    void singleCharMatch() {
        assertTrue(solution.checkInclusion("a", "a"));
    }

    @Test
    void singleCharNoMatch() {
        assertFalse(solution.checkInclusion("a", "b"));
    }

    @Test
    void permutationAtEnd() {
        assertTrue(solution.checkInclusion("ab", "xxxba"));
    }

    @Test
    void permutationAtStart() {
        assertTrue(solution.checkInclusion("ab", "baxxx"));
    }

    @Test
    void repeatedChars() {
        assertTrue(solution.checkInclusion("aab", "ccccbaax"));
        // "baax" doesn't work, but "aab" → need 2 a's and 1 b
        // cccc|baa|x → "baa" is a permutation of "aab" ✓
    }

    @Test
    void allSameChars() {
        assertTrue(solution.checkInclusion("aaa", "aaaa"));
    }

    @Test
    void allSameCharsNoMatch() {
        assertFalse(solution.checkInclusion("aaa", "aa"));
    }

    @Test
    void noOverlap() {
        assertFalse(solution.checkInclusion("abc", "defghijkl"));
    }
}
