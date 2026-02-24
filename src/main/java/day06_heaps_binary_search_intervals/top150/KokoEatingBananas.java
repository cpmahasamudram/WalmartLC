package main.java.day06_heaps_binary_search_intervals.top150;

/**
 * LC 875 - Koko Eating Bananas
 * Difficulty: Medium | Source: Top 150
 *
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has
 * piles[i] bananas. The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she
 * chooses some pile of bananas and eats k bananas from that pile. If the
 * pile has less than k bananas, she eats all of them and will not eat any
 * more bananas during that hour.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * Example 1: piles = [3,6,7,11], h = 8 -> Output: 4
 * Example 2: piles = [30,11,23,4,20], h = 5 -> Output: 30
 * Example 3: piles = [30,11,23,4,20], h = 6 -> Output: 23
 *
 * Constraints:
 * - 1 <= piles.length <= 10^4
 * - piles.length <= h <= 10^9
 * - 1 <= piles[i] <= 10^9
 *
 * PATTERN: Binary Search on eating speed
 * HINT: Binary search on speed k from 1 to max(piles). For each k, calculate
 *       total hours needed (ceil(pile/k) for each pile). If total <= h, search lower.
 *
 * TIME: O(n log(max(piles))) | SPACE: O(1)
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // TODO: Implement
        return 0;
    }
}
