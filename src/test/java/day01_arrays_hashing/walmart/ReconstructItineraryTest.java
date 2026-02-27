package day01_arrays_hashing.walmart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructItineraryTest {

    private final ReconstructItinerary solution = new ReconstructItinerary();

    private List<List<String>> tickets(String[]... pairs) {
        return Arrays.stream(pairs)
                .map(p -> List.of(p[0], p[1]))
                .toList();
    }

    @Test
    void basicLinearPath() {
        List<String> result = solution.findItinerary(tickets(
                new String[]{"MUC", "LHR"},
                new String[]{"JFK", "MUC"},
                new String[]{"SFO", "SJC"},
                new String[]{"LHR", "SFO"}
        ));
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), result);
    }

    @Test
    void lexicalOrderWithCycle() {
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "SFO"},
                new String[]{"JFK", "ATL"},
                new String[]{"SFO", "ATL"},
                new String[]{"ATL", "JFK"},
                new String[]{"ATL", "SFO"}
        ));
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), result);
    }

    @Test
    void singleTicket() {
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "ATL"}
        ));
        assertEquals(List.of("JFK", "ATL"), result);
    }

    @Test
    void twoTicketsLexical() {
        // Must choose ATL before SFO (lexical order)
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "SFO"},
                new String[]{"JFK", "ATL"},
                new String[]{"ATL", "SFO"}
        ));
        assertEquals(List.of("JFK", "ATL", "SFO"), result);
    }

    @Test
    void duplicateTickets() {
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "ATL"},
                new String[]{"ATL", "JFK"},
                new String[]{"JFK", "ATL"}
        ));
        assertEquals(List.of("JFK", "ATL", "JFK", "ATL"), result);
    }

    @Test
    void mustUseLexicalButAvoidDeadEnd() {
        // Greedy lexical "AXA" first would dead-end; must go "BXB" first
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "AXA"},
                new String[]{"JFK", "BXB"},
                new String[]{"BXB", "JFK"}
        ));
        // JFK → BXB → JFK → AXA (not JFK → AXA stuck!)
        assertEquals(List.of("JFK", "BXB", "JFK", "AXA"), result);
    }

    @Test
    void longerChain() {
        List<String> result = solution.findItinerary(tickets(
                new String[]{"JFK", "AAA"},
                new String[]{"AAA", "BBB"},
                new String[]{"BBB", "CCC"},
                new String[]{"CCC", "DDD"},
                new String[]{"DDD", "JFK"}
        ));
        assertEquals(List.of("JFK", "AAA", "BBB", "CCC", "DDD", "JFK"), result);
    }
}
