package test.java.day04_binary_trees.top150;

import main.java.day04_binary_trees.top150.SerializeDeserializeBT;
import main.java.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SerializeDeserializeBTTest {

    private final SerializeDeserializeBT solution = new SerializeDeserializeBT();

    @Test
    void exampleWithNulls() {
        // [1,2,3,null,null,4,5] -> serialize -> deserialize -> same tree
        TreeNode original = TreeNode.of(1, 2, 3, null, null, 4, 5);
        String data = solution.serialize(original);
        TreeNode result = solution.deserialize(data);
        assertEquals(TreeNode.toList(original), TreeNode.toList(result));
    }

    @Test
    void emptyTree() {
        String data = solution.serialize(null);
        TreeNode result = solution.deserialize(data);
        assertNull(result);
    }

    @Test
    void singleNode() {
        TreeNode original = TreeNode.of(1);
        String data = solution.serialize(original);
        TreeNode result = solution.deserialize(data);
        assertEquals(List.of(1), TreeNode.toList(result));
    }

    @Test
    void leftSkewedTree() {
        TreeNode original = TreeNode.of(1, 2, null, 3);
        String data = solution.serialize(original);
        TreeNode result = solution.deserialize(data);
        assertEquals(TreeNode.toList(original), TreeNode.toList(result));
    }

    @Test
    void completeTree() {
        TreeNode original = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
        String data = solution.serialize(original);
        TreeNode result = solution.deserialize(data);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), TreeNode.toList(result));
    }

    @Test
    void negativeValues() {
        TreeNode original = TreeNode.of(-1, -2, -3);
        String data = solution.serialize(original);
        TreeNode result = solution.deserialize(data);
        assertEquals(List.of(-1, -2, -3), TreeNode.toList(result));
    }
}
