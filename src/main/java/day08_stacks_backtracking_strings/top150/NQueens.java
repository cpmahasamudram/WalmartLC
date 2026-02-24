package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 51 - N-Queens
 * Difficulty: Hard | Source: TOP 150
 *
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that
 * no two queens attack each other. Given an integer n, return all distinct solutions to the
 * n-queens puzzle. You may return the answer in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where
 * 'Q' and '.' both indicate a queen and an empty space, respectively.
 *
 * Example 1: n = 4 -> Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Example 2: n = 1 -> Output: [["Q"]]
 *
 * Constraints:
 * - 1 <= n <= 9
 *
 * PATTERN: Backtracking with column/diagonal tracking
 * HINT: Place queens row by row. Use sets (or boolean arrays) to track occupied columns,
 *       main diagonals (row - col), and anti-diagonals (row + col). For each row, try
 *       each column; if safe, place the queen and recurse. Backtrack by removing the queen
 *       and clearing the sets.
 *
 * TIME: O(n!) | SPACE: O(n^2) for the board
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        // TODO: Implement your solution here
        return null;
    }
}
