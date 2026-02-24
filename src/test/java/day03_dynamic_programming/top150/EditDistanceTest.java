package test.java.day03_dynamic_programming.top150;

import main.java.day03_dynamic_programming.top150.EditDistance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    private final EditDistance solution = new EditDistance();

    @Test
    void basicCaseHorseToRos() {
        assertEquals(3, solution.minDistance("horse", "ros"));
    }

    @Test
    void basicCaseIntentionToExecution() {
        assertEquals(5, solution.minDistance("intention", "execution"));
    }

    @Test
    void bothEmpty() {
        assertEquals(0, solution.minDistance("", ""));
    }

    @Test
    void oneEmpty() {
        assertEquals(3, solution.minDistance("abc", ""));
    }

    @Test
    void sameStrings() {
        assertEquals(0, solution.minDistance("abc", "abc"));
    }

    @Test
    void singleCharDifferent() {
        assertEquals(1, solution.minDistance("a", "b"));
    }
}
