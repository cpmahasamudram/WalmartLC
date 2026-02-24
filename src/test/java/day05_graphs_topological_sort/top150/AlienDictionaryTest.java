package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.AlienDictionary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {

    private final AlienDictionary solution = new AlienDictionary();

    @Test
    void basicOrdering() {
        String result = solution.alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"});
        // Valid orderings include "wertf"
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(5, result.length());
        // Verify constraints: w before e, e before r, t before f, r before t
        assertTrue(result.indexOf('w') < result.indexOf('e'));
        assertTrue(result.indexOf('e') < result.indexOf('r'));
        assertTrue(result.indexOf('t') < result.indexOf('f'));
        assertTrue(result.indexOf('r') < result.indexOf('t'));
    }

    @Test
    void twoWordsSimple() {
        String result = solution.alienOrder(new String[]{"z", "x"});
        assertEquals("zx", result);
    }

    @Test
    void invalidOrderCycle() {
        String result = solution.alienOrder(new String[]{"z", "x", "z"});
        assertEquals("", result);
    }

    @Test
    void singleWord() {
        String result = solution.alienOrder(new String[]{"abc"});
        assertNotNull(result);
        assertEquals(3, result.length());
    }

    @Test
    void invalidPrefixOrder() {
        // "abc" should come before "ab" is invalid since "ab" is a prefix of "abc"
        String result = solution.alienOrder(new String[]{"abc", "ab"});
        assertEquals("", result);
    }

    @Test
    void sameWords() {
        String result = solution.alienOrder(new String[]{"z", "z"});
        assertEquals("z", result);
    }
}
