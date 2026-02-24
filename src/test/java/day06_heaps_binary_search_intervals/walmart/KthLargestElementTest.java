package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.KthLargestElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    private final KthLargestElement solution = new KthLargestElement();

    @Test
    void basicCase() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void withDuplicates() {
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.findKthLargest(new int[]{1}, 1));
    }

    @Test
    void kEqualsLength() {
        assertEquals(1, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6));
    }

    @Test
    void kEqualsOne() {
        assertEquals(6, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 1));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-1, solution.findKthLargest(new int[]{-1, -2, -3, -4}, 1));
    }
}
