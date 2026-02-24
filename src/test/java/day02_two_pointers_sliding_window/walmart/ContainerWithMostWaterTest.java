package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.ContainerWithMostWater;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    void basicCase() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }

    @Test
    void decreasingHeights() {
        assertEquals(6, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    @Test
    void tallEnds() {
        assertEquals(8, solution.maxArea(new int[]{8, 1, 1, 1, 8}));
    }

    @Test
    void uniform() {
        assertEquals(4, solution.maxArea(new int[]{2, 2, 2, 2, 2}));
    }
}
