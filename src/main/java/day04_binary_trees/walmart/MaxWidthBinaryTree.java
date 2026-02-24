package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

/**
 * LC 662 - Maximum Width of Binary Tree
 * Difficulty: Medium | Source: Walmart
 *
 * Given the root of a binary tree, return the maximum width of the given tree.
 * The maximum width of a tree is the maximum width among all levels. The width
 * of one level is defined as the length between the end-nodes (the leftmost
 * and rightmost non-null nodes), where the null nodes between the end-nodes
 * that would be present in a complete binary tree are also counted.
 *
 * Example 1: root = [1,3,2,5,3,null,9] -> Output: 4
 *   Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).
 * Example 2: root = [1,3,2,5,null,null,9,6,null,7] -> Output: 7
 * Example 3: root = [1,3,2,5] -> Output: 2
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 3000].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: BFS with Position Indexing
 * HINT: Assign index to each node (root=0, left=2*i+1, right=2*i+2).
 *       Width at each level = rightmost index - leftmost index + 1.
 *       Normalize indices per level to avoid overflow.
 *
 * TIME: O(n) | SPACE: O(n) for the queue
 */
public class MaxWidthBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        // TODO: Implement BFS with position indexing
        return 0;
    }
}
