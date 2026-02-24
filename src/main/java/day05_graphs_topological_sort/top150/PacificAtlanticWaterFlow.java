package main.java.day05_graphs_topological_sort.top150;

import java.util.List;

/**
 * LC 417 - Pacific Atlantic Water Flow
 * Difficulty: Medium | Source: TOP 150
 *
 * There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean.
 * The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches
 * the island's right and bottom edges. The island receives rain and water can flow to
 * neighboring cells directly north, south, east, and west if the neighboring cell's height
 * is less than or equal to the current cell's height. Water can also flow into the ocean
 * from any cell adjacent to the ocean.
 *
 * Return a 2D list of grid coordinates where water can flow to both the Pacific and Atlantic.
 *
 * Example 1:
 *   Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 *   Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 *
 * Example 2:
 *   Input: heights = [[1]]
 *   Output: [[0,0]]
 *
 * Constraints:
 * - m == heights.length
 * - n == heights[r].length
 * - 1 <= m, n <= 200
 * - 0 <= heights[r][c] <= 100000
 *
 * PATTERN: DFS/BFS from both oceans, find intersection
 * HINT: Run DFS/BFS from all Pacific border cells (top row + left column) marking reachable
 *       cells. Run another DFS/BFS from all Atlantic border cells (bottom row + right column).
 *       The answer is the intersection of both reachable sets. Flow uphill (reverse direction).
 *
 * TIME: O(m * n) | SPACE: O(m * n)
 */
public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // TODO: Implement your solution here
        return List.of();
    }
}
