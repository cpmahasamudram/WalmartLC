package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.SortColors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    private final SortColors solution = new SortColors();

    @Test
    void basicCase() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void threeElements() {
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    void alreadySorted() {
        int[] nums = {0, 0, 1, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 2, 2}, nums);
    }

    @Test
    void reversed() {
        int[] nums = {2, 2, 1, 1, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void singleColor() {
        int[] nums = {1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1}, nums);
    }

    @Test
    void singleElement() {
        int[] nums = {0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0}, nums);
    }
}
