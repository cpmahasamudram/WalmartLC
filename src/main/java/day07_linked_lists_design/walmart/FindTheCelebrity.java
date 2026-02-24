package main.java.day07_linked_lists_design.walmart;

/**
 * LC 277 - Find the Celebrity
 * Difficulty: Medium | Source: WALMART
 *
 * Among n people (labeled 0 to n-1), a celebrity is someone who:
 * - Is known by everyone else
 * - Knows nobody
 * You are given a helper bool knows(a, b). Find the celebrity, or return -1.
 *
 * Example 1: graph = [[1,1,0],[0,1,0],[1,1,1]] → Output: 1
 * Example 2: graph = [[1,0,1],[1,1,0],[0,1,1]] → Output: -1
 *
 * Constraints:
 * - n == graph.length == graph[i].length
 * - 2 <= n <= 100
 * - graph[i][j] is 0 or 1
 * - graph[i][i] == 1
 *
 * PATTERN: Two-pass elimination
 * HINT: Pass 1: candidate = 0. For i=1..n-1, if knows(candidate, i) then candidate = i.
 *       Pass 2: verify candidate — everyone knows them and they know nobody.
 *
 * TIME: O(n) | SPACE: O(1)
 */
public class FindTheCelebrity {

    // Simulated knows API — set this in tests
    private int[][] graph;

    public FindTheCelebrity(int[][] graph) {
        this.graph = graph;
    }

    private boolean knows(int a, int b) {
        return graph[a][b] == 1;
    }

    public int findCelebrity(int n) {
        // TODO: Implement your solution here
        return -1;
    }
}
