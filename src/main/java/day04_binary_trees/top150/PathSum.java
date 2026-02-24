package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 112 - Path Sum
 * Difficulty: Easy | Source: Top 150
 *
 * Given the root of a binary tree and an integer targetSum, return true if
 * the tree has a root-to-leaf path such that adding up all the values along
 * the path equals targetSum. A leaf is a node with no children.
 *
 * Example 1: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22 -> Output: true
 *   Explanation: The path 5 -> 4 -> 11 -> 2 sums to 22.
 * Example 2: root = [1,2,3], targetSum = 5 -> Output: false
 * Example 3: root = [], targetSum = 0 -> Output: false
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 5000].
 * - -1000 <= Node.val <= 1000
 * - -1000 <= targetSum <= 1000
 *
 * PATTERN: DFS Recursion
 * HINT: Subtract node's value from targetSum as you go. At a leaf, check if
 *       remaining sum equals 0. Return true if either left or right path succeeds.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // TODO: Implement DFS subtracting from target, check leaf == 0
        return false;
    }
}
