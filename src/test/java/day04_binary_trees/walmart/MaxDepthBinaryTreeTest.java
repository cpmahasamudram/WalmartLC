package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.MaxDepthBinaryTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxDepthBinaryTreeTest {

    private final MaxDepthBinaryTree solution = new MaxDepthBinaryTree();

    @Test
    void exampleBalancedTree() {
        // [3,9,20,null,null,15,7] -> depth 3
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void rightSkewedTree() {
        // [1,null,2] -> depth 2
        TreeNode root = TreeNode.of(1, null, 2);
        assertEquals(2, solution.maxDepth(root));
    }

    @Test
    void nullTree() {
        assertEquals(0, solution.maxDepth(null));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(1, solution.maxDepth(root));
    }

    @Test
    void leftSkewedTree() {
        // [1,2,null,3,null,4] -> depth 4
        TreeNode root = TreeNode.of(1, 2, null, 3, null, 4);
        assertEquals(4, solution.maxDepth(root));
    }

    @Test
    void completeTree() {
        // [1,2,3,4,5,6,7] -> depth 3
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(3, solution.maxDepth(root));
    }
}
