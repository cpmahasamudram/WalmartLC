package test.java.day08_stacks_backtracking_strings.walmart;

import main.java.day08_stacks_backtracking_strings.walmart.DailyTemperatures;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    void example1() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void allIncreasing() {
        assertArrayEquals(new int[]{1, 1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    @Test
    void strictlyIncreasing() {
        assertArrayEquals(new int[]{1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 60, 90}));
    }

    @Test
    void allDecreasing() {
        assertArrayEquals(new int[]{0, 0, 0, 0},
                solution.dailyTemperatures(new int[]{90, 80, 70, 60}));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{0},
                solution.dailyTemperatures(new int[]{50}));
    }

    @Test
    void allSameTemperature() {
        assertArrayEquals(new int[]{0, 0, 0},
                solution.dailyTemperatures(new int[]{70, 70, 70}));
    }
}
