package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 39 - Combination Sum
 * Difficulty: Medium | Source: TOP 150
 *
 * Given an array of distinct integers candidates and a target integer target, return a
 * list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two
 * combinations are unique if the frequency of at least one of the chosen numbers is different.
 *
 * Example 1: candidates = [2,3,6,7], target = 7 -> Output: [[2,2,3],[7]]
 * Example 2: candidates = [2,3,5], target = 8 -> Output: [[2,2,2,2],[2,3,3],[3,5]]
 * Example 3: candidates = [2], target = 1 -> Output: []
 *
 * Constraints:
 * - 1 <= candidates.length <= 30
 * - 2 <= candidates[i] <= 40
 * - All elements of candidates are distinct
 * - 1 <= target <= 40
 *
 * PATTERN: Backtracking allowing reuse
 * HINT: At each step, try each candidate starting from the current index (not 0, to avoid
 *       duplicate combos). Subtract from target. If target == 0, add the combination.
 *       If target < 0, prune. Pass the same index (not i+1) to allow reuse.
 *
 * TIME: O(n^(target/min)) | SPACE: O(target/min) recursion depth
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO: Implement your solution here
        return null;
    }
}
