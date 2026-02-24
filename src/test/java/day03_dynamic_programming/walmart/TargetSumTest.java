package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.TargetSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

    private final TargetSum solution = new TargetSum();

    @Test
    void basicCaseFiveOnes() {
        assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    void singleElementMatch() {
        assertEquals(1, solution.findTargetSumWays(new int[]{1}, 1));
    }

    @Test
    void singleElementNoMatch() {
        assertEquals(0, solution.findTargetSumWays(new int[]{1}, 2));
    }

    @Test
    void targetZero() {
        assertEquals(2, solution.findTargetSumWays(new int[]{1, 1}, 0));
    }

    @Test
    void allZeros() {
        assertEquals(8, solution.findTargetSumWays(new int[]{0, 0, 0}, 0));
    }

    @Test
    void negativeTarget() {
        assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, -3));
    }
}
