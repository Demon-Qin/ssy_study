package zyq.basedao.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @authoradmin
 * @date 2021/11/23 4:06
 * @description BufferedWriterDemo
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("read.txt"));
        // 写出数据
        bw.write("Java");
        // 写出换⾏
        bw.newLine();
        bw.write("程序");
        bw.newLine();
        bw.write("员");
        bw.newLine();
        // 释放资源
        bw.close();
    }
//public static void main(String[] args) throws IOException {
//    // 创建流对象
//    BufferedReader br = new BufferedReader(new FileReader("read.txt"));
//    // 定义字符串,保存读取的⼀⾏⽂字
//    String line = null;
//    // 循环读取,读取到最后返回null
//    while ((line = br.readLine())!=null) {
//        System.out.print(line);
//        System.out.println("------");
//    }
//    // 释放资源
//    br.close();
//}

}
