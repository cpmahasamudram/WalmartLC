package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.ReorganizeString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

    private final ReorganizeString solution = new ReorganizeString();

    @Test
    void basicReorganize() {
        String result = solution.reorganizeString("aab");
        assertEquals(3, result.length());
        for (int i = 1; i < result.length(); i++) {
            assertNotEquals(result.charAt(i), result.charAt(i - 1));
        }
    }

    @Test
    void impossibleToReorganize() {
        assertEquals("", solution.reorganizeString("aaab"));
    }

    @Test
    void singleCharacter() {
        assertEquals("a", solution.reorganizeString("a"));
    }

    @Test
    void twoDistinctChars() {
        String result = solution.reorganizeString("ab");
        assertTrue(result.equals("ab") || result.equals("ba"));
    }

    @Test
    void allSameCharImpossible() {
        assertEquals("", solution.reorganizeString("aaa"));
    }

    @Test
    void longerValidString() {
        String result = solution.reorganizeString("aaabbc");
        assertEquals(6, result.length());
        for (int i = 1; i < result.length(); i++) {
            assertNotEquals(result.charAt(i), result.charAt(i - 1));
        }
    }
}
