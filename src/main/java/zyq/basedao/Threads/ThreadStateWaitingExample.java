package zyq.basedao.Threads;

/**
 * @authoradmin
 * @date 2021/11/23 14:04
 * @description ThreadStateWaitingExample
 */
public class ThreadStateWaitingExample {
    private static final Object LOCKER = new Object();

    public static void main(String[] args) {
        Runnable waiting = () -> {
            System.out.println("whoWillWait 开始等待 whoWillNotify");
            waiting();
            System.out.println("whoWillWait 等到了 whoWillNotify 的通知");
        };
        // 创建了一个线程调用waiter.wait()方法，让whoWillWait线程进入waiting状态
        Thread whoWillWait = new Thread(waiting);
        whoWillWait.start();
        // 主线程先休眠1秒，让whoWillWait先执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("whoWillWait当前的线程状态=" + whoWillWait.getState().toString());

        Runnable notify = () -> {
            System.out.println("whoWillNotify 准备通知 whoWillWait");
            notifying();
        };
        // 创建一个线程调用waiter.notify()方法，唤醒whoWillWait
        Thread whoWillNotify = new Thread(notify);
        whoWillNotify.start();
        // 让主线程先休眠2秒，让whoWillNotify先执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("唤醒后，whoWillWait当前的线程状态=" + whoWillWait.getState());
        System.exit(1);
    }

    private static void waiting() {
        synchronized (LOCKER) {
            try {
                LOCKER.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void notifying() {
        synchronized (LOCKER) {
            LOCKER.notify();
            System.out.println("whoWillNotify 已经通知，即将离开同步代码块");
        }
    }
}
