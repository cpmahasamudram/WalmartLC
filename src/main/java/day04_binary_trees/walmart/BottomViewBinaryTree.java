package main.java.day04_binary_trees.walmart;

import main.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * GFG - Bottom View of Binary Tree
 * Difficulty: Medium | Source: Walmart
 *
 * Given a binary tree, return the bottom view of it. The bottom view of a
 * binary tree is the set of nodes visible when the tree is viewed from the
 * bottom. If multiple nodes are at the same horizontal distance and same
 * level, the rightmost (later in BFS) node is considered.
 *
 * Nodes are returned ordered by horizontal distance from left to right.
 *
 * Example 1: root = [20,8,22,5,3,null,25,null,null,10,14]
 *   Output: [5, 10, 3, 14, 25]
 * Example 2: root = [1,2,3]
 *   Output: [2, 1, 3]
 *
 * Constraints:
 * - 1 <= Number of nodes <= 10^5
 * - 1 <= Node.val <= 10^5
 *
 * PATTERN: BFS with Horizontal Distance
 * HINT: Use BFS, track horizontal distance (HD) for each node. Root HD = 0,
 *       left child HD = parent HD - 1, right child HD = parent HD + 1.
 *       Use a TreeMap to store the last node at each HD. The TreeMap keys
 *       give sorted order.
 *
 * TIME: O(n log n) due to TreeMap | SPACE: O(n)
 */
public class BottomViewBinaryTree {
    public List<Integer> bottomView(TreeNode root) {
        // TODO: Implement BFS with horizontal distance using TreeMap
        return new ArrayList<>();
    }
}
