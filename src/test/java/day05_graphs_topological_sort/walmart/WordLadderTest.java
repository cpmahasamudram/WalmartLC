package test.java.day05_graphs_topological_sort.walmart;

import main.java.day05_graphs_topological_sort.walmart.WordLadder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    private final WordLadder solution = new WordLadder();

    @Test
    void basicTransformation() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(5, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    void endWordNotInList() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    void singleStepTransformation() {
        List<String> wordList = Arrays.asList("hot");
        assertEquals(2, solution.ladderLength("hit", "hot", wordList));
    }

    @Test
    void noTransformationPossible() {
        List<String> wordList = Arrays.asList("abc", "def");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    void beginEqualsEndInList() {
        List<String> wordList = Arrays.asList("hot", "dot");
        assertEquals(1, solution.ladderLength("hot", "hot", wordList));
    }

    @Test
    void longerWordTransformation() {
        List<String> wordList = Arrays.asList("most", "mist", "miss", "lost", "fist", "fish");
        assertEquals(4, solution.ladderLength("lost", "miss", wordList));
    }
}
