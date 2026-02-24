package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.NumberOfConnectedComponents;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfConnectedComponentsTest {

    private final NumberOfConnectedComponents solution = new NumberOfConnectedComponents();

    @Test
    void twoComponents() {
        assertEquals(2, solution.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
    }

    @Test
    void oneComponent() {
        assertEquals(1, solution.countComponents(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}));
    }

    @Test
    void allDisconnected() {
        assertEquals(4, solution.countComponents(4, new int[][]{}));
    }

    @Test
    void singleNode() {
        assertEquals(1, solution.countComponents(1, new int[][]{}));
    }

    @Test
    void threeComponents() {
        assertEquals(3, solution.countComponents(6, new int[][]{{0, 1}, {2, 3}, {4, 5}}));
    }

    @Test
    void starGraph() {
        assertEquals(1, solution.countComponents(4, new int[][]{{0, 1}, {0, 2}, {0, 3}}));
    }
}
