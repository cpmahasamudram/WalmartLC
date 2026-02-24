package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 236 - Lowest Common Ancestor of a Binary Tree
 * Difficulty: Medium | Source: Top 150
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given
 * nodes in the tree. The LCA is defined as the lowest node in T that has
 * both p and q as descendants (a node is allowed to be a descendant of itself).
 *
 * Example 1: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 -> Output: 3
 * Example 2: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 -> Output: 5
 * Example 3: root = [1,2], p = 1, q = 2 -> Output: 1
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [2, 10^5].
 * - -10^9 <= Node.val <= 10^9
 * - All Node.val are unique.
 * - p != q
 * - p and q will exist in the tree.
 *
 * PATTERN: Post-order DFS
 * HINT: If current node is p or q, return it. Recurse left and right.
 *       If both return non-null, current node is LCA. If only one is non-null,
 *       propagate that result up.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class LowestCommonAncestorBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: Implement post-order DFS, return node when both sides found
        return null;
    }
}
