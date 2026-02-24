package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.MaxProfitJobScheduling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxProfitJobSchedulingTest {

    private final MaxProfitJobScheduling solution = new MaxProfitJobScheduling();

    @Test
    void basicCase() {
        assertEquals(120, solution.jobScheduling(
                new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
    }

    @Test
    void fiveJobs() {
        assertEquals(150, solution.jobScheduling(
                new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
    }

    @Test
    void nonOverlapping() {
        assertEquals(6, solution.jobScheduling(
                new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3}));
    }

    @Test
    void singleJob() {
        assertEquals(50, solution.jobScheduling(
                new int[]{1}, new int[]{3}, new int[]{50}));
    }

    @Test
    void allOverlapping() {
        assertEquals(100, solution.jobScheduling(
                new int[]{1, 1, 1}, new int[]{5, 5, 5}, new int[]{50, 100, 30}));
    }

    @Test
    void chainedJobs() {
        assertEquals(250, solution.jobScheduling(
                new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5, 6}, new int[]{50, 50, 50, 50, 50}));
    }
}
