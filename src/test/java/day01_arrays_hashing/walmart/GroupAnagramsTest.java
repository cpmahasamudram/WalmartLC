package day01_arrays_hashing.walmart;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    /**
     * Helper: normalize result for order-independent comparison.
     * Sorts each inner list, then sorts the outer list by first element.
     */
    private List<List<String>> normalize(List<List<String>> groups) {
        return groups.stream()
                .map(g -> g.stream().sorted().collect(Collectors.toList()))
                .sorted((a, b) -> {
                    if (a.isEmpty() && b.isEmpty()) return 0;
                    if (a.isEmpty()) return -1;
                    if (b.isEmpty()) return 1;
                    return a.get(0).compareTo(b.get(0));
                })
                .collect(Collectors.toList());
    }

    @Test
    void basicCase() {
        List<List<String>> result = solution.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = List.of(
                List.of("ate", "eat", "tea"),
                List.of("bat"),
                List.of("nat", "tan"));
        assertEquals(normalize(expected), normalize(result));
    }

    @Test
    void emptyString() {
        List<List<String>> result = solution.groupAnagrams(new String[]{""});
        assertEquals(1, result.size());
        assertEquals(List.of(""), result.get(0));
    }

    @Test
    void singleChar() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"a"});
        assertEquals(1, result.size());
        assertEquals(List.of("a"), result.get(0));
    }

    @Test
    void noAnagrams() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"abc", "def", "ghi"});
        assertEquals(3, result.size());
    }

    @Test
    void allAnagrams() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"abc", "bca", "cab"});
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }

    @Test
    void multipleEmptyStrings() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"", ""});
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).size());
    }
}
