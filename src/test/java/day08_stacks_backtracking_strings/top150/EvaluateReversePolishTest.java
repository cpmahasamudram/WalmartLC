package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.EvaluateReversePolish;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishTest {

    private final EvaluateReversePolish solution = new EvaluateReversePolish();

    @Test
    void additionAndMultiplication() {
        assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void divisionTruncation() {
        assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void complexExpression() {
        assertEquals(22, solution.evalRPN(
                new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    void singleNumber() {
        assertEquals(42, solution.evalRPN(new String[]{"42"}));
    }

    @Test
    void subtraction() {
        assertEquals(1, solution.evalRPN(new String[]{"3", "2", "-"}));
    }

    @Test
    void negativeResult() {
        assertEquals(-1, solution.evalRPN(new String[]{"2", "3", "-"}));
    }
}
