package test.java.day01_arrays_hashing.walmart;

import main.java.day01_arrays_hashing.walmart.SubarraySumEqualsK;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK solution = new SubarraySumEqualsK();

    @Test
    void basicCase() {
        assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    void anotherBasic() {
        assertEquals(2, solution.subarraySum(new int[]{1, 2, 3}, 3));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.subarraySum(new int[]{3}, 3));
    }

    @Test
    void singleElementNoMatch() {
        assertEquals(0, solution.subarraySum(new int[]{1}, 0));
    }

    @Test
    void negativeNumbers() {
        // [1,-1,0] → subarrays summing to 0: [-1,1], [0], [1,-1,0]... let's be precise
        // subarrays: [1]=1, [1,-1]=0, [1,-1,0]=0, [-1]=-1, [-1,0]=-1, [0]=0
        // sum=0: [1,-1], [1,-1,0], [0] → 3
        assertEquals(3, solution.subarraySum(new int[]{1, -1, 0}, 0));
    }

    @Test
    void allSameElements() {
        // [1,1,1,1], k=2 → [1,1] at indices (0,1),(1,2),(2,3) → 3
        assertEquals(3, solution.subarraySum(new int[]{1, 1, 1, 1}, 2));
    }

    @Test
    void entireArray() {
        assertEquals(1, solution.subarraySum(new int[]{1, 2, 3}, 6));
    }

    @Test
    void noMatch() {
        assertEquals(0, solution.subarraySum(new int[]{1, 2, 3}, 100));
    }

    @Test
    void negativeK() {
        // [-1,-1,1], k=-2 → [-1,-1] → 1
        assertEquals(1, solution.subarraySum(new int[]{-1, -1, 1}, -2));
    }
}
