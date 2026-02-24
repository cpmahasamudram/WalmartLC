package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.NQueens;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {

    private final NQueens solution = new NQueens();

    @Test
    void nEquals1() {
        List<List<String>> result = solution.solveNQueens(1);
        assertEquals(1, result.size());
        assertEquals(List.of("Q"), result.get(0));
    }

    @Test
    void nEquals4() {
        List<List<String>> result = solution.solveNQueens(4);
        assertEquals(2, result.size());
    }

    @Test
    void nEquals2HasNoSolution() {
        List<List<String>> result = solution.solveNQueens(2);
        assertTrue(result.isEmpty());
    }

    @Test
    void nEquals3HasNoSolution() {
        List<List<String>> result = solution.solveNQueens(3);
        assertTrue(result.isEmpty());
    }

    @Test
    void nEquals8() {
        List<List<String>> result = solution.solveNQueens(8);
        assertEquals(92, result.size());
    }

    @Test
    void boardRowsHaveCorrectLength() {
        List<List<String>> result = solution.solveNQueens(4);
        for (List<String> board : result) {
            assertEquals(4, board.size());
            for (String row : board) {
                assertEquals(4, row.length());
            }
        }
    }
}
