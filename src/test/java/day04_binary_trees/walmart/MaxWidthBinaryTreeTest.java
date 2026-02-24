package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.MaxWidthBinaryTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxWidthBinaryTreeTest {

    private final MaxWidthBinaryTree solution = new MaxWidthBinaryTree();

    @Test
    void exampleWidthFour() {
        // [1,3,2,5,3,null,9] -> width 4 at level 3 (5,3,null,9)
        TreeNode root = TreeNode.of(1, 3, 2, 5, 3, null, 9);
        assertEquals(4, solution.widthOfBinaryTree(root));
    }

    @Test
    void leftHeavyTree() {
        // [1,3,2,5] -> width 2 at level 2
        TreeNode root = TreeNode.of(1, 3, 2, 5);
        assertEquals(2, solution.widthOfBinaryTree(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(1, solution.widthOfBinaryTree(root));
    }

    @Test
    void perfectTree() {
        // [1,2,3,4,5,6,7] -> width 4 at bottom level
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(4, solution.widthOfBinaryTree(root));
    }

    @Test
    void zigzagTree() {
        // [1,2,3,null,5,null,7] -> width 2 at levels 2 and 3
        TreeNode root = TreeNode.of(1, 2, 3, null, 5, null, 7);
        assertEquals(2, solution.widthOfBinaryTree(root));
    }

    @Test
    void twoNodesLeftChild() {
        TreeNode root = TreeNode.of(1, 2);
        assertEquals(1, solution.widthOfBinaryTree(root));
    }
}
