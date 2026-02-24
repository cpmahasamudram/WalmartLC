package test.java.day02_two_pointers_sliding_window.walmart;

import main.java.day02_two_pointers_sliding_window.walmart.SquaresOfSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    private final SquaresOfSortedArray solution = new SquaresOfSortedArray();

    @Test
    void mixedNegativePositive() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void allNegative() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void allPositive() {
        assertArrayEquals(new int[]{1, 4, 9}, solution.sortedSquares(new int[]{1, 2, 3}));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{25}, solution.sortedSquares(new int[]{-5}));
    }

    @Test
    void allZeros() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.sortedSquares(new int[]{0, 0, 0}));
    }

    @Test
    void symmetricAroundZero() {
        assertArrayEquals(new int[]{0, 1, 1, 4, 4}, solution.sortedSquares(new int[]{-2, -1, 0, 1, 2}));
    }
}
