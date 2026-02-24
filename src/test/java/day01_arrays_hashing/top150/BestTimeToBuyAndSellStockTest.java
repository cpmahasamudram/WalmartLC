package test.java.day01_arrays_hashing.top150;

import main.java.day01_arrays_hashing.top150.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void basicCase() {
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void decreasingPrices() {
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.maxProfit(new int[]{5}));
    }

    @Test
    void profitAtEnd() {
        assertEquals(8, solution.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0}));
    }

    @Test
    void buyAndSellSamePrice() {
        assertEquals(0, solution.maxProfit(new int[]{3, 3, 3, 3}));
    }

    @Test
    void twoElements() {
        assertEquals(3, solution.maxProfit(new int[]{1, 4}));
    }

    @Test
    void minAtStart() {
        assertEquals(8, solution.maxProfit(new int[]{1, 4, 2, 9}));
    }
}