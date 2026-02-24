package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

/**
 * LC 98 - Validate Binary Search Tree
 * Difficulty: Medium | Source: Walmart
 *
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 *
 * Example 1: root = [2,1,3] -> Output: true
 * Example 2: root = [5,1,4,null,null,3,6] -> Output: false
 *   Explanation: The root node's value is 5 but its right child's value is 4.
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10^4].
 * - -2^31 <= Node.val <= 2^31 - 1
 *
 * PATTERN: DFS with Min/Max Bounds (or Inorder Traversal)
 * HINT: Pass min/max bounds recursively. For left child, upper bound becomes
 *       parent's value. For right child, lower bound becomes parent's value.
 *       Use Long.MIN_VALUE/MAX_VALUE for initial bounds.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        // TODO: Implement with min/max bounds or inorder traversal
        return false;
    }
}
