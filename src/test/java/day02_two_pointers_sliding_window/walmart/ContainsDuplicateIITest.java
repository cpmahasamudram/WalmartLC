package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.ContainsDuplicateII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    private final ContainsDuplicateII solution = new ContainsDuplicateII();

    @Test
    void basicTrue() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void adjacentDuplicate() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    void tooFarApart() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    void noDuplicates() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    void kZero() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 1}, 0));
    }

    @Test
    void singleElement() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1}, 1));
    }
}
