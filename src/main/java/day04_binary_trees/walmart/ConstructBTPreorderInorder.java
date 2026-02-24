package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

/**
 * LC 105 - Construct Binary Tree from Preorder and Inorder Traversal
 * Difficulty: Medium | Source: Walmart
 *
 * Given two integer arrays preorder and inorder where preorder is the preorder
 * traversal of a binary tree and inorder is the inorder traversal of the same
 * tree, construct and return the binary tree.
 *
 * Example 1: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7] -> Output: [3,9,20,null,null,15,7]
 * Example 2: preorder = [-1], inorder = [-1] -> Output: [-1]
 *
 * Constraints:
 * - 1 <= preorder.length <= 3000
 * - inorder.length == preorder.length
 * - -3000 <= preorder[i], inorder[i] <= 3000
 * - preorder and inorder consist of unique values.
 * - Each value of inorder also appears in preorder.
 * - preorder is guaranteed to be the preorder traversal of the tree.
 * - inorder is guaranteed to be the inorder traversal of the tree.
 *
 * PATTERN: Recursive Divide and Conquer
 * HINT: First element of preorder is the root. Find it in inorder to split
 *       left/right subtrees. Use a HashMap for O(1) index lookup in inorder.
 *       Recurse on left and right partitions.
 *
 * TIME: O(n) | SPACE: O(n) for HashMap and recursion stack
 */
public class ConstructBTPreorderInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO: Implement recursive build with preorder root + inorder split
        return null;
    }
}
