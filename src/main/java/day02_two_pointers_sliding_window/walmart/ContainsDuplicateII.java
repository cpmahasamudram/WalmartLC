package main.java.day02_two_pointers_sliding_window.walmart;

/**
 * LC 219 - Contains Duplicate II
 * Difficulty: Easy | Source: WALMART
 *
 * Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1: nums = [1,2,3,1], k = 3 → Output: true
 * Example 2: nums = [1,0,1,1], k = 1 → Output: true
 * Example 3: nums = [1,2,3,1,2,3], k = 2 → Output: false
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * - 0 <= k <= 10^5
 *
 * PATTERN: Sliding Window + HashSet
 * HINT: Maintain a HashSet of size k. Slide the window: add the new element,
 *       if it was already in the set return true, else remove the element leaving the window.
 *
 * TIME: O(n) | SPACE: O(min(n, k))
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // TODO: Implement your solution here
        return false;
    }
}
