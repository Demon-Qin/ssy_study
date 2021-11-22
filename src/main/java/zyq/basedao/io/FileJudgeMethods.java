package zyq.basedao.io;

import java.io.File;

/**
 * @authoradmin
 * @date 2021/11/22 16:23
 * @description FileJudgeMethods
 */
public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("C:/Users/admin/Desktop/bbb.java");
        File f2 = new File("C:/Users/admin/Desktop/aaa");
        // 判断是否存在
        System.out.println("C:/Users/admin/Desktop/bbb.java 是否存在:" +
                f.exists());
        System.out.println("C:/Users/admin/Desktop/aaa 是否存在" + f2.exists());
        // 判断是⽂件还是⽬录
        System.out.println("C:/Users/admin/Desktop/aaa 是⽂件?:" +
                f2.isFile());
        System.out.println("C:/Users/admin/Desktop/aaa 是⽬录?:" +
                f2.isDirectory());
    }
}
