package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 261 - Graph Valid Tree
 * Difficulty: Medium | Source: TOP 150
 *
 * You have a graph of n nodes labeled from 0 to n - 1. You are given an integer n and a list
 * of edges where edges[i] = [ai, bi] indicates that there is an undirected edge between nodes
 * ai and bi in the graph. Return true if the edges of the given graph make up a valid tree,
 * and false otherwise.
 *
 * A valid tree has exactly n - 1 edges and is fully connected (no cycles).
 *
 * Example 1:
 *   Input: n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
 *   Output: true
 *
 * Example 2:
 *   Input: n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]
 *   Output: false
 *   Explanation: There is a cycle: 1-2-3-1.
 *
 * Constraints:
 * - 1 <= n <= 2000
 * - 0 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - There are no self-loops or repeated edges
 *
 * PATTERN: Union-Find: check n-1 edges and no cycle
 * HINT: A valid tree must have exactly n-1 edges and be connected. Use Union-Find: if any
 *       union operation finds both nodes already in the same set, a cycle exists (return false).
 *       After processing all edges, check edges.length == n - 1.
 *
 * TIME: O(n * alpha(n)) ~ O(n) | SPACE: O(n)
 */
public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        // TODO: Implement your solution here
        return false;
    }
}
