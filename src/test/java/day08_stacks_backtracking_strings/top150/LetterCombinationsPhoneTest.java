package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.LetterCombinationsPhone;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsPhoneTest {

    private final LetterCombinationsPhone solution = new LetterCombinationsPhone();

    @Test
    void twoDigits() {
        List<String> result = solution.letterCombinations("23");
        assertEquals(9, result.size());
        assertTrue(result.contains("ad"));
        assertTrue(result.contains("cf"));
    }

    @Test
    void emptyInput() {
        List<String> result = solution.letterCombinations("");
        assertTrue(result.isEmpty());
    }

    @Test
    void singleDigit() {
        List<String> result = solution.letterCombinations("2");
        assertEquals(3, result.size());
        assertTrue(result.containsAll(List.of("a", "b", "c")));
    }

    @Test
    void digitWith4Letters() {
        List<String> result = solution.letterCombinations("7");
        assertEquals(4, result.size());
        assertTrue(result.containsAll(List.of("p", "q", "r", "s")));
    }

    @Test
    void threeDigits() {
        List<String> result = solution.letterCombinations("234");
        // 3 * 3 * 3 = 27
        assertEquals(27, result.size());
    }

    @Test
    void allCombinationsCorrectLength() {
        List<String> result = solution.letterCombinations("23");
        for (String s : result) {
            assertEquals(2, s.length());
        }
    }
}
