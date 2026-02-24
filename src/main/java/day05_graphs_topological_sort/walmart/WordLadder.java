package main.java.day05_graphs_topological_sort.walmart;

import java.util.List;

/**
 * LC 127 - Word Ladder
 * Difficulty: Hard | Source: WALMART
 *
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList
 * is a sequence beginWord -> s1 -> s2 -> ... -> sk such that every adjacent pair of words
 * differs by a single letter, every si (1 <= i <= k) is in wordList, and sk == endWord.
 * Given beginWord, endWord, and wordList, return the number of words in the shortest
 * transformation sequence, or 0 if no such sequence exists.
 *
 * Example 1:
 *   Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 *   Output: 5
 *   Explanation: "hit" -> "hot" -> "dot" -> "dog" -> "cog" (5 words)
 *
 * Example 2:
 *   Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 *   Output: 0
 *   Explanation: endWord "cog" is not in wordList.
 *
 * Constraints:
 * - 1 <= beginWord.length <= 10
 * - endWord.length == beginWord.length
 * - 1 <= wordList.length <= 5000
 * - wordList[i].length == beginWord.length
 * - beginWord, endWord, and wordList[i] consist of lowercase English letters
 * - beginWord != endWord
 * - All strings in wordList are unique
 *
 * PATTERN: BFS shortest path word transformation
 * HINT: Use BFS starting from beginWord. For each word, try changing each character to 'a'-'z'
 *       and check if the new word is in the wordList (use a HashSet). Track visited words.
 *       The first time you reach endWord is the shortest path. Return the level count.
 *
 * TIME: O(M^2 * N) where M = word length, N = wordList size | SPACE: O(M^2 * N)
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO: Implement your solution here
        return 0;
    }
}
