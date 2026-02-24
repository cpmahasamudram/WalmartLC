package test.java.day10_hard_problems_mock.walmart;

import main.java.day10_hard_problems_mock.walmart.SlidingWindowMedian;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMedianTest {

    private final SlidingWindowMedian solution = new SlidingWindowMedian();

    @Test
    void basicOddWindow() {
        assertArrayEquals(new double[]{1.0, -1.0, -1.0, 3.0, 5.0, 6.0},
                solution.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3),
                1e-5);
    }

    @Test
    void basicEvenWindow() {
        assertArrayEquals(new double[]{2.0, 1.0, 1.0, 4.0, 5.5},
                solution.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 4),
                1e-5);
    }

    @Test
    void windowSizeOne() {
        assertArrayEquals(new double[]{1.0, 2.0, 3.0},
                solution.medianSlidingWindow(new int[]{1, 2, 3}, 1),
                1e-5);
    }

    @Test
    void windowEqualsArrayLength() {
        assertArrayEquals(new double[]{2.0},
                solution.medianSlidingWindow(new int[]{1, 2, 3}, 3),
                1e-5);
    }

    @Test
    void twoElementWindow() {
        assertArrayEquals(new double[]{1.5, 2.5, 3.5},
                solution.medianSlidingWindow(new int[]{1, 2, 3, 4}, 2),
                1e-5);
    }

    @Test
    void largeValues() {
        assertArrayEquals(new double[]{2147483647.0},
                solution.medianSlidingWindow(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, 2),
                1e-5);
    }
}
