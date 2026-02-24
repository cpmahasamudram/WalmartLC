package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.LongestValidParentheses;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    private final LongestValidParentheses solution = new LongestValidParentheses();

    @Test
    void basicCase() {
        assertEquals(2, solution.longestValidParentheses("(()"));
    }

    @Test
    void longerValid() {
        assertEquals(4, solution.longestValidParentheses(")()())"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.longestValidParentheses(""));
    }

    @Test
    void allValid() {
        assertEquals(6, solution.longestValidParentheses("()(())"));
    }

    @Test
    void noValid() {
        assertEquals(0, solution.longestValidParentheses("(((("));
    }

    @Test
    void nestedValid() {
        assertEquals(4, solution.longestValidParentheses("(())"));
    }
}
