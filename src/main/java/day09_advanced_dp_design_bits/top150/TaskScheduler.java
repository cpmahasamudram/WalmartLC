package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 621 - Task Scheduler
 * Difficulty: Medium | Source: Top 150
 *
 * You are given an array of CPU tasks, each represented by a character from A to Z,
 * and a cooling interval n. Each cycle the CPU can complete one task or be idle.
 * Tasks can be completed in any order, but there's a constraint: identical tasks
 * must be separated by at least n intervals.
 *
 * Return the minimum number of intervals the CPU will take to finish all the given tasks.
 *
 * Example 1: tasks = ['A','A','A','B','B','B'], n = 2 -> 8
 *   Explanation: A -> B -> idle -> A -> B -> idle -> A -> B
 * Example 2: tasks = ['A','C','A','B','D','B'], n = 1 -> 6
 *   Explanation: A -> B -> C -> D -> A -> B (no idle needed)
 * Example 3: tasks = ['A','A','A','B','B','B'], n = 0 -> 6
 *
 * Constraints:
 * - 1 <= tasks.length <= 10^4
 * - tasks[i] is an uppercase English letter.
 * - 0 <= n <= 100
 *
 * PATTERN: Greedy with Max-Heap or Math Formula
 * HINT: Math approach: Find maxFreq (highest task frequency) and countMax (number of
 *       tasks with that frequency). Result = max(tasks.length, (maxFreq - 1) * (n + 1) + countMax).
 *       The formula computes slots needed with idle time vs. total tasks.
 *
 * TIME: O(n) where n = tasks.length | SPACE: O(1) (26 letters)
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        // TODO: Implement using greedy math formula or max-heap simulation
        return 0;
    }
}
