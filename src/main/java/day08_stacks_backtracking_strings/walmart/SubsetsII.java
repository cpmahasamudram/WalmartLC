package main.java.day08_stacks_backtracking_strings.walmart;

import java.util.List;

/**
 * LC 90 - Subsets II
 * Difficulty: Medium | Source: WALMART
 *
 * Given an integer array nums that may contain duplicates, return all possible subsets
 * (the power set). The solution set must not contain duplicate subsets. Return the
 * solution in any order.
 *
 * Example 1: nums = [1,2,2] -> Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 * Example 2: nums = [0] -> Output: [[],[0]]
 *
 * Constraints:
 * - 1 <= nums.length <= 10
 * - -10 <= nums[i] <= 10
 *
 * PATTERN: Backtracking with skip duplicates
 * HINT: Sort the array first. During backtracking, if nums[i] == nums[i-1] and i > start,
 *       skip nums[i] to avoid generating duplicate subsets. Add a copy of the current
 *       subset to the result at each recursive call.
 *
 * TIME: O(n * 2^n) | SPACE: O(n) recursion depth
 */
public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // TODO: Implement your solution here
        return null;
    }
}
