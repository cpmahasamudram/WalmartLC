package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.TextJustification;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {

    private final TextJustification solution = new TextJustification();

    @Test
    void basicCase() {
        List<String> result = solution.fullJustify(
                new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        assertEquals(List.of("This    is    an", "example  of text", "justification.  "), result);
    }

    @Test
    void acknowledgmentCase() {
        List<String> result = solution.fullJustify(
                new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16);
        assertEquals(List.of("What   must   be", "acknowledgment  ", "shall be        "), result);
    }

    @Test
    void longWordsCase() {
        List<String> result = solution.fullJustify(
                new String[]{"Science", "is", "what", "we", "understand", "well", "enough",
                        "to", "explain", "to", "a", "computer.", "Art", "is", "everything",
                        "else", "we", "do"}, 20);
        assertEquals(List.of("Science  is  what we", "understand      well",
                "enough to explain to", "a  computer.  Art is",
                "everything  else  we", "do                  "), result);
    }

    @Test
    void singleWord() {
        List<String> result = solution.fullJustify(new String[]{"hello"}, 10);
        assertEquals(List.of("hello     "), result);
    }

    @Test
    void oneWordPerLine() {
        List<String> result = solution.fullJustify(new String[]{"abc", "def", "ghi"}, 3);
        assertEquals(List.of("abc", "def", "ghi"), result);
    }

    @Test
    void allWordsOnOneLine() {
        List<String> result = solution.fullJustify(new String[]{"a", "b"}, 5);
        assertEquals(List.of("a b  "), result);
    }
}
