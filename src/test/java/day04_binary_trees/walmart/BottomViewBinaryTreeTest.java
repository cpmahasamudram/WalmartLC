package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.BottomViewBinaryTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BottomViewBinaryTreeTest {

    private final BottomViewBinaryTree solution = new BottomViewBinaryTree();

    @Test
    void exampleWithOverlap() {
        // [20,8,22,5,3,null,25,null,null,10,14]
        // Bottom view: [5, 10, 3, 14, 25]
        TreeNode root = TreeNode.of(20, 8, 22, 5, 3, null, 25, null, null, 10, 14);
        assertEquals(List.of(5, 10, 3, 14, 25), solution.bottomView(root));
    }

    @Test
    void simpleThreeNodes() {
        // [1,2,3] -> bottom view: [2,1,3]
        TreeNode root = TreeNode.of(1, 2, 3);
        assertEquals(List.of(2, 1, 3), solution.bottomView(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(List.of(1), solution.bottomView(root));
    }

    @Test
    void leftSkewed() {
        // [1,2,null,3] -> HD: 1=0, 2=-1, 3=-2 -> bottom view: [3,2,1]
        TreeNode root = TreeNode.of(1, 2, null, 3);
        assertEquals(List.of(3, 2, 1), solution.bottomView(root));
    }

    @Test
    void rightSkewed() {
        // [1,null,2,null,3] -> HD: 1=0, 2=1, 3=2 -> bottom view: [1,2,3]
        TreeNode root = TreeNode.of(1, null, 2, null, 3);
        assertEquals(List.of(1, 2, 3), solution.bottomView(root));
    }

    @Test
    void perfectTree() {
        // [1,2,3,4,5,6,7] -> bottom view: [4,2,6,3,7]
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(List.of(4, 2, 6, 3, 7), solution.bottomView(root));
    }
}
