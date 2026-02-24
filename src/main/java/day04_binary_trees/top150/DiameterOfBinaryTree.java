package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 543 - Diameter of Binary Tree
 * Difficulty: Easy | Source: Top 150
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any
 * two nodes in a tree. This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges
 * between them.
 *
 * Example 1: root = [1,2,3,4,5] -> Output: 3
 *   Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * Example 2: root = [1,2] -> Output: 1
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 10^4].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: DFS Height with Global Max
 * HINT: At each node, diameter through it = leftHeight + rightHeight.
 *       Track the global max diameter. Return height = max(left, right) + 1.
 *
 * TIME: O(n) | SPACE: O(h) recursion stack
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        // TODO: Implement DFS tracking maxDiameter via leftHeight + rightHeight
        return 0;
    }
}
