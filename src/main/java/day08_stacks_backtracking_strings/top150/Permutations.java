package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 46 - Permutations
 * Difficulty: Medium | Source: TOP 150
 *
 * Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 *
 * Example 1: nums = [1,2,3] -> Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2: nums = [0,1] -> Output: [[0,1],[1,0]]
 * Example 3: nums = [1] -> Output: [[1]]
 *
 * Constraints:
 * - 1 <= nums.length <= 6
 * - -10 <= nums[i] <= 10
 * - All the integers of nums are unique
 *
 * PATTERN: Backtracking with used array
 * HINT: Use a boolean[] used array to track which elements are in the current permutation.
 *       At each level, iterate all elements; if not used, mark used, add to path, recurse,
 *       then backtrack (unmark and remove). When path length equals nums length, add a copy.
 *
 * TIME: O(n * n!) | SPACE: O(n) recursion depth + used array
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // TODO: Implement your solution here
        return null;
    }
}
