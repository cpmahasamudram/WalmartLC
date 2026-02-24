package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 230 - Kth Smallest Element in a BST
 * Difficulty: Medium | Source: Top 150
 *
 * Given the root of a binary search tree, and an integer k, return the kth
 * smallest value (1-indexed) of all the values of the nodes in the tree.
 *
 * Example 1: root = [3,1,4,null,2], k = 1 -> Output: 1
 * Example 2: root = [5,3,6,2,4,null,null,1], k = 3 -> Output: 3
 *
 * Constraints:
 * - The number of nodes in the tree is n.
 * - 1 <= k <= n <= 10^4
 * - 0 <= Node.val <= 10^4
 *
 * PATTERN: Inorder Traversal (BST yields sorted order)
 * HINT: Perform inorder traversal (left, root, right). Count nodes visited.
 *       When count reaches k, return that node's value. Can use iterative
 *       stack-based inorder to stop early.
 *
 * TIME: O(H + k) where H is tree height | SPACE: O(H) for stack
 */
public class KthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        // TODO: Implement inorder traversal, count to k
        return 0;
    }
}
