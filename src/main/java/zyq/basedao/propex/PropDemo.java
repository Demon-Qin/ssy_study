package zyq.basedao.propex;

import java.util.Properties;
import java.util.Set;

/**
 * @authoradmin
 * @date 2021/11/22 1:25
 * @description PropDemo
 */
public class PropDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //存储键值对
        properties.setProperty("host","localhost");
        properties.setProperty("port","3306");
        properties.setProperty("username","root");
        properties.setProperty("password","123123");
        System.out.println(properties);
        //获取prot键值对对应的值
        String value = properties.getProperty("port");
        System.out.println(value);
        //所有存储到Set集合
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "==" + properties.getProperty(key));
        }


    }
}
