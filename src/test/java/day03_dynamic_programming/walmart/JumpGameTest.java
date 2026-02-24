package test.java.day03_dynamic_programming.walmart;

import main.java.day03_dynamic_programming.walmart.JumpGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    private final JumpGame solution = new JumpGame();

    @Test
    void basicCaseReachable() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void basicCaseUnreachable() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void singleElement() {
        assertTrue(solution.canJump(new int[]{0}));
    }

    @Test
    void allZerosExceptFirst() {
        assertFalse(solution.canJump(new int[]{0, 1, 2}));
    }

    @Test
    void largeFirstJump() {
        assertTrue(solution.canJump(new int[]{10, 0, 0, 0, 0}));
    }

    @Test
    void twoElementsZeroStart() {
        assertFalse(solution.canJump(new int[]{0, 1}));
    }
}
