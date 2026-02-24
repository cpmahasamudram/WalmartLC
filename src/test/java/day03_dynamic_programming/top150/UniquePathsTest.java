package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.UniquePaths;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    private final UniquePaths solution = new UniquePaths();

    @Test
    void basicCase3x7() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void basicCase3x2() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }

    @Test
    void singleCell() {
        assertEquals(1, solution.uniquePaths(1, 1));
    }

    @Test
    void singleRow() {
        assertEquals(1, solution.uniquePaths(1, 5));
    }

    @Test
    void singleColumn() {
        assertEquals(1, solution.uniquePaths(5, 1));
    }

    @Test
    void squareGrid() {
        assertEquals(6, solution.uniquePaths(3, 3));
    }
}
