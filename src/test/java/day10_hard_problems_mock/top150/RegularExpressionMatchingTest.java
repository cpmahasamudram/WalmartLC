package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.RegularExpressionMatching;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    private final RegularExpressionMatching solution = new RegularExpressionMatching();

    @Test
    void noMatch() {
        assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    void starMatchesMultiple() {
        assertTrue(solution.isMatch("aa", "a*"));
    }

    @Test
    void dotStar() {
        assertTrue(solution.isMatch("ab", ".*"));
    }

    @Test
    void complexPattern() {
        assertTrue(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    void starMatchesZero() {
        assertTrue(solution.isMatch("a", "ab*"));
    }

    @Test
    void fullDotStarPattern() {
        assertTrue(solution.isMatch("mississippi", "mis*is*ip*."));
    }
}
