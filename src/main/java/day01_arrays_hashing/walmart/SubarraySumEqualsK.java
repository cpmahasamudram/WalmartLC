package day01_arrays_hashing.walmart;

/**
 * LC 560 - Subarray Sum Equals K
 * Difficulty: Medium | Source: WALMART (★★★★★ #1 MOST ASKED)
 *
 * Given an array of integers nums and an integer k, return the total number
 * of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1: nums = [1,1,1], k = 2 → Output: 2
 * Example 2: nums = [1,2,3], k = 3 → Output: 2
 *
 * Constraints:
 * - 1 <= nums.length <= 2 * 10^4
 * - -1000 <= nums[i] <= 1000
 * - -10^7 <= k <= 10^7
 *
 * PATTERN: Prefix Sum + HashMap
 * HINT: prefix[i] - prefix[j] = k means subarray [j+1..i] sums to k.
 *       Store frequency of each prefix sum in a map.
 *       At each index, check how many previous prefix sums equal (currentSum - k).
 *
 * TIME: O(n) | SPACE: O(n)
 */
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        // TODO: Implement your solution here
        return -1;
    }
}