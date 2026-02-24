package test.java.day05_graphs_topological_sort.walmart;

import main.java.day05_graphs_topological_sort.walmart.CloneGraph;
import main.java.day05_graphs_topological_sort.walmart.CloneGraph.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CloneGraphTest {

    private final CloneGraph solution = new CloneGraph();

    @Test
    void nullGraph() {
        assertNull(solution.cloneGraph(null));
    }

    @Test
    void singleNode() {
        Node node = new Node(1);
        Node clone = solution.cloneGraph(node);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertTrue(clone.neighbors.isEmpty());
        assertNotSame(node, clone);
    }

    @Test
    void twoConnectedNodes() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        Node clone = solution.cloneGraph(node1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(1, clone.neighbors.size());
        assertEquals(2, clone.neighbors.get(0).val);
        assertNotSame(node1, clone);
        assertNotSame(node2, clone.neighbors.get(0));
    }

    @Test
    void fourNodeCycle() {
        Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3), n4 = new Node(4);
        n1.neighbors.add(n2); n1.neighbors.add(n4);
        n2.neighbors.add(n1); n2.neighbors.add(n3);
        n3.neighbors.add(n2); n3.neighbors.add(n4);
        n4.neighbors.add(n1); n4.neighbors.add(n3);

        Node clone = solution.cloneGraph(n1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(2, clone.neighbors.size());
        assertNotSame(n1, clone);
    }

    @Test
    void cloneIsDeepCopy() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.neighbors.add(n2);
        n2.neighbors.add(n1);

        Node clone = solution.cloneGraph(n1);
        // Modifying clone should not affect original
        assertNotSame(n1, clone);
        assertNotSame(n2, clone.neighbors.get(0));
    }
}
