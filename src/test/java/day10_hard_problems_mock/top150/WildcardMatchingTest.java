package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.WildcardMatching;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingTest {

    private final WildcardMatching solution = new WildcardMatching();

    @Test
    void noMatch() {
        assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    void starMatchesAll() {
        assertTrue(solution.isMatch("aa", "*"));
    }

    @Test
    void questionMarkMismatch() {
        assertFalse(solution.isMatch("cb", "?a"));
    }

    @Test
    void complexMatch() {
        assertTrue(solution.isMatch("adceb", "*a*b"));
    }

    @Test
    void starButNoMatch() {
        assertFalse(solution.isMatch("acdcb", "a*c?b"));
    }

    @Test
    void emptyStringAndPattern() {
        assertTrue(solution.isMatch("", ""));
    }
}
