package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.MergeIntervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    private final MergeIntervals solution = new MergeIntervals();

    @Test
    void overlappingIntervals() {
        int[][] result = solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }

    @Test
    void touchingIntervals() {
        int[][] result = solution.merge(new int[][]{{1, 4}, {4, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void singleInterval() {
        int[][] result = solution.merge(new int[][]{{1, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void allMergeIntoOne() {
        int[][] result = solution.merge(new int[][]{{1, 4}, {2, 5}, {3, 6}});
        assertArrayEquals(new int[][]{{1, 6}}, result);
    }

    @Test
    void noOverlap() {
        int[][] result = solution.merge(new int[][]{{1, 2}, {4, 5}, {7, 8}});
        assertArrayEquals(new int[][]{{1, 2}, {4, 5}, {7, 8}}, result);
    }

    @Test
    void unsortedInput() {
        int[][] result = solution.merge(new int[][]{{8, 10}, {1, 3}, {2, 6}, {15, 18}});
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }
}
