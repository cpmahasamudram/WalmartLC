package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.BestTimeBuySellCooldown;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeBuySellCooldownTest {

    private final BestTimeBuySellCooldown solution = new BestTimeBuySellCooldown();

    @Test
    void basicCase() {
        assertEquals(3, solution.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    void singleDay() {
        assertEquals(0, solution.maxProfit(new int[]{1}));
    }

    @Test
    void decreasingPrices() {
        assertEquals(0, solution.maxProfit(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void twoDaysProfit() {
        assertEquals(1, solution.maxProfit(new int[]{1, 2}));
    }

    @Test
    void twoDaysNoProfit() {
        assertEquals(0, solution.maxProfit(new int[]{2, 1}));
    }

    @Test
    void multipleTransactionsWithCooldown() {
        assertEquals(5, solution.maxProfit(new int[]{1, 3, 2, 5}));
    }
}
