package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.IntegerToRoman;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    private final IntegerToRoman solution = new IntegerToRoman();

    @Test
    void largeNumber() {
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));
    }

    @Test
    void fiftyEight() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void subtractiveForm() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    void singleDigit() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void one() {
        assertEquals("I", solution.intToRoman(1));
    }

    @Test
    void maxValue() {
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}
