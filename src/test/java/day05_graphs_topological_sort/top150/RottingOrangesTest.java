package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.RottingOranges;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    private final RottingOranges solution = new RottingOranges();

    @Test
    void basicCase() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, solution.orangesRotting(grid));
    }

    @Test
    void impossibleToRotAll() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    void noFreshOranges() {
        int[][] grid = {{0, 2}};
        assertEquals(0, solution.orangesRotting(grid));
    }

    @Test
    void allEmpty() {
        int[][] grid = {{0}};
        assertEquals(0, solution.orangesRotting(grid));
    }

    @Test
    void singleFreshOrange() {
        int[][] grid = {{1}};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    void multipleRottenSources() {
        int[][] grid = {{2, 1, 1}, {1, 1, 1}, {1, 1, 2}};
        assertEquals(2, solution.orangesRotting(grid));
    }
}
