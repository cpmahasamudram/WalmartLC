package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.SymmetricTree;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    private final SymmetricTree solution = new SymmetricTree();

    @Test
    void symmetricExample() {
        // [1,2,2,3,4,4,3] -> true
        TreeNode root = TreeNode.of(1, 2, 2, 3, 4, 4, 3);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void asymmetricExample() {
        // [1,2,2,null,3,null,3] -> false
        TreeNode root = TreeNode.of(1, 2, 2, null, 3, null, 3);
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void twoLevelsSymmetric() {
        // [1,2,2] -> true
        TreeNode root = TreeNode.of(1, 2, 2);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void differentValuesAsymmetric() {
        // [1,2,3] -> false
        TreeNode root = TreeNode.of(1, 2, 3);
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    void onlyLeftChild() {
        // [1,2] -> false (not symmetric: left exists, right does not)
        TreeNode root = TreeNode.of(1, 2);
        assertFalse(solution.isSymmetric(root));
    }
}
