package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.MoveZeroes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    void basicCase() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void singleZero() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void noZeroes() {
        int[] nums = {1, 2, 3};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void allZeroes() {
        int[] nums = {0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    void zerosAtStart() {
        int[] nums = {0, 0, 1};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }

    @Test
    void singleNonZero() {
        int[] nums = {1};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1}, nums);
    }
}
