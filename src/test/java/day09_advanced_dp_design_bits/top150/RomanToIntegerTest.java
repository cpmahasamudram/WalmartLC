package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.RomanToInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private final RomanToInteger solution = new RomanToInteger();

    @Test
    void simpleAddition() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void mixedAddition() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void subtractiveNotation() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void singleCharacter() {
        assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    void subtractivePairIV() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void largestValue() {
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }
}
