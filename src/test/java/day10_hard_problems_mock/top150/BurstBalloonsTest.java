package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.BurstBalloons;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurstBalloonsTest {

    private final BurstBalloons solution = new BurstBalloons();

    @Test
    void basicCase() {
        assertEquals(167, solution.maxCoins(new int[]{3, 1, 5, 8}));
    }

    @Test
    void twoElements() {
        assertEquals(10, solution.maxCoins(new int[]{1, 5}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.maxCoins(new int[]{1}));
    }

    @Test
    void allOnes() {
        assertEquals(4, solution.maxCoins(new int[]{1, 1, 1}));
    }

    @Test
    void singleLargeElement() {
        assertEquals(100, solution.maxCoins(new int[]{100}));
    }

    @Test
    void twoSameElements() {
        assertEquals(40, solution.maxCoins(new int[]{5, 5}));
    }
}
