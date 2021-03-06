package zyq.basedao.io;

import java.io.File;
import java.io.IOException;

/**
 * @authoradmin
 * @date 2021/11/22 16:29
 * @description FileCreateDelete
 */
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // ⽂件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否创建:" + f.createNewFile());
        System.out.println("是否存在:" + f.exists());
        // ⽬录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在:" + f2.exists());
        System.out.println("是否创建:" + f2.mkdirs());
        System.out.println("是否存在:" + f2.exists());
        // ⽂件的删除
        System.out.println(f.delete());
        // ⽬录的删除
        System.out.println(f2.delete());
    }
}