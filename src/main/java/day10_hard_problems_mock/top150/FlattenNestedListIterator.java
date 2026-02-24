package main.java.day10_hard_problems_mock.top150;

import java.util.Iterator;
import java.util.List;

/**
 * LC 341 - Flatten Nested List Iterator
 * Difficulty: Medium | Source: Top 150
 *
 * You are given a nested list of integers. Each element is either an integer or a list
 * whose elements may also be integers or other lists. Implement an iterator to flatten it.
 *
 * Implement the NestedIterator class:
 * - NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list.
 * - int next() Returns the next integer in the nested list.
 * - boolean hasNext() Returns true if there are still some integers in the nested list.
 *
 * Example 1: nestedList = [[1,1],2,[1,1]] -> Output: [1,1,2,1,1]
 * Example 2: nestedList = [1,[4,[6]]] -> Output: [1,4,6]
 *
 * Constraints:
 * - 1 <= nestedList.length <= 500
 * - The values of the integers in the nested list are in the range [-10^6, 10^6]
 *
 * PATTERN: Stack-based Iterator
 * HINT: Use a stack of list iterators. In hasNext(), while the stack is not empty, peek at
 *       the top iterator's next element. If it's an integer, return true. If it's a list,
 *       push a new iterator for that list. If the top iterator is exhausted, pop it.
 *       In next(), call hasNext() to ensure the top of stack points to an integer, then return it.
 *
 * TIME: O(1) amortized per next/hasNext | SPACE: O(D) where D = max nesting depth
 */
public class FlattenNestedListIterator {

    /**
     * Interface representing a nested integer that can hold a single integer
     * or a nested list of NestedInteger.
     */
    public interface NestedInteger {
        /** @return true if this NestedInteger holds a single integer, rather than a nested list. */
        boolean isInteger();

        /** @return the single integer that this NestedInteger holds, if it holds a single integer. */
        Integer getInteger();

        /** @return the nested list that this NestedInteger holds, if it holds a nested list. */
        List<NestedInteger> getList();
    }

    /**
     * Iterator that flattens a nested list of NestedInteger values.
     */
    public static class NestedIterator implements Iterator<Integer> {

        public NestedIterator(List<NestedInteger> nestedList) {
            // TODO: Implement your solution here
        }

        @Override
        public Integer next() {
            // TODO: Implement your solution here
            return null;
        }

        @Override
        public boolean hasNext() {
            // TODO: Implement your solution here
            return false;
        }
    }
}
