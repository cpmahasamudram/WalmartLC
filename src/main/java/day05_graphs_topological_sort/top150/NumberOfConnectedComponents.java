package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 323 - Number of Connected Components in an Undirected Graph
 * Difficulty: Medium | Source: TOP 150
 *
 * You have a graph of n nodes. You are given an integer n and an array edges where
 * edges[i] = [ai, bi] indicates that there is an edge between ai and bi in the graph.
 * Return the number of connected components in the graph.
 *
 * Example 1:
 *   Input: n = 5, edges = [[0,1],[1,2],[3,4]]
 *   Output: 2
 *
 * Example 2:
 *   Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
 *   Output: 1
 *
 * Constraints:
 * - 1 <= n <= 2000
 * - 1 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - There are no repeated edges
 *
 * PATTERN: Union-Find or DFS to count connected components
 * HINT: Initialize n components. For each edge, union the two nodes. Each successful union
 *       decrements the component count by 1. Alternatively, build adjacency list and DFS
 *       from each unvisited node, counting traversals.
 *
 * TIME: O(n + E * alpha(n)) ~ O(n + E) | SPACE: O(n)
 */
public class NumberOfConnectedComponents {

    public int countComponents(int n, int[][] edges) {
        // TODO: Implement your solution here
        return 0;
    }
}
