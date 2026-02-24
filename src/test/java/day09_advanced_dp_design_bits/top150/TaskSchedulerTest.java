package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.TaskScheduler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {

    private final TaskScheduler solution = new TaskScheduler();

    @Test
    void basicWithIdle() {
        assertEquals(8, solution.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }

    @Test
    void noIdleNeeded() {
        assertEquals(6, solution.leastInterval(new char[]{'A','C','A','B','D','B'}, 1));
    }

    @Test
    void zeroCooldown() {
        assertEquals(6, solution.leastInterval(new char[]{'A','A','A','B','B','B'}, 0));
    }

    @Test
    void singleTask() {
        assertEquals(1, solution.leastInterval(new char[]{'A'}, 2));
    }

    @Test
    void allSameTask() {
        assertEquals(7, solution.leastInterval(new char[]{'A','A','A'}, 2));
    }

    @Test
    void manyDistinctTasks() {
        assertEquals(6, solution.leastInterval(new char[]{'A','B','C','D','E','F'}, 2));
    }
}
