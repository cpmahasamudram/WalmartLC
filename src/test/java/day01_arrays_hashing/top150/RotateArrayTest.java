package test.java.day01_arrays_hashing.top150;

import main.java.day01_arrays_hashing.top150.RotateArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private final RotateArray solution = new RotateArray();

    @Test
    void basicCase() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void negativeNumbers() {
        int[] nums = {-1, -100, 3, 99};
        solution.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void rotateByZero() {
        int[] nums = {1, 2, 3};
        solution.rotate(nums, 0);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void rotateByLength() {
        // k == n → no change
        int[] nums = {1, 2, 3};
        solution.rotate(nums, 3);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void rotateByMoreThanLength() {
        // k > n → same as k % n
        int[] nums = {1, 2, 3, 4, 5};
        solution.rotate(nums, 7); // 7 % 5 = 2
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, nums);
    }

    @Test
    void rotateByOne() {
        int[] nums = {1, 2, 3, 4};
        solution.rotate(nums, 1);
        assertArrayEquals(new int[]{4, 1, 2, 3}, nums);
    }

    @Test
    void singleElement() {
        int[] nums = {1};
        solution.rotate(nums, 5);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void twoElements() {
        int[] nums = {1, 2};
        solution.rotate(nums, 1);
        assertArrayEquals(new int[]{2, 1}, nums);
    }

    @Test
    void allSameElements() {
        int[] nums = {3, 3, 3, 3};
        solution.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 3, 3, 3}, nums);
    }
}
