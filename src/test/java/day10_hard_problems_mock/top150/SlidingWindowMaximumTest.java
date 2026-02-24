package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.SlidingWindowMaximum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum solution = new SlidingWindowMaximum();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7},
                solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{1},
                solution.maxSlidingWindow(new int[]{1}, 1));
    }

    @Test
    void windowEqualsArrayLength() {
        assertArrayEquals(new int[]{5},
                solution.maxSlidingWindow(new int[]{1, 3, 5, 2, 4}, 5));
    }

    @Test
    void windowSizeOne() {
        assertArrayEquals(new int[]{1, 3, -1, -3},
                solution.maxSlidingWindow(new int[]{1, 3, -1, -3}, 1));
    }

    @Test
    void decreasingArray() {
        assertArrayEquals(new int[]{5, 4, 3},
                solution.maxSlidingWindow(new int[]{5, 4, 3, 2, 1}, 3));
    }

    @Test
    void allSameElements() {
        assertArrayEquals(new int[]{2, 2, 2},
                solution.maxSlidingWindow(new int[]{2, 2, 2, 2}, 2));
    }
}
