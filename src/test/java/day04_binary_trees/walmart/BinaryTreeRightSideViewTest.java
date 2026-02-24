package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.BinaryTreeRightSideView;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    @Test
    void exampleMixedTree() {
        // [1,2,3,null,5,null,4] -> [1,3,4]
        TreeNode root = TreeNode.of(1, 2, 3, null, 5, null, 4);
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }

    @Test
    void rightOnlyChild() {
        // [1,null,3] -> [1,3]
        TreeNode root = TreeNode.of(1, null, 3);
        assertEquals(List.of(1, 3), solution.rightSideView(root));
    }

    @Test
    void emptyTree() {
        assertEquals(List.of(), solution.rightSideView(null));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(List.of(1), solution.rightSideView(root));
    }

    @Test
    void leftDeeperThanRight() {
        // [1,2,3,4] -> right side sees 1,3,4
        TreeNode root = TreeNode.of(1, 2, 3, 4);
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }

    @Test
    void completeTree() {
        // [1,2,3,4,5,6,7] -> [1,3,7]
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(List.of(1, 3, 7), solution.rightSideView(root));
    }
}
