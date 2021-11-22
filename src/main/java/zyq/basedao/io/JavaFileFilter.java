package zyq.basedao.io;

import java.io.File;
import java.util.Objects;

/**
 * @authoradmin
 * @date 2021/11/22 23:45
 * @description JavaFileFilter
 */
public class JavaFileFilter {
    public static void main(String[] args) {
        File dir = new File("D:/JavaStudy/basedao/src/main/java/zyq/basedao/io");
        File[] files = dir.listFiles(file -> {
            //判断如果获取到的是⽬录，直接放⾏
            if (file.isDirectory()) {
                return true;
            }
            //获取路径中的⽂件名，判断是否java结尾，是就返回true
            return file.getName().toLowerCase().endsWith("java");
        });
        //遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}