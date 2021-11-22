package zyq.basedao.context;

/**
 * @authoradmin
 * @date 2021/11/20 11:05
 * @description DateContext
 */
public class DataContext implements AutoCloseable {
    public static final ThreadLocal<Object> CTX = new ThreadLocal<>();

    public static void setData(Object data) {
        CTX.set(data);
    }

    public static Object getData() {
        return CTX.get();
    }

    @Override
    public void close() {
        CTX.remove();
    }
}