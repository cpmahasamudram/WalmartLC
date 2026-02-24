package main.java.day10_hard_problems_mock.top150;

import java.util.List;

/**
 * LC 68 - Text Justification
 * Difficulty: Hard | Source: Top 150
 *
 * Given an array of strings words and a width maxWidth, format the text such that each line
 * has exactly maxWidth characters and is fully (left and right) justified. Pack as many words
 * as you can in each line. Pad extra spaces between words when necessary so that each line
 * has exactly maxWidth characters. Extra spaces should be distributed as evenly as possible.
 * If the number of spaces does not divide evenly, the left slots get more spaces. The last
 * line should be left-justified with no extra space between words.
 *
 * Example 1: words = ["This","is","an","example","of","text","justification."], maxWidth = 16
 *   -> Output: ["This    is    an", "example  of text", "justification.  "]
 * Example 2: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 *   -> Output: ["What   must   be", "acknowledgment  ", "shall be        "]
 *
 * Constraints:
 * - 1 <= words.length <= 300
 * - 1 <= words[i].length <= 20
 * - words[i] consists of only English letters and symbols
 * - 1 <= maxWidth <= 100
 * - words[i].length <= maxWidth
 *
 * PATTERN: Greedy Line Packing
 * HINT: Greedily pack words into each line. For each line, calculate total spaces needed,
 *       distribute evenly among gaps. Handle the last line separately (left-justified).
 *       For a single-word line, left-justify and pad right with spaces.
 *
 * TIME: O(n) where n = total characters | SPACE: O(n)
 */
public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        // TODO: Implement your solution here
        return null;
    }
}
