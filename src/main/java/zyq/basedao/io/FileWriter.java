//package zyq.basedao.io;
//
//import java.io.IOException;
//
///**
// * @authoradmin
// * @date 2021/11/23 3:57
// * @description FileWriter
// */
//public class FileWriter {
//    public static void main(String[] args) throws IOException {
//        // 使⽤⽂件名称创建流对象
//        FileWriter fw = new FileWriter("fw.txt");
//        //写出单个字符
//        fw.write(97);
//        fw.flush();
//        //写出字符数组
//        char[] chs = "ABCDED".toCharArray();
//        fw.write(chs);
//        fw.flush();
//        //写出字符数组的⼀部分，开始索引，写出个数
//        fw.write(chs, 1, 3);
//        fw.flush();
//        //写出字符串
//        fw.write("Java⼯程师");
//        fw.flush();
//        fw.close();
//    }
//}
