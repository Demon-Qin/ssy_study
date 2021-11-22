package zyq.basedao.io;

/**
 * @authoradmin
 * @date 2021/11/23 4:21
 * @description Employee
 */
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int age;
    /**
     * transient瞬态修饰成员,不会被序列化
     */
    public void addressCheck() {
        System.out.println("Address check : " + name + " -- " + address);
    }
}
