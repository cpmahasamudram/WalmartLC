package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.SurroundedRegions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {

    private final SurroundedRegions solution = new SurroundedRegions();

    @Test
    void basicCapture() {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void singleCell() {
        char[][] board = {{'X'}};
        solution.solve(board);
        assertArrayEquals(new char[][]{{'X'}}, board);
    }

    @Test
    void allBorderOs() {
        char[][] board = {
            {'O', 'O'},
            {'O', 'O'}
        };
        solution.solve(board);
        char[][] expected = {
            {'O', 'O'},
            {'O', 'O'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void noOs() {
        char[][] board = {
            {'X', 'X'},
            {'X', 'X'}
        };
        solution.solve(board);
        char[][] expected = {
            {'X', 'X'},
            {'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void borderConnectedRegion() {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'X', 'X'}
        };
        solution.solve(board);
        // All O's are connected to border, so none should be captured
        char[][] expected = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }
}
