package main.java.day05_graphs_topological_sort.walmart;

/**
 * LC 210 - Course Schedule II
 * Difficulty: Medium | Source: WALMART
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you
 * must take course bi before course ai. Return the ordering of courses you should take to
 * finish all courses. If there are many valid answers, return any of them. If it is impossible
 * to finish all courses, return an empty array.
 *
 * Example 1:
 *   Input: numCourses = 2, prerequisites = [[1,0]]
 *   Output: [0,1]
 *
 * Example 2:
 *   Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 *   Output: [0,2,1,3] or [0,1,2,3]
 *
 * Example 3:
 *   Input: numCourses = 1, prerequisites = []
 *   Output: [0]
 *
 * Constraints:
 * - 1 <= numCourses <= 2000
 * - 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * - prerequisites[i].length == 2
 * - 0 <= ai, bi < numCourses
 * - ai != bi
 * - All pairs [ai, bi] are distinct
 *
 * PATTERN: Topological sort returning the ordering (Kahn's BFS)
 * HINT: Same as Course Schedule I but record the order in which nodes are dequeued.
 *       Build adjacency list + in-degree array. BFS from in-degree 0 nodes, append each
 *       dequeued node to result. If result size != numCourses, return empty array (cycle).
 *
 * TIME: O(V + E) | SPACE: O(V + E)
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // TODO: Implement your solution here
        return new int[0];
    }
}
