package test.java.day07_linked_lists_design.top150;

import main.java.day07_linked_lists_design.top150.InsertDeleteGetRandom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomTest {

    @Test
    void basicOperations() {
        InsertDeleteGetRandom set = new InsertDeleteGetRandom();
        assertTrue(set.insert(1));
        assertFalse(set.remove(2));
        assertTrue(set.insert(2));
        int rand = set.getRandom();
        assertTrue(rand == 1 || rand == 2);
        assertTrue(set.remove(1));
        assertFalse(set.insert(2)); // already present
        assertEquals(2, set.getRandom());
    }

    @Test
    void insertDuplicate() {
        InsertDeleteGetRandom set = new InsertDeleteGetRandom();
        assertTrue(set.insert(1));
        assertFalse(set.insert(1));
    }

    @Test
    void removeNonExistent() {
        InsertDeleteGetRandom set = new InsertDeleteGetRandom();
        assertFalse(set.remove(1));
    }

    @Test
    void insertRemoveInsert() {
        InsertDeleteGetRandom set = new InsertDeleteGetRandom();
        assertTrue(set.insert(1));
        assertTrue(set.remove(1));
        assertTrue(set.insert(1));
        assertEquals(1, set.getRandom());
    }
}
