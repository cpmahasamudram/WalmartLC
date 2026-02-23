package test.java.day01_arrays_hashing.walmart;

import main.java.day01_arrays_hashing.walmart.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void basicCase() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void targetInMiddle() {
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void duplicateValues() {
        int[] result = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void negativeNumbers() {
        int[] result = solution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    void mixedPositiveNegative() {
        int[] result = solution.twoSum(new int[]{-3, 4, 3, 90}, 0);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void lastTwoElements() {
        int[] result = solution.twoSum(new int[]{1, 5, 8, 3}, 11);
        assertArrayEquals(new int[]{2, 3}, result);
    }
}