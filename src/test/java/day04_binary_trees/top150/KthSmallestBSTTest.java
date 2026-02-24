package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.KthSmallestBST;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestBSTTest {

    private final KthSmallestBST solution = new KthSmallestBST();

    @Test
    void exampleKEqualsOne() {
        // [3,1,4,null,2], k=1 -> 1
        TreeNode root = TreeNode.of(3, 1, 4, null, 2);
        assertEquals(1, solution.kthSmallest(root, 1));
    }

    @Test
    void exampleKEqualsThree() {
        // [5,3,6,2,4,null,null,1], k=3 -> 3
        TreeNode root = TreeNode.of(5, 3, 6, 2, 4, null, null, 1);
        assertEquals(3, solution.kthSmallest(root, 3));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertEquals(1, solution.kthSmallest(root, 1));
    }

    @Test
    void kEqualsN() {
        // [3,1,4], k=3 -> 4 (largest element)
        TreeNode root = TreeNode.of(3, 1, 4);
        assertEquals(4, solution.kthSmallest(root, 3));
    }

    @Test
    void leftSkewedBST() {
        // [3,2,null,1], k=2 -> 2
        TreeNode root = TreeNode.of(3, 2, null, 1);
        assertEquals(2, solution.kthSmallest(root, 2));
    }

    @Test
    void rightSkewedBST() {
        // [1,null,2,null,3], k=3 -> 3
        TreeNode root = TreeNode.of(1, null, 2, null, 3);
        assertEquals(3, solution.kthSmallest(root, 3));
    }
}
