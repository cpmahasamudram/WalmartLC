package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.NonOverlappingIntervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    private final NonOverlappingIntervals solution = new NonOverlappingIntervals();

    @Test
    void removeOneInterval() {
        assertEquals(1, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    void allDuplicates() {
        assertEquals(2, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    @Test
    void noOverlap() {
        assertEquals(0, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {2, 3}}));
    }

    @Test
    void singleInterval() {
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1, 5}}));
    }

    @Test
    void allOverlapping() {
        assertEquals(2, solution.eraseOverlapIntervals(
                new int[][]{{1, 4}, {2, 5}, {3, 6}}));
    }

    @Test
    void chainOfIntervals() {
        assertEquals(0, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
    }
}
