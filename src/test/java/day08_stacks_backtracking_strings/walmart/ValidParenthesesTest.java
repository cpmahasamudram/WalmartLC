package test.java.day08_stacks_backtracking_strings.walmart;

import main.java.day08_stacks_backtracking_strings.walmart.ValidParentheses;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void simpleParentheses() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void multipleBracketTypes() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void mismatchedBrackets() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void nestedBrackets() {
        assertTrue(solution.isValid("([{}])"));
    }

    @Test
    void unclosedBracket() {
        assertFalse(solution.isValid("("));
    }

    @Test
    void extraClosingBracket() {
        assertFalse(solution.isValid("]"));
    }
}
