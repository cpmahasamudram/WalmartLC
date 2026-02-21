package day01_arrays_hashing.walmart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    void classicCase() {
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void vShape() {
        assertEquals(9, solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void noWater_ascending() {
        assertEquals(0, solution.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void noWater_descending() {
        assertEquals(0, solution.trap(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void singleBar() {
        assertEquals(0, solution.trap(new int[]{5}));
    }

    @Test
    void twoBars() {
        assertEquals(0, solution.trap(new int[]{3, 1}));
    }

    @Test
    void flatBars() {
        assertEquals(0, solution.trap(new int[]{3, 3, 3, 3}));
    }

    @Test
    void simplePool() {
        // [3, 0, 3] → traps 3 units
        assertEquals(3, solution.trap(new int[]{3, 0, 3}));
    }

    @Test
    void multiplePools() {
        // [2,0,2,0,2] → 2 pools of 2 each = 4
        assertEquals(4, solution.trap(new int[]{2, 0, 2, 0, 2}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.trap(new int[]{0, 0, 0, 0}));
    }
}
