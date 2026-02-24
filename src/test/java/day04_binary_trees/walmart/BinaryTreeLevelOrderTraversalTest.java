package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.BinaryTreeLevelOrderTraversal;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void exampleThreeLevels() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(List.of(List.of(1)), solution.levelOrder(root));
    }

    @Test
    void emptyTree() {
        assertEquals(List.of(), solution.levelOrder(null));
    }

    @Test
    void leftSkewed() {
        TreeNode root = TreeNode.of(1, 2, null, 3);
        List<List<Integer>> expected = List.of(List.of(1), List.of(2), List.of(3));
        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void completeTree() {
        TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> expected = List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6, 7));
        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void twoNodes() {
        TreeNode root = TreeNode.of(1, null, 2);
        List<List<Integer>> expected = List.of(List.of(1), List.of(2));
        assertEquals(expected, solution.levelOrder(root));
    }
}
