package main.java.day10_hard_problems_mock.top150;

import java.util.List;

/**
 * LC 588 - Design In-Memory File System
 * Difficulty: Hard | Source: Top 150
 *
 * Design a data structure that simulates an in-memory file system.
 *
 * Implement the FileSystem class:
 * - FileSystem() Initializes the object of the system.
 * - List<String> ls(String path) If path is a file path, returns a list that only contains
 *   this file's name. If path is a directory path, returns the list of file and directory
 *   names in this directory, sorted in lexicographic order.
 * - void mkdir(String path) Makes a new directory according to the given path. The path is
 *   absolute. If middle directories do not exist, create them as well.
 * - void addContentToFile(String filePath, String content) If filePath does not exist,
 *   creates that file containing given content. If it already exists, appends the content.
 * - String readContentFromFile(String filePath) Returns the content in the file at filePath.
 *
 * Example:
 *   FileSystem fs = new FileSystem();
 *   fs.ls("/");                          -> []
 *   fs.mkdir("/a/b/c");
 *   fs.addContentToFile("/a/b/c/d", "hello");
 *   fs.ls("/");                          -> ["a"]
 *   fs.readContentFromFile("/a/b/c/d");  -> "hello"
 *
 * Constraints:
 * - 1 <= path.length, filePath.length <= 100
 * - path and filePath are absolute paths starting with '/'
 * - All directory and file names only contain lowercase letters
 * - All operations are valid (no reading from non-existent file, etc.)
 * - At most 300 calls to ls, mkdir, addContentToFile, readContentFromFile
 *
 * PATTERN: Trie of Directories
 * HINT: Each trie node represents a directory or file. Each node has a map of children
 *       (name -> node), a boolean isFile flag, and a StringBuilder for file content.
 *       Navigate the trie by splitting the path on '/'. For ls, if the node is a file
 *       return just its name; if directory, return sorted keys of children.
 *
 * TIME: O(m + n + k*log(k)) for ls (m=path length, n=depth, k=children count)
 * SPACE: O(total content + total path characters stored)
 */
public class DesignInMemoryFileSystem {

    public DesignInMemoryFileSystem() {
        // TODO: Implement your solution here
    }

    public List<String> ls(String path) {
        // TODO: Implement your solution here
        return null;
    }

    public void mkdir(String path) {
        // TODO: Implement your solution here
    }

    public void addContentToFile(String filePath, String content) {
        // TODO: Implement your solution here
    }

    public String readContentFromFile(String filePath) {
        // TODO: Implement your solution here
        return "";
    }
}
