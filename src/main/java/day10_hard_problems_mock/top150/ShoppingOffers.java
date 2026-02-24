package main.java.day10_hard_problems_mock.top150;

import java.util.List;

/**
 * LC 638 - Shopping Offers
 * Difficulty: Medium | Source: Top 150
 *
 * In a store, there are items to buy. Each item has a price. There are also several special
 * offers: a special offer consists of one or more different kinds of items with a sale price.
 * Given the price of each item, the set of special offers, and the number of each item we
 * need to buy, return the lowest price you have to pay for exactly the items you need.
 * You cannot buy more items than needed, even if it would lower the overall price.
 *
 * Example 1: price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
 *   -> Output: 14 (Buy 3 of item 0 and 2 of item 1 without special offers = 6+10=16.
 *              Or use offer [1,2,10] once + buy 2 of item 0 = 10+4=14)
 * Example 2: price = [2,3,4], special = [[1,1,0,4],[2,2,1,9]], needs = [1,2,1]
 *   -> Output: 11
 *
 * Constraints:
 * - n == price.length == needs.length
 * - 1 <= n <= 6
 * - 0 <= price[i], needs[i] <= 10
 * - 1 <= special.length <= 100
 * - special[i].length == n + 1
 * - 0 <= special[i][j] <= 50
 *
 * PATTERN: DFS / Backtracking with Memoization
 * HINT: Try each special offer if it does not exceed remaining needs. Recursively compute
 *       the minimum cost. Use a map with the needs list as key for memoization. Base case:
 *       buy remaining items at full price. Compare using offer vs not using any more offers.
 *
 * TIME: O(n * k * m^n) where k = offers, m = max need | SPACE: O(m^n) for memoization
 */
public class ShoppingOffers {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // TODO: Implement your solution here
        return 0;
    }
}
