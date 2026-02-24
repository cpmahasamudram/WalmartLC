package test.java.day07_linked_lists_design.walmart;

import main.java.day07_linked_lists_design.walmart.LRUCache;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void basicOperations() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3); // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    void updateExistingKey() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // update key 1
        assertEquals(10, cache.get(1));
        cache.put(3, 3); // evicts key 2
        assertEquals(-1, cache.get(2));
    }

    @Test
    void getMissReturnsNeg1() {
        LRUCache cache = new LRUCache(1);
        assertEquals(-1, cache.get(5));
    }

    @Test
    void capacityOne() {
        LRUCache cache = new LRUCache(1);
        cache.put(1, 1);
        cache.put(2, 2); // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void getRefreshesOrder() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);     // refreshes key 1
        cache.put(3, 3);  // evicts key 2
        assertEquals(-1, cache.get(2));
        assertEquals(1, cache.get(1));
    }
}
