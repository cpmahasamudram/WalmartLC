package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.LowestCommonAncestorBST;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorBSTTest {

    private final LowestCommonAncestorBST solution = new LowestCommonAncestorBST();

    @Test
    void exampleLCAIsRoot() {
        // [6,2,8,0,4,7,9,null,null,3,5], p=2, q=8 -> LCA=6
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = root.left;       // node 2
        TreeNode q = root.right;      // node 8
        assertEquals(6, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void exampleLCAIsAncestor() {
        // [6,2,8,0,4,7,9,null,null,3,5], p=2, q=4 -> LCA=2
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = root.left;            // node 2
        TreeNode q = root.left.right;      // node 4
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void twoNodesParentChild() {
        // [2,1], p=2, q=1 -> LCA=2
        TreeNode root = TreeNode.of(2, 1);
        TreeNode p = root;           // node 2
        TreeNode q = root.left;     // node 1
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void bothInLeftSubtree() {
        // [6,2,8,0,4], p=0, q=4 -> LCA=2
        TreeNode root = TreeNode.of(6, 2, 8, 0, 4);
        TreeNode p = root.left.left;    // node 0
        TreeNode q = root.left.right;   // node 4
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void bothInRightSubtree() {
        // [6,2,8,null,null,7,9], p=7, q=9 -> LCA=8
        TreeNode root = TreeNode.of(6, 2, 8, null, null, 7, 9);
        TreeNode p = root.right.left;   // node 7
        TreeNode q = root.right.right;  // node 9
        assertEquals(8, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void leafNodes() {
        // [4,2,6,1,3,5,7], p=1, q=3 -> LCA=2
        TreeNode root = TreeNode.of(4, 2, 6, 1, 3, 5, 7);
        TreeNode p = root.left.left;    // node 1
        TreeNode q = root.left.right;   // node 3
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }
}
