package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.MinPlatforms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinPlatformsTest {

    private final MinPlatforms solution = new MinPlatforms();

    @Test
    void multipleOverlapping() {
        assertEquals(3, solution.findPlatform(
                new int[]{900, 940, 950, 1100, 1500, 1800},
                new int[]{910, 1200, 1120, 1130, 1900, 2000}));
    }

    @Test
    void noOverlap() {
        assertEquals(1, solution.findPlatform(
                new int[]{900, 1100, 1235},
                new int[]{1000, 1200, 1240}));
    }

    @Test
    void singleTrain() {
        assertEquals(1, solution.findPlatform(new int[]{900}, new int[]{1000}));
    }

    @Test
    void allOverlapping() {
        assertEquals(3, solution.findPlatform(
                new int[]{100, 200, 300},
                new int[]{500, 600, 700}));
    }

    @Test
    void arrivalEqualsDeparture() {
        assertEquals(1, solution.findPlatform(
                new int[]{900, 1000},
                new int[]{1000, 1100}));
    }

    @Test
    void twoTrains() {
        assertEquals(2, solution.findPlatform(
                new int[]{900, 950},
                new int[]{1000, 1100}));
    }
}
