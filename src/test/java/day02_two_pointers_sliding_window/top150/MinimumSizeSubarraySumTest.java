package test.java.day02_two_pointers_sliding_window.top150;

import main.java.day02_two_pointers_sliding_window.top150.MinimumSizeSubarraySum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    private final MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    @Test
    void basicCase() {
        assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void singleElementMatch() {
        assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 4, 4}));
    }

    @Test
    void impossible() {
        assertEquals(0, solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void entireArray() {
        assertEquals(3, solution.minSubArrayLen(6, new int[]{1, 2, 3}));
    }

    @Test
    void firstElement() {
        assertEquals(1, solution.minSubArrayLen(5, new int[]{5, 1, 2, 3}));
    }

    @Test
    void lastElement() {
        assertEquals(1, solution.minSubArrayLen(10, new int[]{1, 2, 3, 10}));
    }
}
