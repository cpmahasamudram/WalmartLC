package test.java.day08_stacks_backtracking_strings.walmart;

import main.java.day08_stacks_backtracking_strings.walmart.WordSearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    private final WordSearch solution = new WordSearch();

    private final char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };

    @Test
    void wordExists() {
        assertTrue(solution.exist(board, "ABCCED"));
    }

    @Test
    void wordExistsSEE() {
        assertTrue(solution.exist(board, "SEE"));
    }

    @Test
    void wordDoesNotExist() {
        assertFalse(solution.exist(board, "ABCB"));
    }

    @Test
    void singleCharFound() {
        assertTrue(solution.exist(new char[][]{{'A'}}, "A"));
    }

    @Test
    void singleCharNotFound() {
        assertFalse(solution.exist(new char[][]{{'A'}}, "B"));
    }

    @Test
    void cannotReuseCell() {
        char[][] smallBoard = {{'A', 'B'}, {'C', 'D'}};
        assertFalse(solution.exist(smallBoard, "ABDA"));
    }
}
