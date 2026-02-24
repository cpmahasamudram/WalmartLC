package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.SingleNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private final SingleNumber solution = new SingleNumber();

    @Test
    void singleAtEnd() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void singleInMiddle() {
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-1, solution.singleNumber(new int[]{-1, 3, 3}));
    }

    @Test
    void zeroIsSingle() {
        assertEquals(0, solution.singleNumber(new int[]{5, 0, 5}));
    }

    @Test
    void largerArray() {
        assertEquals(99, solution.singleNumber(new int[]{1, 2, 3, 1, 2, 3, 99}));
    }
}
