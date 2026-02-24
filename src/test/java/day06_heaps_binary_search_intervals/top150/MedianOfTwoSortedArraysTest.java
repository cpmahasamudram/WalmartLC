package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    void oddTotalLength() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.00001);
    }

    @Test
    void evenTotalLength() {
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.00001);
    }

    @Test
    void oneEmptyArray() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{}, new int[]{1, 2, 3}), 0.00001);
    }

    @Test
    void singleElementEach() {
        assertEquals(1.5, solution.findMedianSortedArrays(new int[]{1}, new int[]{2}), 0.00001);
    }

    @Test
    void noOverlap() {
        assertEquals(3.5, solution.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}), 0.00001);
    }

    @Test
    void interleavedArrays() {
        assertEquals(3.0, solution.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4}), 0.00001);
    }
}
