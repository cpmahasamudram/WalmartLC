package main.java.day09_advanced_dp_design_bits.top150;

import java.util.*;

/**
 * LC 981 - Time Based Key-Value Store
 * Difficulty: Medium | Source: Top 150
 *
 * Design a time-based key-value data structure that can store multiple values
 * for the same key at different time stamps and retrieve the key's value at a
 * certain timestamp.
 *
 * Implement the TimeMap class:
 * - TimeMap() Initializes the object.
 * - void set(String key, String value, int timestamp) Stores the key with the
 *   value at the given timestamp.
 * - String get(String key, int timestamp) Returns a value such that set was called
 *   previously, with timestamp_prev <= timestamp. If there are multiple such values,
 *   it returns the value associated with the largest timestamp_prev. If there are
 *   no values, it returns "".
 *
 * Example:
 *   TimeMap tm = new TimeMap();
 *   tm.set("foo", "bar", 1);
 *   tm.get("foo", 1);  -> "bar"
 *   tm.get("foo", 3);  -> "bar"
 *   tm.set("foo", "bar2", 4);
 *   tm.get("foo", 4);  -> "bar2"
 *   tm.get("foo", 5);  -> "bar2"
 *   tm.get("foo", 0);  -> ""
 *
 * Constraints:
 * - 1 <= key.length, value.length <= 100
 * - key and value consist of lowercase English letters and digits.
 * - 1 <= timestamp <= 10^7
 * - All timestamps of set are strictly increasing.
 * - At most 2 * 10^5 calls to set and get.
 *
 * PATTERN: HashMap + Binary Search on Timestamps
 * HINT: Store Map<String, List<(timestamp, value)>>. Since timestamps are strictly
 *       increasing, the list is already sorted. For get, binary search for the largest
 *       timestamp <= given timestamp. Return corresponding value or "" if none found.
 *
 * TIME: O(1) set, O(log n) get | SPACE: O(n) where n = total set calls
 */
public class TimeBasedKeyValueStore {

    public TimeBasedKeyValueStore() {
        // TODO: Implement - initialize map of key to list of (timestamp, value) pairs
    }

    public void set(String key, String value, int timestamp) {
        // TODO: Implement - append (timestamp, value) to the key's list
    }

    public String get(String key, int timestamp) {
        // TODO: Implement - binary search for largest timestamp <= given timestamp
        return "";
    }
}
