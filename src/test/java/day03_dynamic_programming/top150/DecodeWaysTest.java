package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.DecodeWays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    private final DecodeWays solution = new DecodeWays();

    @Test
    void basicCaseTwoWays() {
        assertEquals(2, solution.numDecodings("12"));
    }

    @Test
    void basicCaseThreeWays() {
        assertEquals(3, solution.numDecodings("226"));
    }

    @Test
    void leadingZero() {
        assertEquals(0, solution.numDecodings("06"));
    }

    @Test
    void singleDigit() {
        assertEquals(1, solution.numDecodings("5"));
    }

    @Test
    void zeroOnly() {
        assertEquals(0, solution.numDecodings("0"));
    }

    @Test
    void containsZeroValidPair() {
        assertEquals(1, solution.numDecodings("10"));
    }
}
