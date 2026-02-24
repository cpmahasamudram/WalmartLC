package test.java.day05_graphs_topological_sort.top150;

import main.java.day05_graphs_topological_sort.top150.AccountsMerge;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountsMergeTest {

    private final AccountsMerge solution = new AccountsMerge();

    @Test
    void basicMerge() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
            Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
            Arrays.asList("Mary", "mary@mail.com"),
            Arrays.asList("John", "johnnybravo@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(3, result.size());
    }

    @Test
    void noMergeNeeded() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co"),
            Arrays.asList("Kevin", "Kevin3@m.co", "Kevin5@m.co"),
            Arrays.asList("Ethan", "Ethan5@m.co", "Ethan4@m.co")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(3, result.size());
    }

    @Test
    void singleAccount() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("Alice", "alice@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
        assertEquals("Alice", result.get(0).get(0));
    }

    @Test
    void allAccountsMerge() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "a@mail.com", "b@mail.com"),
            Arrays.asList("John", "b@mail.com", "c@mail.com"),
            Arrays.asList("John", "c@mail.com", "d@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
        // Should have 4 emails + name
        assertEquals(5, result.get(0).size());
    }

    @Test
    void emailsSortedInResult() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "c@mail.com", "a@mail.com", "b@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
        assertEquals("John", result.get(0).get(0));
        assertEquals("a@mail.com", result.get(0).get(1));
        assertEquals("b@mail.com", result.get(0).get(2));
        assertEquals("c@mail.com", result.get(0).get(3));
    }

    @Test
    void sameNameDifferentPeople() {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "john1@mail.com"),
            Arrays.asList("John", "john2@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }
}
