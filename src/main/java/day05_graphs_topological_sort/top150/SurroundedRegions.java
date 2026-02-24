package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 130 - Surrounded Regions
 * Difficulty: Medium | Source: TOP 150
 *
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are
 * 4-directionally surrounded by 'X'. A region is captured by flipping all 'O's into 'X's
 * in that surrounded region. An 'O' on the border (or connected to a border 'O') cannot
 * be captured.
 *
 * Example 1:
 *   Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 *   Output:        [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 *   Explanation: The bottom 'O' is on the border, so it is not captured. The other 'O's are
 *   all surrounded by 'X' and are flipped.
 *
 * Example 2:
 *   Input: board = [["X"]]
 *   Output: [["X"]]
 *
 * Constraints:
 * - m == board.length
 * - n == board[i].length
 * - 1 <= m, n <= 200
 * - board[i][j] is 'X' or 'O'
 *
 * PATTERN: DFS/BFS from border 'O's (reverse thinking)
 * HINT: Instead of finding surrounded regions, mark the UN-surrounded ones. DFS/BFS from
 *       every 'O' on the border, marking connected 'O's as safe (e.g., 'T'). Then iterate
 *       through the board: flip remaining 'O's to 'X' and restore 'T's back to 'O'.
 *
 * TIME: O(m * n) | SPACE: O(m * n)
 */
public class SurroundedRegions {

    public void solve(char[][] board) {
        // TODO: Implement your solution here
    }
}
