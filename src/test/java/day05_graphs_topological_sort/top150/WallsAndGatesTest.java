package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.WallsAndGates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WallsAndGatesTest {

    private static final int INF = Integer.MAX_VALUE;
    private final WallsAndGates solution = new WallsAndGates();

    @Test
    void basicCase() {
        int[][] rooms = {
            {INF, -1, 0, INF},
            {INF, INF, INF, -1},
            {INF, -1, INF, -1},
            {0, -1, INF, INF}
        };
        solution.wallsAndGates(rooms);
        int[][] expected = {
            {3, -1, 0, 1},
            {2, 2, 1, -1},
            {1, -1, 2, -1},
            {0, -1, 3, 4}
        };
        assertArrayEquals(expected, rooms);
    }

    @Test
    void singleWall() {
        int[][] rooms = {{-1}};
        solution.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{-1}}, rooms);
    }

    @Test
    void singleEmptyRoom() {
        int[][] rooms = {{INF}};
        solution.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{INF}}, rooms);
    }

    @Test
    void singleGate() {
        int[][] rooms = {{0}};
        solution.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{0}}, rooms);
    }

    @Test
    void allGates() {
        int[][] rooms = {{0, 0}, {0, 0}};
        solution.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{0, 0}, {0, 0}}, rooms);
    }

    @Test
    void unreachableRoom() {
        int[][] rooms = {
            {INF, -1},
            {-1, 0}
        };
        solution.wallsAndGates(rooms);
        int[][] expected = {
            {INF, -1},
            {-1, 0}
        };
        assertArrayEquals(expected, rooms);
    }
}
