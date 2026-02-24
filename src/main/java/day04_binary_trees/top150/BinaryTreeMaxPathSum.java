package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 124 - Binary Tree Maximum Path Sum
 * Difficulty: Hard | Source: Top 150
 *
 * A path in a binary tree is a sequence of nodes where each pair of adjacent
 * nodes in the sequence has an edge connecting them. A node can only appear in
 * the sequence at most once. Note that the path does not need to pass through
 * the root. The path sum of a path is the sum of the node's values in the path.
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 *
 * Example 1: root = [1,2,3] -> Output: 6
 *   Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * Example 2: root = [-10,9,20,null,null,15,7] -> Output: 42
 *   Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 3 * 10^4].
 * - -1000 <= Node.val <= 1000
 *
 * PATTERN: DFS with Global Max Tracking
 * HINT: At each node, compute max gain from left and right (clamped to 0).
 *       Update global max with node.val + leftGain + rightGain (path through node).
 *       Return node.val + max(leftGain, rightGain) to parent (single path only).
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class BinaryTreeMaxPathSum {
    public int maxPathSum(TreeNode root) {
        // TODO: Implement DFS tracking global max path sum
        return 0;
    }
}
