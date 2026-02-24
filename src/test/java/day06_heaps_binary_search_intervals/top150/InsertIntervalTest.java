package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.InsertInterval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    private final InsertInterval solution = new InsertInterval();

    @Test
    void mergeWithExisting() {
        int[][] result = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, result);
    }

    @Test
    void mergeMultiple() {
        int[][] result = solution.insert(
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, result);
    }

    @Test
    void emptyIntervals() {
        int[][] result = solution.insert(new int[][]{}, new int[]{5, 7});
        assertArrayEquals(new int[][]{{5, 7}}, result);
    }

    @Test
    void insertAtBeginning() {
        int[][] result = solution.insert(new int[][]{{3, 5}, {7, 9}}, new int[]{1, 2});
        assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {7, 9}}, result);
    }

    @Test
    void insertAtEnd() {
        int[][] result = solution.insert(new int[][]{{1, 2}, {3, 5}}, new int[]{7, 9});
        assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {7, 9}}, result);
    }

    @Test
    void mergeAll() {
        int[][] result = solution.insert(new int[][]{{1, 5}, {6, 8}}, new int[]{0, 10});
        assertArrayEquals(new int[][]{{0, 10}}, result);
    }
}
