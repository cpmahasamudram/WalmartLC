package test.java.day02_two_pointers_sliding_window.top150;

import main.java.day02_two_pointers_sliding_window.top150.MaxPointsFromCards;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxPointsFromCardsTest {

    private final MaxPointsFromCards solution = new MaxPointsFromCards();

    @Test
    void basicCase() {
        assertEquals(12, solution.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
    }

    @Test
    void allCards() {
        assertEquals(55, solution.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7));
    }

    @Test
    void equalValues() {
        assertEquals(4, solution.maxScore(new int[]{2, 2, 2}, 2));
    }

    @Test
    void takeFromLeft() {
        assertEquals(15, solution.maxScore(new int[]{9, 6, 1, 1, 1}, 2));
    }

    @Test
    void takeFromRight() {
        assertEquals(15, solution.maxScore(new int[]{1, 1, 1, 6, 9}, 2));
    }

    @Test
    void singleCard() {
        assertEquals(5, solution.maxScore(new int[]{5}, 1));
    }
}
