package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.MinCostClimbingStairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void basicCaseThreeSteps() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    void basicCaseTenSteps() {
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void twoStepsPickCheaper() {
        assertEquals(1, solution.minCostClimbingStairs(new int[]{1, 100}));
    }

    @Test
    void twoStepsEqual() {
        assertEquals(5, solution.minCostClimbingStairs(new int[]{5, 5}));
    }

    @Test
    void allZeroCosts() {
        assertEquals(0, solution.minCostClimbingStairs(new int[]{0, 0, 0, 0}));
    }

    @Test
    void increasingCosts() {
        assertEquals(2, solution.minCostClimbingStairs(new int[]{0, 1, 2, 3}));
    }
}
