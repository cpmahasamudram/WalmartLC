package test.java.day07_linked_lists_design.top150;

import main.java.day07_linked_lists_design.top150.FlattenMultilevelDoublyLL;
import main.java.day07_linked_lists_design.top150.FlattenMultilevelDoublyLL.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlattenMultilevelDoublyLLTest {

    private final FlattenMultilevelDoublyLL solution = new FlattenMultilevelDoublyLL();

    private int[] toArray(Node head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void basicCase() {
        // 1 - 2 - 3
        //         |
        //         4 - 5
        Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3);
        Node n4 = new Node(4), n5 = new Node(5);
        n1.next = n2; n2.prev = n1; n2.next = n3; n3.prev = n2;
        n4.next = n5; n5.prev = n4;
        n2.child = n4;

        Node result = solution.flatten(n1);
        assertArrayEquals(new int[]{1, 2, 4, 5, 3}, toArray(result));
    }

    @Test
    void noChildren() {
        Node n1 = new Node(1), n2 = new Node(2);
        n1.next = n2; n2.prev = n1;
        Node result = solution.flatten(n1);
        assertArrayEquals(new int[]{1, 2}, toArray(result));
    }

    @Test
    void nullHead() {
        assertNull(solution.flatten(null));
    }

    @Test
    void singleNodeWithChild() {
        Node n1 = new Node(1), n2 = new Node(2);
        n1.child = n2;
        Node result = solution.flatten(n1);
        assertArrayEquals(new int[]{1, 2}, toArray(result));
    }
}
