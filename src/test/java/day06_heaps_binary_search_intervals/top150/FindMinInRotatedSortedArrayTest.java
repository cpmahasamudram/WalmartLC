package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.FindMinInRotatedSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinInRotatedSortedArrayTest {

    private final FindMinInRotatedSortedArray solution = new FindMinInRotatedSortedArray();

    @Test
    void rotatedArray() {
        assertEquals(1, solution.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void rotatedLongerArray() {
        assertEquals(0, solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    void noRotation() {
        assertEquals(11, solution.findMin(new int[]{11, 13, 15, 17}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.findMin(new int[]{1}));
    }

    @Test
    void twoElementsRotated() {
        assertEquals(1, solution.findMin(new int[]{2, 1}));
    }

    @Test
    void minAtEnd() {
        assertEquals(0, solution.findMin(new int[]{2, 3, 4, 5, 0}));
    }
}
