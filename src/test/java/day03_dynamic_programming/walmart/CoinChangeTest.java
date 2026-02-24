package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.CoinChange;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    private final CoinChange solution = new CoinChange();

    @Test
    void basicCaseExactCoin() {
        assertEquals(1, solution.coinChange(new int[]{1, 5, 11}, 11));
    }

    @Test
    void impossible() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void zeroAmount() {
        assertEquals(0, solution.coinChange(new int[]{1}, 0));
    }

    @Test
    void multipleCoins() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void singleCoinRepeated() {
        assertEquals(4, solution.coinChange(new int[]{3}, 12));
    }

    @Test
    void largeDenominationSmallAmount() {
        assertEquals(-1, solution.coinChange(new int[]{5, 10}, 3));
    }
}
