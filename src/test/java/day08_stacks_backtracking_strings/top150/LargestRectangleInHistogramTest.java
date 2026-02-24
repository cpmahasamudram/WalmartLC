package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.LargestRectangleInHistogram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {

    private final LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    @Test
    void example1() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    void twoBars() {
        assertEquals(4, solution.largestRectangleArea(new int[]{2, 4}));
    }

    @Test
    void singleBar() {
        assertEquals(5, solution.largestRectangleArea(new int[]{5}));
    }

    @Test
    void allSameHeight() {
        assertEquals(12, solution.largestRectangleArea(new int[]{3, 3, 3, 3}));
    }

    @Test
    void increasingHeights() {
        assertEquals(6, solution.largestRectangleArea(new int[]{1, 2, 3, 4}));
    }

    @Test
    void decreasingHeights() {
        assertEquals(6, solution.largestRectangleArea(new int[]{4, 3, 2, 1}));
    }
}
