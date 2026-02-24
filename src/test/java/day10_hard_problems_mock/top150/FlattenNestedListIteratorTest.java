package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.FlattenNestedListIterator;
import main.java.day10_hard_problems_mock.top150.FlattenNestedListIterator.NestedInteger;
import main.java.day10_hard_problems_mock.top150.FlattenNestedListIterator.NestedIterator;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlattenNestedListIteratorTest {

    /** Helper: create a NestedInteger holding a single integer. */
    private NestedInteger ni(int val) {
        return new NestedInteger() {
            public boolean isInteger() { return true; }
            public Integer getInteger() { return val; }
            public List<NestedInteger> getList() { return null; }
        };
    }

    /** Helper: create a NestedInteger holding a nested list. */
    private NestedInteger niList(NestedInteger... items) {
        return new NestedInteger() {
            public boolean isInteger() { return false; }
            public Integer getInteger() { return null; }
            public List<NestedInteger> getList() { return Arrays.asList(items); }
        };
    }

    private List<Integer> collect(NestedIterator it) {
        List<Integer> result = new ArrayList<>();
        while (it.hasNext()) {
            result.add(it.next());
        }
        return result;
    }

    @Test
    void nestedLists() {
        // [[1,1],2,[1,1]]
        List<NestedInteger> input = Arrays.asList(niList(ni(1), ni(1)), ni(2), niList(ni(1), ni(1)));
        assertEquals(List.of(1, 1, 2, 1, 1), collect(new NestedIterator(input)));
    }

    @Test
    void deeplyNested() {
        // [1,[4,[6]]]
        List<NestedInteger> input = Arrays.asList(ni(1), niList(ni(4), niList(ni(6))));
        assertEquals(List.of(1, 4, 6), collect(new NestedIterator(input)));
    }

    @Test
    void flatList() {
        List<NestedInteger> input = Arrays.asList(ni(1), ni(2), ni(3));
        assertEquals(List.of(1, 2, 3), collect(new NestedIterator(input)));
    }

    @Test
    void singleElement() {
        List<NestedInteger> input = Arrays.asList(ni(42));
        assertEquals(List.of(42), collect(new NestedIterator(input)));
    }

    @Test
    void emptyInnerList() {
        // [[], 1, [2, []], 3]
        List<NestedInteger> input = Arrays.asList(niList(), ni(1), niList(ni(2), niList()), ni(3));
        assertEquals(List.of(1, 2, 3), collect(new NestedIterator(input)));
    }

    @Test
    void singleNestedList() {
        // [[1,2,3]]
        List<NestedInteger> input = Arrays.asList(niList(ni(1), ni(2), ni(3)));
        assertEquals(List.of(1, 2, 3), collect(new NestedIterator(input)));
    }
}
