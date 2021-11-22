package zyq.basedao.io;

import java.io.File;

/**
 * @authoradmin
 * @date 2021/11/22 15:54
 * @description FileConstructor
 */
public class FileConstructor {
    public static void main(String[] args) {
        // ⽂件路径名
        String pathname = "C:/Users/admin/Desktop/aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1);
        // 通过⽗路径和⼦路径字符串
        String parent = "C:/Users/admin/Desktop/aaa";
        String child1 = "bbb.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);
        // 通过⽗级File对象和⼦路径字符串
        File parentDir = new File("C:/Users/admin/Desktop/aaa");
        String child2 = "bbb.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }
}
