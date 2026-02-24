package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.MaximalSquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {

    private final MaximalSquare solution = new MaximalSquare();

    @Test
    void basicExample() {
        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        assertEquals(4, solution.maximalSquare(matrix));
    }

    @Test
    void singleOneCell() {
        char[][] matrix = {{'0','1'},{'1','0'}};
        assertEquals(1, solution.maximalSquare(matrix));
    }

    @Test
    void allZeros() {
        char[][] matrix = {{'0'}};
        assertEquals(0, solution.maximalSquare(matrix));
    }

    @Test
    void allOnes2x2() {
        char[][] matrix = {{'1','1'},{'1','1'}};
        assertEquals(4, solution.maximalSquare(matrix));
    }

    @Test
    void singleRow() {
        char[][] matrix = {{'1','1','1','0','1'}};
        assertEquals(1, solution.maximalSquare(matrix));
    }

    @Test
    void largerSquare3x3() {
        char[][] matrix = {
            {'1','1','1','0'},
            {'1','1','1','0'},
            {'1','1','1','1'}
        };
        assertEquals(9, solution.maximalSquare(matrix));
    }
}
