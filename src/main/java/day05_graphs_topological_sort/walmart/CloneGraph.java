package main.java.day05_graphs_topological_sort.walmart;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 133 - Clone Graph
 * Difficulty: Medium | Source: WALMART
 *
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone)
 * of the graph. Each node in the graph contains a value (int) and a list of its neighbors.
 *
 * Example 1:
 *   Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 *   Output: [[2,4],[1,3],[2,4],[1,3]]
 *   Explanation: Node 1 connects to 2 and 4. Node 2 connects to 1 and 3, etc.
 *
 * Example 2:
 *   Input: adjList = [[]]
 *   Output: [[]]
 *   Explanation: Graph has one node with no neighbors.
 *
 * Example 3:
 *   Input: adjList = []
 *   Output: []
 *   Explanation: Empty graph.
 *
 * Constraints:
 * - The number of nodes is in the range [0, 100]
 * - 1 <= Node.val <= 100
 * - Node.val is unique for each node
 * - There are no repeated edges and no self-loops
 * - The graph is connected and all nodes can be visited from the given node
 *
 * PATTERN: BFS/DFS with HashMap mapping old node to new node
 * HINT: Use a HashMap<Node, Node> to track old-to-cloned mapping. DFS/BFS: for each node,
 *       create its clone if not already created, then recursively/iteratively clone its
 *       neighbors and add them to the cloned node's neighbor list.
 *
 * TIME: O(V + E) | SPACE: O(V)
 */
public class CloneGraph {

    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        // TODO: Implement your solution here
        return null;
    }
}
