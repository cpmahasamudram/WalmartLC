package test.java.day05_graphs_topological_sort.walmart;

import main.java.day05_graphs_topological_sort.walmart.NumberOfIslands;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private final NumberOfIslands solution = new NumberOfIslands();

    @Test
    void singleIsland() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void threeIslands() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void allWater() {
        char[][] grid = {
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    void allLand() {
        char[][] grid = {
            {'1', '1'},
            {'1', '1'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void singleCell() {
        char[][] grid = {{'1'}};
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void diagonalIslandsNotConnected() {
        char[][] grid = {
            {'1', '0'},
            {'0', '1'}
        };
        assertEquals(2, solution.numIslands(grid));
    }
}
