package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.PowXN;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowXNTest {

    private final PowXN solution = new PowXN();

    @Test
    void positiveExponent() {
        assertEquals(1024.0, solution.myPow(2.0, 10), 1e-5);
    }

    @Test
    void fractionalBase() {
        assertEquals(9.261, solution.myPow(2.1, 3), 1e-3);
    }

    @Test
    void negativeExponent() {
        assertEquals(0.25, solution.myPow(2.0, -2), 1e-5);
    }

    @Test
    void exponentZero() {
        assertEquals(1.0, solution.myPow(5.0, 0), 1e-5);
    }

    @Test
    void baseOne() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MAX_VALUE), 1e-5);
    }

    @Test
    void intMinExponent() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MIN_VALUE), 1e-5);
    }
}
