package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.ConstructBTPreorderInorder;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBTPreorderInorderTest {

    private final ConstructBTPreorderInorder solution = new ConstructBTPreorderInorder();

    @Test
    void exampleFiveNodes() {
        // preorder=[3,9,20,15,7], inorder=[9,3,15,20,7] -> [3,9,20,null,null,15,7]
        TreeNode result = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(List.of(3, 9, 20, 15, 7), TreeNode.toList(result));
    }

    @Test
    void singleNode() {
        TreeNode result = solution.buildTree(new int[]{-1}, new int[]{-1});
        assertEquals(List.of(-1), TreeNode.toList(result));
    }

    @Test
    void twoNodesLeftChild() {
        // preorder=[1,2], inorder=[2,1] -> [1,2]
        TreeNode result = solution.buildTree(new int[]{1, 2}, new int[]{2, 1});
        assertEquals(List.of(1, 2), TreeNode.toList(result));
    }

    @Test
    void twoNodesRightChild() {
        // preorder=[1,2], inorder=[1,2] -> [1,null,2]
        TreeNode result = solution.buildTree(new int[]{1, 2}, new int[]{1, 2});
        assertEquals(List.of(1, null, 2), TreeNode.toList(result));
    }

    @Test
    void completeThreeLevels() {
        // preorder=[1,2,4,5,3,6,7], inorder=[4,2,5,1,6,3,7]
        TreeNode result = solution.buildTree(
                new int[]{1, 2, 4, 5, 3, 6, 7},
                new int[]{4, 2, 5, 1, 6, 3, 7});
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), TreeNode.toList(result));
    }

    @Test
    void leftSkewed() {
        // preorder=[3,2,1], inorder=[1,2,3] -> [3,2,null,1]
        TreeNode result = solution.buildTree(new int[]{3, 2, 1}, new int[]{1, 2, 3});
        assertEquals(List.of(3, 2, null, 1), TreeNode.toList(result));
    }
}
