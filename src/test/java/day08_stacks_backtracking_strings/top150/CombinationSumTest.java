package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.CombinationSum;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private final CombinationSum solution = new CombinationSum();

    @Test
    void example1() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(2, 2, 3)));
        assertTrue(result.contains(List.of(7)));
    }

    @Test
    void example2() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 5}, 8);
        assertEquals(3, result.size());
    }

    @Test
    void noSolution() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2}, 1);
        assertTrue(result.isEmpty());
    }

    @Test
    void singleCandidateReused() {
        List<List<Integer>> result = solution.combinationSum(new int[]{3}, 9);
        assertEquals(1, result.size());
        assertEquals(List.of(3, 3, 3), result.get(0));
    }

    @Test
    void targetMatchesSingleCandidate() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 5}, 5);
        assertTrue(result.contains(List.of(5)));
        assertTrue(result.contains(List.of(2, 3)));
    }

    @Test
    void allCombinationsSumToTarget() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        for (List<Integer> combo : result) {
            assertEquals(7, combo.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
