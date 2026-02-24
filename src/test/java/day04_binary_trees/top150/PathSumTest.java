package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.PathSum;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    private final PathSum solution = new PathSum();

    @Test
    void examplePathExists() {
        // [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum=22
        // Path: 5->4->11->2 = 22
        TreeNode root = TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1);
        assertTrue(solution.hasPathSum(root, 22));
    }

    @Test
    void exampleNoPath() {
        // [1,2,3], targetSum=5
        TreeNode root = TreeNode.of(1, 2, 3);
        assertFalse(solution.hasPathSum(root, 5));
    }

    @Test
    void emptyTree() {
        assertFalse(solution.hasPathSum(null, 0));
    }

    @Test
    void singleNodeMatch() {
        TreeNode root = TreeNode.of(5);
        assertTrue(solution.hasPathSum(root, 5));
    }

    @Test
    void singleNodeNoMatch() {
        TreeNode root = TreeNode.of(5);
        assertFalse(solution.hasPathSum(root, 1));
    }

    @Test
    void negativeValues() {
        // [1,-2,3], targetSum=-1 -> path 1->-2 = -1
        TreeNode root = TreeNode.of(1, -2, 3);
        assertTrue(solution.hasPathSum(root, -1));
    }
}
