package zyq.basedao.Threads;

/**
 * @authoradmin
 * @date 2021/11/23 11:56
 * @description ThreadStateNewExample
 */
public class ThreadStateNewExample {
    private static final Object WAITER = new Object();

    public static void main(String[] args) {
        Runnable waiting = () -> {
            try {
                WAITER.wait();;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread whoWillWait = new Thread(waiting);
        System.out.println(whoWillWait.getState());
    }
}
