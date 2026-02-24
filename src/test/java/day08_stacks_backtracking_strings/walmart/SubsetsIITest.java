package test.java.day08_stacks_backtracking_strings.walmart;

import main.java.day08_stacks_backtracking_strings.walmart.SubsetsII;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SubsetsIITest {

    private final SubsetsII solution = new SubsetsII();

    @Test
    void withDuplicates() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 2});
        assertEquals(6, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{0});
        assertEquals(2, result.size());
    }

    @Test
    void allDuplicates() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 1, 1});
        // subsets: [], [1], [1,1], [1,1,1]
        assertEquals(4, result.size());
    }

    @Test
    void noDuplicates() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 3});
        // 2^3 = 8 subsets
        assertEquals(8, result.size());
    }

    @Test
    void containsEmptySubset() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 2});
        assertTrue(result.contains(List.of()));
    }

    @Test
    void containsFullSet() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 2});
        assertTrue(result.contains(List.of(1, 2, 2)));
    }
}
