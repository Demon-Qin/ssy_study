package zyq.basedao.io;

import java.io.File;
import java.util.Objects;

/**
 * @authoradmin
 * @date 2021/11/22 17:17
 * @description ListFile
 */
public class ListFile {
    public static void main(String[] args) {
        File dir = new File("D:/JavaStudy");
        //获取当前⽬录下的⽂件以及⽂件夹对象，通过⽂件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}