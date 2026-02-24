package main.java.day06_heaps_binary_search_intervals.walmart;

/**
 * LC 295 - Find Median from Data Stream
 * Difficulty: Hard | Source: Walmart
 *
 * The median is the middle value in an ordered integer list. If the size of
 * the list is even, there is no middle value, and the median is the mean of
 * the two middle values.
 *
 * Implement the MedianFinder class:
 * - MedianFinder() initializes the MedianFinder object.
 * - void addNum(int num) adds the integer num from the data stream.
 * - double findMedian() returns the median of all elements so far.
 *
 * Example:
 *   addNum(1), addNum(2), findMedian() -> 1.5
 *   addNum(3), findMedian() -> 2.0
 *
 * Constraints:
 * - -10^5 <= num <= 10^5
 * - There will be at least one element before calling findMedian
 * - At most 5 * 10^4 calls will be made to addNum and findMedian
 *
 * PATTERN: Two Heaps - maxHeap for lower half, minHeap for upper half
 * HINT: Keep two heaps balanced. maxHeap stores the smaller half (top = max of lower),
 *       minHeap stores the larger half (top = min of upper). Median is derived from tops.
 *
 * TIME: O(log n) addNum, O(1) findMedian | SPACE: O(n)
 */
public class FindMedianFromDataStream {

    public FindMedianFromDataStream() {
        // TODO: Initialize heaps
    }

    public void addNum(int num) {
        // TODO: Implement
    }

    public double findMedian() {
        // TODO: Implement
        return 0.0;
    }
}
