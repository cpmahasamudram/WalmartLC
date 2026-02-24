package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 226 - Invert Binary Tree
 * Difficulty: Easy | Source: Top 150
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 * Inverting a binary tree means swapping every left child with its right child.
 *
 * Example 1: root = [4,2,7,1,3,6,9] -> Output: [4,7,2,9,6,3,1]
 * Example 2: root = [2,1,3] -> Output: [2,3,1]
 * Example 3: root = [] -> Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: DFS Recursion
 * HINT: Swap left and right children at each node, then recurse on both subtrees.
 *       Base case: null node returns null.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // TODO: Implement recursive swap of left and right children
        return null;
    }
}
