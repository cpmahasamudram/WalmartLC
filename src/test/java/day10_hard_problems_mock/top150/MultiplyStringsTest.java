package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.MultiplyStrings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    private final MultiplyStrings solution = new MultiplyStrings();

    @Test
    void basicCase() {
        assertEquals("6", solution.multiply("2", "3"));
    }

    @Test
    void largerNumbers() {
        assertEquals("56088", solution.multiply("123", "456"));
    }

    @Test
    void multiplyByZero() {
        assertEquals("0", solution.multiply("0", "12345"));
    }

    @Test
    void bothZeros() {
        assertEquals("0", solution.multiply("0", "0"));
    }

    @Test
    void singleDigits() {
        assertEquals("81", solution.multiply("9", "9"));
    }

    @Test
    void largeMultiplication() {
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
    }
}
