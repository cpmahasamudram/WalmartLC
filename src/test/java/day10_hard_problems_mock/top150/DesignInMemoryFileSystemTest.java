package test.java.day10_hard_problems_mock.top150;

import main.java.day10_hard_problems_mock.top150.DesignInMemoryFileSystem;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DesignInMemoryFileSystemTest {

    @Test
    void basicOperations() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        assertEquals(List.of(), fs.ls("/"));
        fs.mkdir("/a/b/c");
        fs.addContentToFile("/a/b/c/d", "hello");
        assertEquals(List.of("a"), fs.ls("/"));
        assertEquals("hello", fs.readContentFromFile("/a/b/c/d"));
    }

    @Test
    void lsOnFile() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        fs.addContentToFile("/a", "content");
        assertEquals(List.of("a"), fs.ls("/a"));
    }

    @Test
    void appendContent() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        fs.addContentToFile("/file", "hello");
        fs.addContentToFile("/file", " world");
        assertEquals("hello world", fs.readContentFromFile("/file"));
    }

    @Test
    void lsDirectorySorted() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        fs.mkdir("/z");
        fs.mkdir("/a");
        fs.mkdir("/m");
        assertEquals(List.of("a", "m", "z"), fs.ls("/"));
    }

    @Test
    void deepMkdir() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        fs.mkdir("/x/y/z");
        assertEquals(List.of("x"), fs.ls("/"));
        assertEquals(List.of("y"), fs.ls("/x"));
        assertEquals(List.of("z"), fs.ls("/x/y"));
    }

    @Test
    void mixedFilesAndDirs() {
        DesignInMemoryFileSystem fs = new DesignInMemoryFileSystem();
        fs.mkdir("/a/b");
        fs.addContentToFile("/a/file.txt", "data");
        List<String> result = fs.ls("/a");
        assertEquals(List.of("b", "file.txt"), result);
    }
}
