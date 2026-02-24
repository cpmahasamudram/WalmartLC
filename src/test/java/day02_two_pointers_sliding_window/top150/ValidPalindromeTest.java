package test.java.day02_two_pointers_sliding_window.top150;

import main.java.day02_two_pointers_sliding_window.top150.ValidPalindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void basicTrue() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void emptyString() {
        assertTrue(solution.isPalindrome(" "));
    }

    @Test
    void onlyDigits() {
        assertTrue(solution.isPalindrome("121"));
    }

    @Test
    void mixedAlphaNumeric() {
        assertFalse(solution.isPalindrome("0P"));
    }

    @Test
    void singleChar() {
        assertTrue(solution.isPalindrome("a"));
    }
}
