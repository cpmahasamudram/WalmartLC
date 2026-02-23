package test.java.day01_arrays_hashing.walmart;

import main.java.day01_arrays_hashing.walmart.ProductExceptSelf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    private final ProductExceptSelf solution = new ProductExceptSelf();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void withZero() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    void twoElements() {
        assertArrayEquals(new int[]{3, 2}, solution.productExceptSelf(new int[]{2, 3}));
    }

    @Test
    void withNegatives() {
        // [-1, 2, -3] → [2*-3, -1*-3, -1*2] = [-6, 3, -2]
        assertArrayEquals(new int[]{-6, 3, -2}, solution.productExceptSelf(new int[]{-1, 2, -3}));
    }

    @Test
    void allOnes() {
        assertArrayEquals(new int[]{1, 1, 1, 1}, solution.productExceptSelf(new int[]{1, 1, 1, 1}));
    }

    @Test
    void multipleZeros() {
        // [0, 0, 2] → [0*2, 0*2, 0*0] = [0, 0, 0]
        assertArrayEquals(new int[]{0, 0, 0}, solution.productExceptSelf(new int[]{0, 0, 2}));
    }

    @Test
    void mixedNegatives() {
        // [-1, 1, -3, 3]
        // idx0: 1*-3*3 = -9
        // idx1: -1*-3*3 = 9
        // idx2: -1*1*3 = -3
        // idx3: -1*1*-3 = 3
        assertArrayEquals(new int[]{-9, 9, -3, 3}, solution.productExceptSelf(new int[]{-1, 1, -3, 3}));
    }
}
