package zyq.basedao.io;

import java.io.File;

/**
 * @authoradmin
 * @date 2021/11/22 16:16
 * @description FilePath
 */
public class FilePath {
    public static void main(String[] args) {
        // 桌⾯的Day1.md⽂件
        File f = new File("C:/Users/admin/Desktop/Day1.md");
        System.out.println(f.getAbsolutePath());
        // 项⽬下的bbb.txt⽂件
        File f2 = new File("/bbb.txt");
        System.out.println(f2.getAbsolutePath());
    }
}
