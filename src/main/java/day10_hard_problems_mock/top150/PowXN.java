package main.java.day10_hard_problems_mock.top150;

/**
 * LC 50 - Pow(x, n)
 * Difficulty: Medium | Source: Top 150
 *
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * Example 1: x = 2.00000, n = 10 -> Output: 1024.00000
 * Example 2: x = 2.10000, n = 3 -> Output: 9.26100
 * Example 3: x = 2.00000, n = -2 -> Output: 0.25000
 *
 * Constraints:
 * - -100.0 < x < 100.0
 * - -2^31 <= n <= 2^31 - 1
 * - n is an integer
 * - Either x is not zero or n > 0
 * - -10^4 <= x^n <= 10^4
 *
 * PATTERN: Fast Exponentiation (Binary Exponentiation)
 * HINT: Use the identity: x^n = (x^(n/2))^2 if n is even, x * (x^(n/2))^2 if n is odd.
 *       Handle negative n by computing 1/x^(-n). Watch out for n = Integer.MIN_VALUE
 *       (convert to long to avoid overflow when negating).
 *
 * TIME: O(log n) | SPACE: O(1) iterative, O(log n) recursive
 */
public class PowXN {

    public double myPow(double x, int n) {
        // TODO: Implement your solution here
        return 0.0;
    }
}
