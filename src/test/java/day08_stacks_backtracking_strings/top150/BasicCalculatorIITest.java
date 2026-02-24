package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.BasicCalculatorII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {

    private final BasicCalculatorII solution = new BasicCalculatorII();

    @Test
    void additionAndMultiplication() {
        assertEquals(7, solution.calculate("3+2*2"));
    }

    @Test
    void divisionTruncation() {
        assertEquals(1, solution.calculate(" 3/2 "));
    }

    @Test
    void additionAndDivision() {
        assertEquals(5, solution.calculate(" 3+5 / 2 "));
    }

    @Test
    void singleNumber() {
        assertEquals(42, solution.calculate("42"));
    }

    @Test
    void subtraction() {
        assertEquals(1, solution.calculate("3-2"));
    }

    @Test
    void multipleOperations() {
        assertEquals(13, solution.calculate("2*3+4+3"));
    }
}
