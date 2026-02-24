package main.java.day09_advanced_dp_design_bits.top150;

/**
 * LC 13 - Roman to Integer
 * Difficulty: Easy | Source: Top 150
 *
 * Roman numerals are represented by seven symbols: I(1), V(5), X(10), L(50),
 * C(100), D(500), M(1000). Given a roman numeral, convert it to an integer.
 *
 * Subtractive cases: IV=4, IX=9, XL=40, XC=90, CD=400, CM=900.
 *
 * Example 1: s = "III" -> 3
 * Example 2: s = "LVIII" -> 58 (L=50, V=5, III=3)
 * Example 3: s = "MCMXCIV" -> 1994 (M=1000, CM=900, XC=90, IV=4)
 *
 * Constraints:
 * - 1 <= s.length <= 15
 * - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *
 * PATTERN: Map values, subtract if smaller precedes larger
 * HINT: Create a map of char -> value. Iterate left to right. If current value
 *       is less than the next value, subtract it (subtractive case like IV).
 *       Otherwise, add it. Process the last character by always adding it.
 *
 * TIME: O(n) where n = s.length | SPACE: O(1)
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        // TODO: Implement by mapping roman chars to values and handling subtractive cases
        return 0;
    }
}
