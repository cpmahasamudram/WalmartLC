package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.RotateImage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    private final RotateImage solution = new RotateImage();

    @Test
    void rotate3x3() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{7,4,1}, matrix[0]);
        assertArrayEquals(new int[]{8,5,2}, matrix[1]);
        assertArrayEquals(new int[]{9,6,3}, matrix[2]);
    }

    @Test
    void rotate4x4() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{15,13,2,5}, matrix[0]);
        assertArrayEquals(new int[]{14,3,4,1}, matrix[1]);
        assertArrayEquals(new int[]{12,6,8,9}, matrix[2]);
        assertArrayEquals(new int[]{16,7,10,11}, matrix[3]);
    }

    @Test
    void rotate1x1() {
        int[][] matrix = {{1}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{1}, matrix[0]);
    }

    @Test
    void rotate2x2() {
        int[][] matrix = {{1,2},{3,4}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{3,1}, matrix[0]);
        assertArrayEquals(new int[]{4,2}, matrix[1]);
    }

    @Test
    void rotateAllSameValues() {
        int[][] matrix = {{5,5},{5,5}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{5,5}, matrix[0]);
        assertArrayEquals(new int[]{5,5}, matrix[1]);
    }

    @Test
    void rotateNegativeValues() {
        int[][] matrix = {{-1,-2},{-3,-4}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{-3,-1}, matrix[0]);
        assertArrayEquals(new int[]{-4,-2}, matrix[1]);
    }
}
