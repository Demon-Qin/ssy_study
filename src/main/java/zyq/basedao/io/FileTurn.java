package zyq.basedao.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @authoradmin
 * @date 2021/11/23 3:52
 * @description FileTurn
 */
public class FileTurn {
    public static void main(String[] args) throws IOException {
        // 定义⽂件路径
        String fileName = "C:/Users/admin/Desktop/out.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new
                FileOutputStream(fileName));
        // 写数据,保存为6个字节
        osw.write("你好");
        osw.flush();
        osw.close();
        // 定义⽂件路径
        String fileName2 = "C:/Users/admin/Desktop/out2.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new
                FileOutputStream(fileName2),"GBK");
        // 写数据,保存为4个字节
        osw2.write("你好");
        osw2.flush();
        osw2.close();
    }
}
