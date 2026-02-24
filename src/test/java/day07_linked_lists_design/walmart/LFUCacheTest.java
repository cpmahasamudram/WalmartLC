package test.java.day07_linked_lists_design.walmart;

import main.java.day07_linked_lists_design.walmart.LFUCache;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LFUCacheTest {

    @Test
    void basicOperations() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1)); // freq(1)=2
        cache.put(3, 3);              // evicts key 2 (freq 1)
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3)); // freq(3)=2
        cache.put(4, 4);              // evicts key 1 (freq 2, but LRU among freq-2)
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    void updateExistingKey() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(1, 10);
        assertEquals(10, cache.get(1));
    }

    @Test
    void capacityOne() {
        LFUCache cache = new LFUCache(1);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
        cache.put(2, 2); // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void getMissReturnsNeg1() {
        LFUCache cache = new LFUCache(2);
        assertEquals(-1, cache.get(5));
    }

    @Test
    void tieBreaksLRU() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1); // freq=1
        cache.put(2, 2); // freq=1
        cache.put(3, 3); // evicts key 1 (LRU among freq-1)
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }
}
