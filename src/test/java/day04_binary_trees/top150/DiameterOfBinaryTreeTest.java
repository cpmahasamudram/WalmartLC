package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.DiameterOfBinaryTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

    @Test
    void exampleDiameterThree() {
        // [1,2,3,4,5] -> diameter 3 (path: 4->2->1->3 or 5->2->1->3)
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5);
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void twoNodes() {
        // [1,2] -> diameter 1
        TreeNode root = TreeNode.of(1, 2);
        assertEquals(1, solution.diameterOfBinaryTree(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(0, solution.diameterOfBinaryTree(root));
    }

    @Test
    void diameterNotThroughRoot() {
        // [1,2,null,3,4,5,null,null,6] -> longest path may not go through root
        TreeNode root = TreeNode.of(1, 2, null, 3, 4, 5, null, null, 6);
        assertEquals(4, solution.diameterOfBinaryTree(root));
    }

    @Test
    void balancedTree() {
        // [1,2,3,4,5,6,7] -> diameter 4
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(4, solution.diameterOfBinaryTree(root));
    }

    @Test
    void linearTree() {
        // [1,2,null,3] -> diameter 2
        TreeNode root = TreeNode.of(1, 2, null, 3);
        assertEquals(2, solution.diameterOfBinaryTree(root));
    }
}
