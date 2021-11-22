package zyq.basedao.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @authoradmin
 * @date 2021/11/23 4:12
 * @description FileText
 */
public class FileText {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/admin/Desktop/out.txt";
        //1.创建ArrayList集合,泛型使⽤String
        ArrayList<String> list = new ArrayList<>();
        //2.创建BufferedReader对象,构造⽅法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        //3.创建BufferedWriter对象,构造⽅法中传递FileWriter对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        //4.使⽤BufferedReader对象中的⽅法readLine,以⾏的⽅式读取⽂本
        String line = null;
        while ((line = br.readLine()) != null) {
            //5.把读取到的⽂本存储到ArrayList集合中
            list.add(line);
        }
        //6.使⽤Collections集合⼯具类中的⽅法sort,对集合中的元素按照⾃定义规则排序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //依次⽐较集合中两个元素的⾸字⺟,升序排序
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        //7.遍历ArrayList集合,获取每⼀个元素
        for (String s : list) {
            //8.使⽤BufferedWriter对象中的⽅法write,把遍历得到的元素写⼊到⽂本中(内存缓冲区中)
            bw.write(s);
            //9.写换⾏
            bw.newLine();
            bw.flush();
        }
        //10.释放资源
        bw.close();
        br.close();
    }

}
