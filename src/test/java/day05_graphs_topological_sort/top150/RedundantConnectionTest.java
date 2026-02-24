package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.RedundantConnection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {

    private final RedundantConnection solution = new RedundantConnection();

    @Test
    void basicTriangle() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        assertArrayEquals(new int[]{2, 3}, solution.findRedundantConnection(edges));
    }

    @Test
    void fourNodeCycle() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        assertArrayEquals(new int[]{1, 4}, solution.findRedundantConnection(edges));
    }

    @Test
    void lastEdgeCausesCycle() {
        int[][] edges = {{1, 2}, {2, 3}, {1, 3}};
        assertArrayEquals(new int[]{1, 3}, solution.findRedundantConnection(edges));
    }

    @Test
    void linearWithExtraEdge() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {2, 4}};
        assertArrayEquals(new int[]{2, 4}, solution.findRedundantConnection(edges));
    }

    @Test
    void fiveNodeCycle() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertArrayEquals(new int[]{1, 5}, solution.findRedundantConnection(edges));
    }
}
