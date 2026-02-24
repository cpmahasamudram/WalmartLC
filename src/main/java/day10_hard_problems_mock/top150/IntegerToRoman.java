package main.java.day10_hard_problems_mock.top150;

/**
 * LC 12 - Integer to Roman
 * Difficulty: Medium | Source: Top 150
 *
 * Given an integer, convert it to a Roman numeral. Roman numerals use seven symbols:
 * I=1, V=5, X=10, L=50, C=100, D=500, M=1000. Subtraction forms: IV=4, IX=9, XL=40,
 * XC=90, CD=400, CM=900.
 *
 * Example 1: num = 3749 -> Output: "MMMDCCXLIX"
 * Example 2: num = 58 -> Output: "LVIII"
 * Example 3: num = 1994 -> Output: "MCMXCIV"
 *
 * Constraints:
 * - 1 <= num <= 3999
 *
 * PATTERN: Greedy with Value Table
 * HINT: Create parallel arrays of values [1000,900,500,400,100,90,50,40,10,9,5,4,1] and
 *       corresponding symbols ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"].
 *       Iterate from largest to smallest: while num >= value, append symbol and subtract value.
 *
 * TIME: O(1) (bounded by 3999) | SPACE: O(1)
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        // TODO: Implement your solution here
        return "";
    }
}
