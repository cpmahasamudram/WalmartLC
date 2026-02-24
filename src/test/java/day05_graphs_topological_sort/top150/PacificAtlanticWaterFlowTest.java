package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.PacificAtlanticWaterFlow;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlowTest {

    private final PacificAtlanticWaterFlow solution = new PacificAtlanticWaterFlow();

    @Test
    void basicCase() {
        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        Set<List<Integer>> resultSet = new HashSet<>(result);
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
            Arrays.asList(0, 4), Arrays.asList(1, 3), Arrays.asList(1, 4),
            Arrays.asList(2, 2), Arrays.asList(3, 0), Arrays.asList(3, 1),
            Arrays.asList(4, 0)
        ));
        assertEquals(expected, resultSet);
    }

    @Test
    void singleCell() {
        int[][] heights = {{1}};
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList(0, 0), result.get(0));
    }

    @Test
    void flatGrid() {
        int[][] heights = {
            {1, 1},
            {1, 1}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(4, result.size());
    }

    @Test
    void singleRow() {
        int[][] heights = {{1, 2, 3}};
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        // All cells in a single row can reach both oceans
        assertEquals(3, result.size());
    }

    @Test
    void singleColumn() {
        int[][] heights = {{1}, {2}, {3}};
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(3, result.size());
    }

    @Test
    void decreasingGrid() {
        int[][] heights = {
            {5, 4, 3},
            {4, 3, 2},
            {3, 2, 1}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        // Top-left corner reaches Pacific, bottom-right reaches Atlantic
        // Only [0,0] can reach both (highest point)
        Set<List<Integer>> resultSet = new HashSet<>(result);
        assertTrue(resultSet.contains(Arrays.asList(0, 0)));
    }
}
