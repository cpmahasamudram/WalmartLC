package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.SearchA2DMatrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {

    private final SearchA2DMatrix solution = new SearchA2DMatrix();

    @Test
    void targetExists() {
        assertTrue(solution.searchMatrix(
                new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }

    @Test
    void targetNotFound() {
        assertFalse(solution.searchMatrix(
                new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }

    @Test
    void singleElement() {
        assertTrue(solution.searchMatrix(new int[][]{{1}}, 1));
    }

    @Test
    void singleElementNotFound() {
        assertFalse(solution.searchMatrix(new int[][]{{1}}, 2));
    }

    @Test
    void targetAtFirstPosition() {
        assertTrue(solution.searchMatrix(
                new int[][]{{1, 3, 5}, {7, 9, 11}}, 1));
    }

    @Test
    void targetAtLastPosition() {
        assertTrue(solution.searchMatrix(
                new int[][]{{1, 3, 5}, {7, 9, 11}}, 11));
    }
}
