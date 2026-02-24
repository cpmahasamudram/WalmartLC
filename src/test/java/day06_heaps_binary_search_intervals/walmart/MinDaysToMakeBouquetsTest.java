package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.MinDaysToMakeBouquets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinDaysToMakeBouquetsTest {

    private final MinDaysToMakeBouquets solution = new MinDaysToMakeBouquets();

    @Test
    void basicCase() {
        assertEquals(3, solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
    }

    @Test
    void impossible() {
        assertEquals(-1, solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2));
    }

    @Test
    void needAllFlowers() {
        assertEquals(12, solution.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
    }

    @Test
    void singleFlowerBouquet() {
        assertEquals(1, solution.minDays(new int[]{1, 2, 3}, 1, 1));
    }

    @Test
    void allSameBloomDay() {
        assertEquals(5, solution.minDays(new int[]{5, 5, 5, 5}, 2, 2));
    }

    @Test
    void notEnoughFlowers() {
        assertEquals(-1, solution.minDays(new int[]{1, 2, 3}, 2, 2));
    }
}
