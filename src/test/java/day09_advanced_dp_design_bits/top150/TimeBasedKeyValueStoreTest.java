package test.java.day09_advanced_dp_design_bits.top150;

import main.java.day09_advanced_dp_design_bits.top150.TimeBasedKeyValueStore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeBasedKeyValueStoreTest {

    @Test
    void exactTimestampMatch() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("foo", "bar", 1);
        assertEquals("bar", tm.get("foo", 1));
    }

    @Test
    void getWithLaterTimestamp() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("foo", "bar", 1);
        assertEquals("bar", tm.get("foo", 3));
    }

    @Test
    void getWithEarlierTimestamp() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("foo", "bar", 2);
        assertEquals("", tm.get("foo", 1));
    }

    @Test
    void multipleTimestampsSameKey() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("foo", "bar", 1);
        tm.set("foo", "bar2", 4);
        assertEquals("bar", tm.get("foo", 1));
        assertEquals("bar", tm.get("foo", 3));
        assertEquals("bar2", tm.get("foo", 4));
        assertEquals("bar2", tm.get("foo", 5));
    }

    @Test
    void nonExistentKey() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        assertEquals("", tm.get("missing", 1));
    }

    @Test
    void multipleKeys() {
        TimeBasedKeyValueStore tm = new TimeBasedKeyValueStore();
        tm.set("a", "val1", 1);
        tm.set("b", "val2", 1);
        assertEquals("val1", tm.get("a", 1));
        assertEquals("val2", tm.get("b", 1));
        assertEquals("", tm.get("a", 0));
    }
}
