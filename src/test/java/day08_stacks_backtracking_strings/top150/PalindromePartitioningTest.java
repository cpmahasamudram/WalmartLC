package test.java.day08_stacks_backtracking_strings.top150;

import main.java.day08_stacks_backtracking_strings.top150.PalindromePartitioning;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    private final PalindromePartitioning solution = new PalindromePartitioning();

    @Test
    void example1() {
        List<List<String>> result = solution.partition("aab");
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("a", "a", "b")));
        assertTrue(result.contains(List.of("aa", "b")));
    }

    @Test
    void singleCharacter() {
        List<List<String>> result = solution.partition("a");
        assertEquals(1, result.size());
        assertEquals(List.of("a"), result.get(0));
    }

    @Test
    void entireStringPalindrome() {
        List<List<String>> result = solution.partition("aba");
        assertTrue(result.contains(List.of("aba")));
        assertTrue(result.contains(List.of("a", "b", "a")));
    }

    @Test
    void noPalindromeSubstringsLongerThan1() {
        List<List<String>> result = solution.partition("abc");
        assertEquals(1, result.size());
        assertEquals(List.of("a", "b", "c"), result.get(0));
    }

    @Test
    void allSameCharacters() {
        List<List<String>> result = solution.partition("aaa");
        // ["a","a","a"], ["a","aa"], ["aa","a"], ["aaa"]
        assertEquals(4, result.size());
    }

    @Test
    void allPartsArePalindromes() {
        List<List<String>> result = solution.partition("aab");
        for (List<String> partition : result) {
            for (String part : partition) {
                assertEquals(part, new StringBuilder(part).reverse().toString());
            }
        }
    }
}
