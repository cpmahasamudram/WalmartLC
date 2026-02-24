package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.PartitionEqualSubsetSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    private final PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();

    @Test
    void canPartition() {
        assertTrue(solution.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void cannotPartition() {
        assertFalse(solution.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void twoEqualElements() {
        assertTrue(solution.canPartition(new int[]{1, 1}));
    }

    @Test
    void singleElement() {
        assertFalse(solution.canPartition(new int[]{1}));
    }

    @Test
    void oddTotalSum() {
        assertFalse(solution.canPartition(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void largerPartitionable() {
        assertTrue(solution.canPartition(new int[]{1, 2, 3, 4, 5, 5}));
    }
}
