package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.HappyNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    private final HappyNumber solution = new HappyNumber();

    @Test
    void happyNineteen() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    void notHappyTwo() {
        assertFalse(solution.isHappy(2));
    }

    @Test
    void happyOne() {
        assertTrue(solution.isHappy(1));
    }

    @Test
    void happySeven() {
        assertTrue(solution.isHappy(7));
    }

    @Test
    void notHappyFour() {
        assertFalse(solution.isHappy(4));
    }

    @Test
    void happyHundred() {
        assertTrue(solution.isHappy(100));
    }
}
