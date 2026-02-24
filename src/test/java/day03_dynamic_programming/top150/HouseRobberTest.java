package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.HouseRobber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private final HouseRobber solution = new HouseRobber();

    @Test
    void basicCaseFourHouses() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void basicCaseFiveHouses() {
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void singleHouse() {
        assertEquals(5, solution.rob(new int[]{5}));
    }

    @Test
    void twoHouses() {
        assertEquals(7, solution.rob(new int[]{3, 7}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.rob(new int[]{0, 0, 0, 0}));
    }

    @Test
    void adjacentDecision() {
        assertEquals(4, solution.rob(new int[]{2, 1, 1, 2}));
    }
}
