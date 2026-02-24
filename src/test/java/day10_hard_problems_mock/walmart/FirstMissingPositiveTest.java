package test.java.day10_hard_problems_mock.walmart;

import main.java.day10_hard_problems_mock.walmart.FirstMissingPositive;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

    private final FirstMissingPositive solution = new FirstMissingPositive();

    @Test
    void basicMissingThree() {
        assertEquals(3, solution.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    void missingTwo() {
        assertEquals(2, solution.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    void allLargeNumbers() {
        assertEquals(1, solution.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    @Test
    void singleElementOne() {
        assertEquals(2, solution.firstMissingPositive(new int[]{1}));
    }

    @Test
    void singleElementNotOne() {
        assertEquals(1, solution.firstMissingPositive(new int[]{2}));
    }

    @Test
    void consecutiveStartingFromOne() {
        assertEquals(4, solution.firstMissingPositive(new int[]{1, 2, 3}));
    }
}
