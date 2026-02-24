package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.SetMatrixZeroes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {

    private final SetMatrixZeroes solution = new SetMatrixZeroes();

    @Test
    void basicMiddleZero() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{1,0,1}, matrix[0]);
        assertArrayEquals(new int[]{0,0,0}, matrix[1]);
        assertArrayEquals(new int[]{1,0,1}, matrix[2]);
    }

    @Test
    void cornerZeros() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{0,0,0,0}, matrix[0]);
        assertArrayEquals(new int[]{0,4,5,0}, matrix[1]);
        assertArrayEquals(new int[]{0,3,1,0}, matrix[2]);
    }

    @Test
    void noZeros() {
        int[][] matrix = {{1,2},{3,4}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{1,2}, matrix[0]);
        assertArrayEquals(new int[]{3,4}, matrix[1]);
    }

    @Test
    void allZeros() {
        int[][] matrix = {{0,0},{0,0}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{0,0}, matrix[0]);
        assertArrayEquals(new int[]{0,0}, matrix[1]);
    }

    @Test
    void singleElement() {
        int[][] matrix = {{0}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{0}, matrix[0]);
    }

    @Test
    void singleRow() {
        int[][] matrix = {{1,0,3}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{0,0,0}, matrix[0]);
    }
}
