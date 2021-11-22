package zyq.basedao.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @authoradmin
 * @date 2021/11/23 3:55
 * @description FileReader
 */
public class FileReader {

    public FileReader(String fileName) {
    }

    public static void main(String[] args) throws IOException {
        // 定义需要读取的⽂件路径,该⽂件采⽤了gbk编码
        String fileName = "C:/Users/admin/Desktop/out.txt";
        // 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new
                FileInputStream(fileName));
        // 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new
                FileInputStream(fileName), "GBK");
        // 定义变量,保存字符
        int read;
        System.out.println("\n**********使⽤默认编码读取************\n");
        // 使⽤默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char) read);
        }
        isr.close();
        System.out.println("\n**********使⽤GBK编码读取************\n");
        // 使⽤指定编码字符流读取,正常解析
        while ((read = isr2.read()) != -1) {
            System.out.print((char) read);
        }
        isr2.close();
    }

//    public static void main(String[] args) throws IOException {
//        // 使⽤⽂件名称创建流对象，读取的源⽂件read.txt在项⽬根⽬录下
//        FileReader fr = new FileReader("read.txt");
//        // 定义变量，保存有效字符个数
//        int len;
//        // 定义字符数组，作为装字符数据的容器
//        char[] buf = new char[2];
//        // 循环读取
//        while ((len = fr.read(buf)) != -1) {
//            System.out.println(new String(buf, 0, len));
//        }
//        // 关闭资源
//        fr.close();
//    }

}
