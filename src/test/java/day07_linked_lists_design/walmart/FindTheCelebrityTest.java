package test.java.day07_linked_lists_design.walmart;

import main.java.day07_linked_lists_design.walmart.FindTheCelebrity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheCelebrityTest {

    @Test
    void celebrityExists() {
        int[][] graph = {{1, 1, 0}, {0, 1, 0}, {1, 1, 1}};
        assertEquals(1, new FindTheCelebrity(graph).findCelebrity(3));
    }

    @Test
    void noCelebrity() {
        int[][] graph = {{1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(-1, new FindTheCelebrity(graph).findCelebrity(3));
    }

    @Test
    void everyoneKnowsEveryone() {
        int[][] graph = {{1, 1}, {1, 1}};
        assertEquals(-1, new FindTheCelebrity(graph).findCelebrity(2));
    }

    @Test
    void celebrityIsFirst() {
        int[][] graph = {{1, 0}, {1, 1}};
        assertEquals(0, new FindTheCelebrity(graph).findCelebrity(2));
    }

    @Test
    void celebrityIsLast() {
        int[][] graph = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        assertEquals(2, new FindTheCelebrity(graph).findCelebrity(3));
    }
}
