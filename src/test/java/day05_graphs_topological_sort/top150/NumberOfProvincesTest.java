package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.NumberOfProvinces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    private final NumberOfProvinces solution = new NumberOfProvinces();

    @Test
    void twoProvinces() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        assertEquals(2, solution.findCircleNum(isConnected));
    }

    @Test
    void threeProvinces() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, solution.findCircleNum(isConnected));
    }

    @Test
    void allConnected() {
        int[][] isConnected = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        assertEquals(1, solution.findCircleNum(isConnected));
    }

    @Test
    void singleCity() {
        int[][] isConnected = {{1}};
        assertEquals(1, solution.findCircleNum(isConnected));
    }

    @Test
    void transitiveConnection() {
        // 0-1 connected, 1-2 connected => 0,1,2 in one province; 3 alone
        int[][] isConnected = {
            {1, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 1}
        };
        assertEquals(2, solution.findCircleNum(isConnected));
    }

    @Test
    void twoPairsOfCities() {
        int[][] isConnected = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };
        assertEquals(2, solution.findCircleNum(isConnected));
    }
}
