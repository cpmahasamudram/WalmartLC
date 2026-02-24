package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.MeetingRoomsII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIITest {

    private final MeetingRoomsII solution = new MeetingRoomsII();

    @Test
    void overlappingMeetings() {
        assertEquals(2, solution.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void noOverlap() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));
    }

    @Test
    void singleMeeting() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{0, 10}}));
    }

    @Test
    void allOverlapping() {
        assertEquals(3, solution.minMeetingRooms(new int[][]{{0, 10}, {1, 5}, {2, 7}}));
    }

    @Test
    void backToBackMeetings() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{0, 5}, {5, 10}, {10, 15}}));
    }

    @Test
    void multipleConcurrent() {
        assertEquals(3, solution.minMeetingRooms(new int[][]{{1, 10}, {2, 7}, {3, 19}, {8, 12}, {10, 20}, {11, 30}}));
    }
}
