package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.Permutations;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    private final Permutations solution = new Permutations();

    @Test
    void threeElements() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertEquals(6, result.size());
    }

    @Test
    void twoElements() {
        List<List<Integer>> result = solution.permute(new int[]{0, 1});
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(0, 1)));
        assertTrue(result.contains(List.of(1, 0)));
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.permute(new int[]{1});
        assertEquals(1, result.size());
        assertEquals(List.of(1), result.get(0));
    }

    @Test
    void containsSpecificPermutation() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertTrue(result.contains(List.of(3, 2, 1)));
    }

    @Test
    void allPermutationsSameSize() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        for (List<Integer> perm : result) {
            assertEquals(3, perm.size());
        }
    }

    @Test
    void noDuplicatePermutations() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertEquals(result.size(), result.stream().distinct().count());
    }
}
