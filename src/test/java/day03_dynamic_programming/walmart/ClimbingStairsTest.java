package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.ClimbingStairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    void basicCaseTwoSteps() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void basicCaseThreeSteps() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void singleStep() {
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    void fourSteps() {
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    void tenSteps() {
        assertEquals(89, solution.climbStairs(10));
    }

    @Test
    void upperBoundary() {
        assertEquals(1836311903, solution.climbStairs(45));
    }
}
