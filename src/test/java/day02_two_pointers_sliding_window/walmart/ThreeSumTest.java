package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.ThreeSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ThreeSumTest {

    private final ThreeSum solution = new ThreeSum();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), result);
    }

    @Test
    void noTriplets() {
        assertEquals(List.of(), solution.threeSum(new int[]{0, 1, 1}));
    }

    @Test
    void allZeros() {
        assertEquals(List.of(List.of(0, 0, 0)), solution.threeSum(new int[]{0, 0, 0}));
    }

    @Test
    void noDuplicateTriplets() {
        List<List<Integer>> result = solution.threeSum(new int[]{-2, 0, 1, 1, 2});
        assertEquals(List.of(List.of(-2, 0, 2), List.of(-2, 1, 1)), result);
    }

    @Test
    void allPositive() {
        assertEquals(List.of(), solution.threeSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    void twoTriplets() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, -1, 0, 1});
        assertEquals(List.of(List.of(-1, 0, 1)), result);
    }
}
