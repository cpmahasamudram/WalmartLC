package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.BinaryTreeMaxPathSum;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaxPathSumTest {

    private final BinaryTreeMaxPathSum solution = new BinaryTreeMaxPathSum();

    @Test
    void exampleSimple() {
        // [1,2,3] -> 6 (path: 2->1->3)
        TreeNode root = TreeNode.of(1, 2, 3);
        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void exampleWithNegatives() {
        // [-10,9,20,null,null,15,7] -> 42 (path: 15->20->7)
        TreeNode root = TreeNode.of(-10, 9, 20, null, null, 15, 7);
        assertEquals(42, solution.maxPathSum(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(5);
        assertEquals(5, solution.maxPathSum(root));
    }

    @Test
    void singleNegativeNode() {
        TreeNode root = TreeNode.of(-3);
        assertEquals(-3, solution.maxPathSum(root));
    }

    @Test
    void allNegatives() {
        // [-1,-2,-3] -> -1 (single node is best)
        TreeNode root = TreeNode.of(-1, -2, -3);
        assertEquals(-1, solution.maxPathSum(root));
    }

    @Test
    void pathNotThroughRoot() {
        // [1,-2,3,4,5] -> max path is 4->-2->5 = 7 or just 4+(-2)+5 vs 3+1+5 = 9
        // Actually: 4->-2->1->3 = 6, or 5->-2->1->3 = 7, or 4->-2->5 = 7
        // Let's use a clearer example: [-5,4,null,1,2]
        // Path: 1->4->2 = 7
        TreeNode root = TreeNode.of(-5, 4, null, 1, 2);
        assertEquals(7, solution.maxPathSum(root));
    }
}
