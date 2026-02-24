package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.CountingBits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {

    private final CountingBits solution = new CountingBits();

    @Test
    void nEqualsTwo() {
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
    }

    @Test
    void nEqualsFive() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }

    @Test
    void nEqualsZero() {
        assertArrayEquals(new int[]{0}, solution.countBits(0));
    }

    @Test
    void nEqualsOne() {
        assertArrayEquals(new int[]{0, 1}, solution.countBits(1));
    }

    @Test
    void nEqualsEight() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, solution.countBits(8));
    }

    @Test
    void nEqualsFifteen() {
        int[] result = solution.countBits(15);
        assertEquals(16, result.length);
        assertEquals(0, result[0]);
        assertEquals(4, result[15]); // 15 = 1111 -> 4 bits
    }
}
