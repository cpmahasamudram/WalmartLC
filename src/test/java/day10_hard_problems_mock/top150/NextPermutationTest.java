package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.NextPermutation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    private final NextPermutation solution = new NextPermutation();

    @Test
    void basicCase() {
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    void descendingWrapAround() {
        int[] nums = {3, 2, 1};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void duplicateElements() {
        int[] nums = {1, 1, 5};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    void singleElement() {
        int[] nums = {1};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void midPermutation() {
        int[] nums = {1, 3, 2};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{2, 1, 3}, nums);
    }

    @Test
    void longerArray() {
        int[] nums = {2, 3, 1};
        solution.nextPermutation(nums);
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }
}
