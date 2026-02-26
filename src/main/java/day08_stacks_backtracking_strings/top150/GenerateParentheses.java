package main.java.day08_stacks_backtracking_strings.top150;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 22 - Generate Parentheses
 * Difficulty: Medium | Source: TOP 150
 *
 * Given n pairs of parentheses, write a function to generate all combinations of
 * well-formed parentheses.
 *
 * Example 1: n = 3 -> Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2: n = 1 -> Output: ["()"]
 *
 * Constraints:
 * - 1 <= n <= 8
 *
 * PATTERN: Backtracking with open/close count
 * HINT: Track open and close counts. Add '(' if open < n. Add ')' if close < open.
 *       When the string length equals 2*n, add it to the result. This ensures only
 *       valid combinations are generated.
 *
 * TIME COMPLEXITY: O(n * 4^n / sqrt(n))
 *
 *   Step 1 — Permutations with repetition (upper bound):
 *     Building a string of length 2n. At each position, 2 choices: '(' or ')'.
 *     Total permutations = 2 × 2 × ... (2n times) = 2^(2n) = (2²)^n = 4^n.
 *     e.g. n=3: 2^6 = 64 total strings like ((()))  )))(((  ((((((  etc.
 *
 *   Step 2 — Combinations (first pruning):
 *     Valid strings must use exactly n '(' and n ')'.
 *     This is "choose which n of 2n positions get '(' " = C(2n, n) = (2n)! / (n! * n!).
 *     e.g. n=3: C(6,3) = 20 arrangements with exactly 3 of each.
 *
 *   Step 3 — Catalan number (second pruning):
 *     Not all C(2n,n) arrangements are valid — at every prefix, opens >= closes.
 *     Valid count = C(2n,n) / (n+1) = nth Catalan number.
 *     e.g. n=3: 20/4 = 5 valid strings.
 *     Catalan(n) ≈ 4^n / (n^(3/2) * sqrt(π))
 *
 *   Step 4 — String construction cost:
 *     Each valid string is length 2n → O(n) to build.
 *     Total: O(n * Catalan(n)) = O(n * 4^n / sqrt(n)).
 *
 * SPACE: O(n) — recursion depth is 2n, each frame is O(1)
 */
public class GenerateParentheses {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        helper("", n, 0, 0);
        return res;
    }

    void helper(String slate, int n, int left, int right){
        if(slate.length() == 2*n) {
            res.add(slate);
            return;
        }

        if(left < n)
            helper(slate + "(", n, left + 1, right);

        if(right < left)
            helper(slate + ")", n , left , right + 1);
    }
}
