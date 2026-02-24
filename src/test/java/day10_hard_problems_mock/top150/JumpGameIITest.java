package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.JumpGameII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    private final JumpGameII solution = new JumpGameII();

    @Test
    void basicCase() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void basicCaseTwo() {
        assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.jump(new int[]{0}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.jump(new int[]{1, 2}));
    }

    @Test
    void oneJumpReachesEnd() {
        assertEquals(1, solution.jump(new int[]{5, 1, 1, 1, 1}));
    }

    @Test
    void stepByStep() {
        assertEquals(4, solution.jump(new int[]{1, 1, 1, 1, 1}));
    }
}
