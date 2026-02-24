package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.GenerateParentheses;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    private final GenerateParentheses solution = new GenerateParentheses();

    @Test
    void nEquals1() {
        assertEquals(List.of("()"), solution.generateParenthesis(1));
    }

    @Test
    void nEquals2() {
        List<String> result = solution.generateParenthesis(2);
        assertEquals(2, result.size());
        assertTrue(result.contains("(())"));
        assertTrue(result.contains("()()"));
    }

    @Test
    void nEquals3() {
        List<String> result = solution.generateParenthesis(3);
        assertEquals(5, result.size());
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("()()()"));
    }

    @Test
    void nEquals4HasCatalanCount() {
        List<String> result = solution.generateParenthesis(4);
        assertEquals(14, result.size());
    }

    @Test
    void allResultsHaveCorrectLength() {
        List<String> result = solution.generateParenthesis(3);
        for (String s : result) {
            assertEquals(6, s.length());
        }
    }
}
