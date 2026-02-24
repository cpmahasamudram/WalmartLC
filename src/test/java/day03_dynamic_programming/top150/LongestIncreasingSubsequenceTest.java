package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

    @Test
    void basicCase() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    void basicCaseWithDuplicates() {
        assertEquals(4, solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    void allEqual() {
        assertEquals(1, solution.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.lengthOfLIS(new int[]{10}));
    }

    @Test
    void alreadySorted() {
        assertEquals(5, solution.lengthOfLIS(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void descendingOrder() {
        assertEquals(1, solution.lengthOfLIS(new int[]{5, 4, 3, 2, 1}));
    }
}
