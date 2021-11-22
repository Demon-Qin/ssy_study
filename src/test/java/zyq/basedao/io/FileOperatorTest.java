package zyq.basedao.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class FileOperatorTest {

    @Test
    void createDir() {
        String path = "C:/Users/admin/Desktop/aaa";
        boolean res = FileOperator.createDir(path);
        assertFalse(res);
    }

    @Test
    void createFile() {
        String path = "C:/Users/admin/Desktop/aaa/hello.txt";
        boolean res = false;
        try {
            res = FileOperator.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        assertFalse(res);
    }

    @Test
    void getFileInfo() {
        File file = new File("C:/Users/admin/Desktop/Pictures/1.png");
        Properties fileProperties = FileOperator.getFileInfo(file);
        assertEquals(4, fileProperties.size());
    }

    @Test
    void deleteFile() {
        boolean res =
                FileOperator.deleteFile("C:/Users/admin/Desktop/Pictures/1.png");
        assertFalse(res);
    }
}