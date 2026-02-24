package test.java.day06_heaps_binary_search_intervals.top150;

import main.java.day06_heaps_binary_search_intervals.top150.MeetingRooms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {

    private final MeetingRooms solution = new MeetingRooms();

    @Test
    void overlappingMeetings() {
        assertFalse(solution.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void noOverlap() {
        assertTrue(solution.canAttendMeetings(new int[][]{{7, 10}, {2, 4}}));
    }

    @Test
    void emptyIntervals() {
        assertTrue(solution.canAttendMeetings(new int[][]{}));
    }

    @Test
    void singleMeeting() {
        assertTrue(solution.canAttendMeetings(new int[][]{{1, 5}}));
    }

    @Test
    void backToBackMeetings() {
        assertTrue(solution.canAttendMeetings(new int[][]{{1, 5}, {5, 10}, {10, 15}}));
    }

    @Test
    void allOverlapping() {
        assertFalse(solution.canAttendMeetings(new int[][]{{1, 10}, {2, 6}, {3, 8}}));
    }
}
