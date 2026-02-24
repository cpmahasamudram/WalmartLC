package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.NumberOf1Bits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {

    private final NumberOf1Bits solution = new NumberOf1Bits();

    @Test
    void binaryThreeBits() {
        // 11 = 1011 in binary -> 3 set bits
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    void powerOfTwo() {
        // 128 = 10000000 -> 1 set bit
        assertEquals(1, solution.hammingWeight(128));
    }

    @Test
    void allBitsExceptOne() {
        // 2147483645 = 1111...101 -> 30 set bits
        assertEquals(30, solution.hammingWeight(2147483645));
    }

    @Test
    void valueOne() {
        assertEquals(1, solution.hammingWeight(1));
    }

    @Test
    void valueSevenAllOnes() {
        // 7 = 111 -> 3 set bits
        assertEquals(3, solution.hammingWeight(7));
    }

    @Test
    void value255AllOnesInByte() {
        // 255 = 11111111 -> 8 set bits
        assertEquals(8, solution.hammingWeight(255));
    }
}
