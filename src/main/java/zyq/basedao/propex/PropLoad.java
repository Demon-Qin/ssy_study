package zyq.basedao.propex;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @authoradmin
 * @date 2021/11/22 1:26
 * @description PropLoad
 */
public class PropLoad {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        //通过IO读取外部属性文件
        InputStream in = PropLoad.class.getResourceAsStream("database.properties");
        prop.load(in);

        //所有键存储到set
        Set<String> keySet = prop.stringPropertyNames();
        //遍历keySet，获取对应值
        for (String key: keySet) {
            System.out.println(key + ":" + prop.getProperty(key));
        }
    }
}
