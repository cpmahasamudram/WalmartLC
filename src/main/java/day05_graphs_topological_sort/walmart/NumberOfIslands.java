package main.java.day05_graphs_topological_sort.walmart;

/**
 * LC 200 - Number of Islands
 * Difficulty: Medium | Source: WALMART
 *
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of the grid are
 * surrounded by water.
 *
 * Example 1:
 *   Input: grid = [
 *     ["1","1","1","1","0"],
 *     ["1","1","0","1","0"],
 *     ["1","1","0","0","0"],
 *     ["0","0","0","0","0"]
 *   ]
 *   Output: 1
 *
 * Example 2:
 *   Input: grid = [
 *     ["1","1","0","0","0"],
 *     ["1","1","0","0","0"],
 *     ["0","0","1","0","0"],
 *     ["0","0","0","1","1"]
 *   ]
 *   Output: 3
 *
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m, n <= 300
 * - grid[i][j] is '0' or '1'
 *
 * PATTERN: DFS/BFS on grid - sink visited land
 * HINT: Iterate through each cell. When you find a '1', increment count and DFS/BFS to
 *       mark all connected '1's as '0' (sink the island) so they are not counted again.
 *
 * TIME: O(m * n) | SPACE: O(m * n) worst-case recursion stack
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        // TODO: Implement your solution here
        return 0;
    }
}
