package test.java.day07_linked_lists_design.walmart;

import main.java.day07_linked_lists_design.walmart.CopyListRandomPointer;
import main.java.day07_linked_lists_design.walmart.CopyListRandomPointer.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CopyListRandomPointerTest {

    private final CopyListRandomPointer solution = new CopyListRandomPointer();

    @Test
    void basicCase() {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        n1.next = n2; n2.next = n3;
        n2.random = n1; n3.random = n1;

        Node copy = solution.copyRandomList(n1);
        assertEquals(7, copy.val);
        assertEquals(13, copy.next.val);
        assertEquals(11, copy.next.next.val);
        assertNotSame(n1, copy);
        assertSame(copy, copy.next.random);
    }

    @Test
    void nullHead() {
        assertNull(solution.copyRandomList(null));
    }

    @Test
    void singleNodeSelfRandom() {
        Node n1 = new Node(1);
        n1.random = n1;
        Node copy = solution.copyRandomList(n1);
        assertEquals(1, copy.val);
        assertSame(copy, copy.random);
        assertNotSame(n1, copy);
    }

    @Test
    void noRandomPointers() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node copy = solution.copyRandomList(n1);
        assertEquals(1, copy.val);
        assertEquals(2, copy.next.val);
        assertNull(copy.random);
        assertNull(copy.next.random);
    }
}
