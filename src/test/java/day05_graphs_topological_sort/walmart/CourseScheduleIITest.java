package test.java.day05_graphs_topological_sort.walmart;

import main.java.day05_graphs_topological_sort.walmart.CourseScheduleII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIITest {

    private final CourseScheduleII solution = new CourseScheduleII();

    @Test
    void twoCourses() {
        int[] result = solution.findOrder(2, new int[][]{{1, 0}});
        assertEquals(2, result.length);
        // course 0 must come before course 1
        assertTrue(indexOf(result, 0) < indexOf(result, 1));
    }

    @Test
    void fourCoursesMultiplePaths() {
        int[] result = solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        assertEquals(4, result.length);
        assertTrue(indexOf(result, 0) < indexOf(result, 1));
        assertTrue(indexOf(result, 0) < indexOf(result, 2));
        assertTrue(indexOf(result, 1) < indexOf(result, 3));
        assertTrue(indexOf(result, 2) < indexOf(result, 3));
    }

    @Test
    void singleCourse() {
        assertArrayEquals(new int[]{0}, solution.findOrder(1, new int[][]{}));
    }

    @Test
    void cycleReturnsEmpty() {
        assertArrayEquals(new int[]{}, solution.findOrder(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    void noPrerequisites() {
        int[] result = solution.findOrder(3, new int[][]{});
        assertEquals(3, result.length);
    }

    @Test
    void linearChain() {
        int[] result = solution.findOrder(3, new int[][]{{1, 0}, {2, 1}});
        assertEquals(3, result.length);
        assertTrue(indexOf(result, 0) < indexOf(result, 1));
        assertTrue(indexOf(result, 1) < indexOf(result, 2));
    }

    private int indexOf(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }
}
