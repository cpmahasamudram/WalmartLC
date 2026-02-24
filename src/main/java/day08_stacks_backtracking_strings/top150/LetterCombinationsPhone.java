package main.java.day08_stacks_backtracking_strings.top150;

import java.util.List;

/**
 * LC 17 - Letter Combinations of a Phone Number
 * Difficulty: Medium | Source: TOP 150
 *
 * Given a string containing digits from 2-9 inclusive, return all possible letter
 * combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters (like on telephone buttons):
 *   2 -> "abc", 3 -> "def", 4 -> "ghi", 5 -> "jkl",
 *   6 -> "mno", 7 -> "pqrs", 8 -> "tuv", 9 -> "wxyz"
 *
 * Example 1: digits = "23" -> Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2: digits = "" -> Output: []
 * Example 3: digits = "2" -> Output: ["a","b","c"]
 *
 * Constraints:
 * - 0 <= digits.length <= 4
 * - digits[i] is a digit in the range ['2', '9']
 *
 * PATTERN: Backtracking with digit-to-letters map
 * HINT: Build a map from each digit to its letters. Backtrack by iterating over the
 *       letters for the current digit, appending a letter, recursing on the next digit
 *       index, then removing the last letter. Base case: index == digits.length.
 *
 * TIME: O(4^n) where n = digits.length | SPACE: O(n) recursion depth
 */
public class LetterCombinationsPhone {

    public List<String> letterCombinations(String digits) {
        // TODO: Implement your solution here
        return null;
    }
}
