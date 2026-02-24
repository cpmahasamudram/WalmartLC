package main.java.day05_graphs_topological_sort.top150;

/**
 * LC 547 - Number of Provinces
 * Difficulty: Medium | Source: TOP 150
 *
 * There are n cities. Some of them are connected, while some are not. If city a is connected
 * directly with city b, and city b is connected directly with city c, then city a is connected
 * indirectly with city c. A province is a group of directly or indirectly connected cities
 * and no other cities outside of the group.
 *
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and
 * the jth city are directly connected, and isConnected[i][j] = 0 otherwise. Return the total
 * number of provinces.
 *
 * Example 1:
 *   Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 *   Output: 2
 *
 * Example 2:
 *   Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 *   Output: 3
 *
 * Constraints:
 * - 1 <= n <= 200
 * - n == isConnected.length
 * - n == isConnected[i].length
 * - isConnected[i][j] is 0 or 1
 * - isConnected[i][i] == 1
 * - isConnected[i][j] == isConnected[j][i]
 *
 * PATTERN: Union-Find or DFS on adjacency matrix
 * HINT: Use DFS/BFS: for each unvisited city, start a traversal and mark all reachable cities
 *       as visited. Each traversal = one province. Alternatively, use Union-Find: union
 *       connected cities and count distinct roots.
 *
 * TIME: O(n^2) | SPACE: O(n)
 */
public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        // TODO: Implement your solution here
        return 0;
    }
}
