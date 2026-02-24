package main.java.day05_graphs_topological_sort.walmart;

/**
 * LC 207 - Course Schedule
 * Difficulty: Medium | Source: WALMART
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you
 * must take course bi first if you want to take course ai. Return true if you can finish all
 * courses. Otherwise, return false.
 *
 * Example 1:
 *   Input: numCourses = 2, prerequisites = [[1,0]]
 *   Output: true
 *   Explanation: You take course 0 first, then course 1.
 *
 * Example 2:
 *   Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 *   Output: false
 *   Explanation: There is a cycle between course 0 and course 1.
 *
 * Constraints:
 * - 1 <= numCourses <= 2000
 * - 0 <= prerequisites.length <= 5000
 * - prerequisites[i].length == 2
 * - 0 <= ai, bi < numCourses
 * - All prerequisite pairs are unique
 *
 * PATTERN: Topological sort / cycle detection (Kahn's BFS or DFS with coloring)
 * HINT: Build an adjacency list and in-degree array. Use BFS (Kahn's algorithm): enqueue all
 *       nodes with in-degree 0, process them, decrement neighbors' in-degrees. If all nodes
 *       are processed, no cycle exists. Alternatively, use DFS with 3-state coloring to detect
 *       back edges (cycles).
 *
 * TIME: O(V + E) | SPACE: O(V + E)
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO: Implement your solution here
        return false;
    }
}
