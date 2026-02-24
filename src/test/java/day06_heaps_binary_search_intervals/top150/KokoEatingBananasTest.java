package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.KokoEatingBananas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

    private final KokoEatingBananas solution = new KokoEatingBananas();

    @Test
    void basicCase() {
        assertEquals(4, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    void exactHours() {
        assertEquals(30, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    void extraHours() {
        assertEquals(23, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    @Test
    void singlePile() {
        assertEquals(5, solution.minEatingSpeed(new int[]{10}, 2));
    }

    @Test
    void allSamePiles() {
        assertEquals(4, solution.minEatingSpeed(new int[]{4, 4, 4, 4}, 4));
    }

    @Test
    void plentyOfTime() {
        assertEquals(1, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 27));
    }
}
