package main.java.day08_stacks_backtracking_strings.walmart;

/**
 * LC 79 - Word Search
 * Difficulty: Medium | Source: WALMART
 *
 * Given an m x n grid of characters board and a string word, return true if word exists
 * in the grid. The word can be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring. The same letter cell
 * may not be used more than once.
 *
 * Example 1: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 *            -> Output: true
 * Example 2: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 *            -> Output: true
 * Example 3: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 *            -> Output: false
 *
 * Constraints:
 * - m == board.length
 * - n == board[i].length
 * - 1 <= m, n <= 6
 * - 1 <= word.length <= 15
 * - board and word consist of only lowercase and uppercase English letters
 *
 * PATTERN: DFS backtracking on grid
 * HINT: For each cell matching word[0], start a DFS. Mark cells as visited (e.g., set to '#'),
 *       explore all 4 directions, and restore the cell on backtrack. Return true if the entire
 *       word is matched.
 *
 * TIME: O(m * n * 4^L) where L = word.length | SPACE: O(L) recursion depth
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        // TODO: Implement your solution here
        return false;
    }
}
