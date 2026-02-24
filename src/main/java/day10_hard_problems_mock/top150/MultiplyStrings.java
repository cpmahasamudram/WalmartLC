package main.java.day10_hard_problems_mock.top150;

/**
 * LC 43 - Multiply Strings
 * Difficulty: Medium | Source: Top 150
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product
 * of num1 and num2, also represented as a string. You must not use any built-in BigInteger
 * library or convert the inputs to integer directly.
 *
 * Example 1: num1 = "2", num2 = "3" -> Output: "6"
 * Example 2: num1 = "123", num2 = "456" -> Output: "56088"
 *
 * Constraints:
 * - 1 <= num1.length, num2.length <= 200
 * - num1 and num2 consist of digits only
 * - Both num1 and num2 do not contain any leading zero, except the number 0 itself
 *
 * PATTERN: Grade School Multiplication
 * HINT: The product of two numbers of lengths m and n has at most m + n digits. Use an
 *       int array of size m + n. For each pair of digits num1[i] and num2[j], add their
 *       product to positions[i + j] and positions[i + j + 1]. Handle carries from right
 *       to left. Skip leading zeros in the result.
 *
 * TIME: O(m * n) | SPACE: O(m + n)
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        // TODO: Implement your solution here
        return "";
    }
}
