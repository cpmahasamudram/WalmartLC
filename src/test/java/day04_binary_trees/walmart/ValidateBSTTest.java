package test.java.day04_binary_trees.walmart;

import main.java.day04_binary_trees.walmart.ValidateBST;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    private final ValidateBST solution = new ValidateBST();

    @Test
    void validSimpleBST() {
        // [2,1,3] -> true
        TreeNode root = TreeNode.of(2, 1, 3);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void invalidBSTRightChildViolation() {
        // [5,1,4,null,null,3,6] -> false (4 < 5 but is right child)
        TreeNode root = TreeNode.of(5, 1, 4, null, null, 3, 6);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void singleNode() {
        TreeNode root = TreeNode.of(1);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void invalidBSTGrandchildViolation() {
        // [5,4,6,null,null,3,7] -> false (3 < 5 but in right subtree)
        TreeNode root = TreeNode.of(5, 4, 6, null, null, 3, 7);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void validLargerBST() {
        // [10,5,15,3,7,13,18] -> true
        TreeNode root = TreeNode.of(10, 5, 15, 3, 7, 13, 18);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void equalValuesInvalid() {
        // [2,2,2] -> false (BST requires strictly less/greater)
        TreeNode root = TreeNode.of(2, 2, 2);
        assertFalse(solution.isValidBST(root));
    }
}
