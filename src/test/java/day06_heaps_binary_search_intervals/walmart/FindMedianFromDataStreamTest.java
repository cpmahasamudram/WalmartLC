package test.java.day06_heaps_binary_search_intervals.walmart;

import main.java.day06_heaps_binary_search_intervals.walmart.FindMedianFromDataStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {

    @Test
    void evenNumberOfElements() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(1);
        solution.addNum(2);
        assertEquals(1.5, solution.findMedian(), 0.00001);
    }

    @Test
    void oddNumberOfElements() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(1);
        solution.addNum(2);
        solution.addNum(3);
        assertEquals(2.0, solution.findMedian(), 0.00001);
    }

    @Test
    void singleElement() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(5);
        assertEquals(5.0, solution.findMedian(), 0.00001);
    }

    @Test
    void descendingOrder() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(5);
        solution.addNum(4);
        solution.addNum(3);
        solution.addNum(2);
        solution.addNum(1);
        assertEquals(3.0, solution.findMedian(), 0.00001);
    }

    @Test
    void negativeNumbers() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(-1);
        solution.addNum(-2);
        solution.addNum(-3);
        assertEquals(-2.0, solution.findMedian(), 0.00001);
    }

    @Test
    void duplicateValues() {
        FindMedianFromDataStream solution = new FindMedianFromDataStream();
        solution.addNum(1);
        solution.addNum(1);
        solution.addNum(1);
        solution.addNum(1);
        assertEquals(1.0, solution.findMedian(), 0.00001);
    }
}
