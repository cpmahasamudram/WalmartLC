package main.java.day10_hard_problems_mock.top150;

/**
 * LC 1235 - Maximum Profit in Job Scheduling
 * Difficulty: Hard | Source: Top 150
 *
 * We have n jobs where every job is scheduled to be done from startTime[i] to endTime[i],
 * obtaining a profit of profit[i]. Return the maximum profit you can take such that there
 * are no two jobs in the subset with overlapping time range. If you choose a job that ends
 * at time t, you can start another job that starts at time t.
 *
 * Example 1: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
 *   -> Output: 120 (Take jobs 1 and 4: profit = 50 + 70 = 120)
 * Example 2: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
 *   -> Output: 150 (Take jobs 1, 4, 5: profit = 20 + 70 + 60 = 150)
 *
 * Constraints:
 * - 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
 * - 1 <= startTime[i] < endTime[i] <= 10^9
 * - 1 <= profit[i] <= 10^4
 *
 * PATTERN: DP + Binary Search
 * HINT: Sort jobs by endTime. dp[i] = max profit considering first i jobs. For each job i,
 *       binary search for the latest job j that ends before job i starts. Then
 *       dp[i] = max(dp[i-1], profit[i] + dp[j]). Use binary search on endTimes for j.
 *
 * TIME: O(n log n) | SPACE: O(n)
 */
public class MaxProfitJobScheduling {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // TODO: Implement your solution here
        return 0;
    }
}
