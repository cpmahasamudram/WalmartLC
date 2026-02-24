package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.InvertBinaryTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private final InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    void exampleFullTree() {
        // [4,2,7,1,3,6,9] -> [4,7,2,9,6,3,1]
        TreeNode root = TreeNode.of(4, 2, 7, 1, 3, 6, 9);
        TreeNode result = solution.invertTree(root);
        assertEquals(List.of(4, 7, 2, 9, 6, 3, 1), TreeNode.toList(result));
    }

    @Test
    void exampleThreeNodes() {
        // [2,1,3] -> [2,3,1]
        TreeNode root = TreeNode.of(2, 1, 3);
        TreeNode result = solution.invertTree(root);
        assertEquals(List.of(2, 3, 1), TreeNode.toList(result));
    }

    @Test
    void emptyTree() {
        assertNull(solution.invertTree(null));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        TreeNode result = solution.invertTree(root);
        assertEquals(List.of(1), TreeNode.toList(result));
    }

    @Test
    void leftOnlyTree() {
        // [1,2] -> [1,null,2]
        TreeNode root = TreeNode.of(1, 2);
        TreeNode result = solution.invertTree(root);
        assertEquals(List.of(1, null, 2), TreeNode.toList(result));
    }

    @Test
    void asymmetricTree() {
        // [1,2,3,null,4] -> [1,3,2,null,null,4]
        TreeNode root = TreeNode.of(1, 2, 3, null, 4);
        TreeNode result = solution.invertTree(root);
        assertEquals(List.of(1, 3, 2, null, null, 4), TreeNode.toList(result));
    }
}
