package main.java.day05_graphs_topological_sort.walmart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        int r = grid.length;
        int c = grid[0].length;
        int components = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(grid[i][j] == '1') {
                    components++;
                    bfs(i, j , grid);
                }
            }
        }
        return components;
    }

    void bfs(int i, int j, char[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = '0';

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            List<int[]> neighbors = getNeighbors(cur, grid);
            for(int[] loc : neighbors) {
                if(grid[loc[0]][loc[1]] == '1') {
                    q.add(loc);
                    grid[loc[0]][loc[1]] = '0';
                }
            }
        }
    }

    private List<int[]> getNeighbors(int[] cur, char[][] grid) {
        List<int[]> res = new ArrayList<>();
        int i = cur[0];
        int j = cur[1];
        int r = grid.length-1;
        int c = grid[0].length-1;

        if(i >=0 && i < r)
            res.add(new int[] {i+1 , j});
        if(j >=0 && j < c)
            res.add(new int[] {i , j+1});
        if(i > 0 && i <= r)
            res.add(new int[] {i-1, j});
        if(j > 0 && j <= c)
            res.add(new int[] {i, j-1});

        return res;
    }
}
