package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.SearchInRotatedSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    @Test
    void targetInRightHalf() {
        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void targetNotFound() {
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void singleElementNotFound() {
        assertEquals(-1, solution.search(new int[]{1}, 0));
    }

    @Test
    void singleElementFound() {
        assertEquals(0, solution.search(new int[]{1}, 1));
    }

    @Test
    void targetInLeftHalf() {
        assertEquals(1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    }

    @Test
    void noRotation() {
        assertEquals(2, solution.search(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
