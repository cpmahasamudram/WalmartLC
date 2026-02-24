package test.java.day05_graphs_topological_sort.walmart;

import main.java.day05_graphs_topological_sort.walmart.CourseSchedule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    private final CourseSchedule solution = new CourseSchedule();

    @Test
    void canFinishSimpleChain() {
        assertTrue(solution.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void cycleDetected() {
        assertFalse(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void noPrerequisites() {
        assertTrue(solution.canFinish(3, new int[][]{}));
    }

    @Test
    void multipleDependencies() {
        assertTrue(solution.canFinish(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }

    @Test
    void singleCourse() {
        assertTrue(solution.canFinish(1, new int[][]{}));
    }

    @Test
    void longerCycle() {
        assertFalse(solution.canFinish(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}));
    }
}
