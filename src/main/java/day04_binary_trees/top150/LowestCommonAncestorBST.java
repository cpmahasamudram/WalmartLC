package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 235 - Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Medium | Source: Top 150
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA)
 * node of two given nodes in the BST. The LCA is defined as the lowest node
 * in T that has both p and q as descendants (a node is allowed to be a
 * descendant of itself).
 *
 * Example 1: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8 -> Output: 6
 * Example 2: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4 -> Output: 2
 * Example 3: root = [2,1], p = 2, q = 1 -> Output: 2
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [2, 10^5].
 * - -10^9 <= Node.val <= 10^9
 * - All Node.val are unique.
 * - p != q
 * - p and q will exist in the BST.
 *
 * PATTERN: BST Property Navigation
 * HINT: If both p and q are less than root, go left. If both greater, go right.
 *       Otherwise, root is the split point and the LCA.
 *
 * TIME: O(H) where H is tree height | SPACE: O(1) iterative, O(H) recursive
 */
public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: Implement using BST property to navigate left/right
        return null;
    }
}
