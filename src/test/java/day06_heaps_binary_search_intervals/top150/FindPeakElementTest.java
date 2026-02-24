package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.FindPeakElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    private final FindPeakElement solution = new FindPeakElement();

    @Test
    void singlePeak() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    void multiplePeaks() {
        int result = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        assertTrue(result == 1 || result == 5);
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.findPeakElement(new int[]{1}));
    }

    @Test
    void ascendingArray() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3}));
    }

    @Test
    void descendingArray() {
        assertEquals(0, solution.findPeakElement(new int[]{3, 2, 1}));
    }

    @Test
    void twoElements() {
        int result = solution.findPeakElement(new int[]{1, 2});
        assertEquals(1, result);
    }
}
