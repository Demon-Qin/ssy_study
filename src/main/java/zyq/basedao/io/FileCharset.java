package zyq.basedao.io;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @authoradmin
 * @date 2021/11/23 3:48
 * @description FileTurn
 */
public class FileCharset {
    public static void main(String[] args)throws Exception{
        byte[] bytes = "你".getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes(StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes(StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(bytes));
    }

}
