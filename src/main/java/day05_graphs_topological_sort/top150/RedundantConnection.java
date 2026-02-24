package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 684 - Redundant Connection
 * Difficulty: Medium | Source: TOP 150
 *
 * In this problem, a tree is an undirected graph that is connected and has no cycles. You are
 * given a graph that started as a tree with n nodes (labeled 1 to n), with one additional edge
 * added. The added edge has two different vertices chosen from 1 to n, and is not an edge that
 * already exists. The graph is given as an array edges of length n where edges[i] = [ai, bi]
 * indicates an edge between nodes ai and bi.
 *
 * Return an edge that can be removed so that the resulting graph is a tree. If there are
 * multiple answers, return the answer that occurs last in the input.
 *
 * Example 1:
 *   Input: edges = [[1,2],[1,3],[2,3]]
 *   Output: [2,3]
 *
 * Example 2:
 *   Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
 *   Output: [1,4]
 *
 * Constraints:
 * - n == edges.length
 * - 3 <= n <= 1000
 * - edges[i].length == 2
 * - 1 <= ai < bi <= n
 * - ai != bi
 * - There are no repeated edges
 * - The given graph is connected
 *
 * PATTERN: Union-Find: find the first edge that causes a cycle
 * HINT: Process edges in order. For each edge, union the two nodes. If both nodes are already
 *       in the same component (find returns the same root), this edge creates a cycle and is
 *       the answer. Return the last such edge encountered.
 *
 * TIME: O(n * alpha(n)) ~ O(n) | SPACE: O(n)
 */
public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {
        // TODO: Implement your solution here
        return new int[0];
    }
}
