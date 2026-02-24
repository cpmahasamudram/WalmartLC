package main.java.day04_binary_trees.top150;

import main.java.common.TreeNode;

/**
 * LC 297 - Serialize and Deserialize Binary Tree
 * Difficulty: Hard | Source: Top 150
 *
 * Serialization is the process of converting a data structure or object into a
 * sequence of bits so that it can be stored in a file or memory buffer, or
 * transmitted across a network connection link to be reconstructed later.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no
 * restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that a binary tree can be serialized to a string and
 * this string can be deserialized to the original tree structure.
 *
 * Example 1: root = [1,2,3,null,null,4,5] -> serialize -> deserialize -> [1,2,3,null,null,4,5]
 * Example 2: root = [] -> serialize -> deserialize -> []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -1000 <= Node.val <= 1000
 *
 * PATTERN: BFS or Preorder DFS with Null Markers
 * HINT: Use BFS: serialize level by level with "null" markers for missing nodes.
 *       Or use preorder DFS: write value or "null", recurse left then right.
 *       Deserialize by reading tokens in the same order.
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class SerializeDeserializeBT {
    public String serialize(TreeNode root) {
        // TODO: Implement serialization (BFS or preorder with null markers)
        return "";
    }

    public TreeNode deserialize(String data) {
        // TODO: Implement deserialization (reverse of serialize)
        return null;
    }
}
