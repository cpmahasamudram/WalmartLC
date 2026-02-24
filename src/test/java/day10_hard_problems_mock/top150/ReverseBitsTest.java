package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.ReverseBits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    private final ReverseBits solution = new ReverseBits();

    @Test
    void basicCase() {
        // 00000010100101000001111010011100 -> 00111001011110000010100101000000
        assertEquals(964176192, solution.reverseBits(43261596));
    }

    @Test
    void allOnesExceptLast() {
        // 11111111111111111111111111111101 -> 10111111111111111111111111111111
        assertEquals(-1073741825, solution.reverseBits(-3));
    }

    @Test
    void zero() {
        assertEquals(0, solution.reverseBits(0));
    }

    @Test
    void one() {
        // 00000000000000000000000000000001 -> 10000000000000000000000000000000
        assertEquals(Integer.MIN_VALUE, solution.reverseBits(1));
    }

    @Test
    void allOnes() {
        assertEquals(-1, solution.reverseBits(-1));
    }

    @Test
    void powerOfTwo() {
        // 00000000000000000000000000000100 -> 00100000000000000000000000000000
        assertEquals(536870912, solution.reverseBits(4));
    }
}
