package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 101 - Symmetric Tree
 * Difficulty: Easy | Source: Top 150
 *
 * Given the root of a binary tree, check whether it is a mirror of itself
 * (i.e., symmetric around its center).
 *
 * Example 1: root = [1,2,2,3,4,4,3] -> Output: true
 * Example 2: root = [1,2,2,null,3,null,3] -> Output: false
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 1000].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: DFS Recursion (Mirror Comparison)
 * HINT: Create a helper that takes two nodes. They are mirrors if both null,
 *       or both non-null with equal values AND left.left mirrors right.right
 *       AND left.right mirrors right.left.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        // TODO: Implement mirror comparison of left and right subtrees
        return false;
    }
}
