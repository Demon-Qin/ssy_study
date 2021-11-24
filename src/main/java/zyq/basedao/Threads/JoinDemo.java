package zyq.basedao.Threads;

import java.util.concurrent.TimeUnit;

/**
 * @authoradmin
 * @date 2021/11/24 22:29
 * @description JoinDemo
 */
public class JoinDemo {
    private static int r;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            r = 10;
        });

        t.start();
        // 让主线程阻塞 等待t线程执行完才继续执行
        // 去除该行执行结果为0，加上该行执行结果为10
        t.join();
        System.out.println("r:" + r);
    }

//    // 方法的定义 有重载
//// 等待线程执行完才恢复运行
//    public final void join() throws InterruptedException {
//
//    }
//
//    // 指定join的时间。指定时间内 线程还未执行完 调用方线程不继续等待就恢复运行
//    public final synchronized void join(long millis) throws InterruptedException {
//    }
//
//    // 方法的定义 native方法
//    public static native void sleep(long millis) throws InterruptedException;
//
//try
//
//    {
//        // 休眠2秒
//        // 该方法会抛出 InterruptedException异常 即休眠过程中可被中断，被中断后抛出异常
//        Thread.sleep(2000);
//    } catch(
//    InterruptedException异常 e)
//
//    {
//    }
// try
//
//    {
//        // 使用TimeUnit的api可替代 Thread.sleep
//        TimeUnit.SECONDS.sleep(1);
//    } catch(
//    InterruptedException e)
//
//    {
//    }
//
//    // 方法的定义
//    public final void setDaemon(boolean on) {
//    }
//
//    Thread thread = new Thread(() -> {
//        while (true) {
//        }
//    });
//// 具体的api,设为true表示未守护线程，当主线程结束后，守护线程也结束。
//// 默认是false，当主线程结束后，thread继续运行，程序不停止
//thread.setDaemon(true);
//thread.start();
//log.info("结束");
}


