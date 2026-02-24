package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

/**
 * LC 104 - Maximum Depth of Binary Tree
 * Difficulty: Easy | Source: Walmart
 *
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest
 * path from the root node down to the farthest leaf node.
 *
 * Example 1: root = [3,9,20,null,null,15,7] -> Output: 3
 * Example 2: root = [1,null,2] -> Output: 2
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: DFS Recursion
 * HINT: max(left, right) + 1. Base case: null node returns 0.
 *
 * TIME: O(n) | SPACE: O(h) where h is the height of the tree (recursion stack)
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        // TODO: Implement DFS recursion: max(left, right) + 1
        return 0;
    }
}
