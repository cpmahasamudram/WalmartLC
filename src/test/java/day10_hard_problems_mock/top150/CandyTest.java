package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.Candy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    private final Candy solution = new Candy();

    @Test
    void basicCase() {
        assertEquals(5, solution.candy(new int[]{1, 0, 2}));
    }

    @Test
    void equalNeighbors() {
        assertEquals(4, solution.candy(new int[]{1, 2, 2}));
    }

    @Test
    void singleChild() {
        assertEquals(1, solution.candy(new int[]{5}));
    }

    @Test
    void descendingRatings() {
        assertEquals(10, solution.candy(new int[]{4, 3, 2, 1}));
    }

    @Test
    void ascendingRatings() {
        assertEquals(10, solution.candy(new int[]{1, 2, 3, 4}));
    }

    @Test
    void valleyShape() {
        assertEquals(7, solution.candy(new int[]{3, 2, 1, 2, 3}));
    }
}
