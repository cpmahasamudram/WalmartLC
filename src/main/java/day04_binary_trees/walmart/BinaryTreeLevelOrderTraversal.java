package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 102 - Binary Tree Level Order Traversal
 * Difficulty: Medium | Source: Walmart
 *
 * Given the root of a binary tree, return the level order traversal of its
 * nodes' values. (i.e., from left to right, level by level).
 *
 * Example 1: root = [3,9,20,null,null,15,7] -> Output: [[3],[9,20],[15,7]]
 * Example 2: root = [1] -> Output: [[1]]
 * Example 3: root = [] -> Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 2000].
 * - -1000 <= Node.val <= 1000
 *
 * PATTERN: BFS with Queue
 * HINT: Use a queue. Process all nodes at the current level (queue size)
 *       before moving to the next level. Collect values per level into a list.
 *
 * TIME: O(n) | SPACE: O(n) for the queue
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement BFS with queue, processing one level at a time
        return new ArrayList<>();
    }
}
