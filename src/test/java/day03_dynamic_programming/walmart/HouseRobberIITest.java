package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.HouseRobberII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {

    private final HouseRobberII solution = new HouseRobberII();

    @Test
    void basicCaseThreeHouses() {
        assertEquals(3, solution.rob(new int[]{2, 3, 2}));
    }

    @Test
    void basicCaseFourHouses() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void threeHousesPickMiddle() {
        assertEquals(3, solution.rob(new int[]{1, 2, 3}));
    }

    @Test
    void singleHouse() {
        assertEquals(5, solution.rob(new int[]{5}));
    }

    @Test
    void twoHouses() {
        assertEquals(3, solution.rob(new int[]{1, 3}));
    }

    @Test
    void allSameValues() {
        assertEquals(4, solution.rob(new int[]{2, 2, 2, 2}));
    }
}
