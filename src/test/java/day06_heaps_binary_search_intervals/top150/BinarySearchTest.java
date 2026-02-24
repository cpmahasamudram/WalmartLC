package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch solution = new BinarySearch();

    @Test
    void targetExists() {
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void targetNotFound() {
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void singleElementFound() {
        assertEquals(0, solution.search(new int[]{5}, 5));
    }

    @Test
    void singleElementNotFound() {
        assertEquals(-1, solution.search(new int[]{5}, 3));
    }

    @Test
    void targetAtBeginning() {
        assertEquals(0, solution.search(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void targetAtEnd() {
        assertEquals(4, solution.search(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
