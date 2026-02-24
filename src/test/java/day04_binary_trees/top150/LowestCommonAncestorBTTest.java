package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.LowestCommonAncestorBT;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorBTTest {

    private final LowestCommonAncestorBT solution = new LowestCommonAncestorBT();

    @Test
    void exampleLCAIsRoot() {
        // [3,5,1,6,2,0,8,null,null,7,4], p=5, q=1 -> LCA=3
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = root.left;        // node 5
        TreeNode q = root.right;       // node 1
        assertEquals(3, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void exampleLCAIsAncestor() {
        // [3,5,1,6,2,0,8,null,null,7,4], p=5, q=4 -> LCA=5
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = root.left;                // node 5
        TreeNode q = root.left.right.right;    // node 4
        assertEquals(5, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void parentAndChild() {
        // [1,2], p=1, q=2 -> LCA=1
        TreeNode root = TreeNode.of(1, 2);
        TreeNode p = root;          // node 1
        TreeNode q = root.left;    // node 2
        assertEquals(1, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void bothLeafsSameParent() {
        // [1,2,3], p=2, q=3 -> LCA=1
        TreeNode root = TreeNode.of(1, 2, 3);
        TreeNode p = root.left;     // node 2
        TreeNode q = root.right;    // node 3
        assertEquals(1, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void deepNodes() {
        // [3,5,1,6,2,0,8,null,null,7,4], p=7, q=4 -> LCA=2
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = root.left.right.left;     // node 7
        TreeNode q = root.left.right.right;    // node 4
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void sameSideDeepAndShallow() {
        // [3,5,1,6,2,0,8,null,null,7,4], p=6, q=4 -> LCA=5
        TreeNode root = TreeNode.of(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = root.left.left;           // node 6
        TreeNode q = root.left.right.right;    // node 4
        assertEquals(5, solution.lowestCommonAncestor(root, p, q).val);
    }
}
