package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 199 - Binary Tree Right Side View
 * Difficulty: Medium | Source: Walmart
 *
 * Given the root of a binary tree, imagine yourself standing on the right
 * side of it, return the values of the nodes you can see ordered from top
 * to bottom.
 *
 * Example 1: root = [1,2,3,null,5,null,4] -> Output: [1,3,4]
 * Example 2: root = [1,null,3] -> Output: [1,3]
 * Example 3: root = [] -> Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 *
 * PATTERN: BFS Level Order
 * HINT: BFS level by level, take the last element of each level. Alternatively,
 *       DFS with right-first traversal, adding the first node seen at each depth.
 *
 * TIME: O(n) | SPACE: O(n) for the queue
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        // TODO: Implement BFS, take last element per level
        return new ArrayList<>();
    }
}
