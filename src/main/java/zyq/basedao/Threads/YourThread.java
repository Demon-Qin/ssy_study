package zyq.basedao.Threads;

/**
 * @authoradmin
 * @date 2021/11/23 10:45
 * @description YourThread
 */
public class YourThread implements Runnable{
    public final String threadName;

    public YourThread(String threadName) {
        this.threadName = threadName;
        System.out.println("creating:" + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Thread:"+threadName+","+i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread:"+threadName+"exited");
    }

    public static void main(String[] args){
        YourThread yt = new YourThread("hello");
        Thread thread1 = new Thread(yt);
        Thread thread2 = new Thread(yt);
        Thread thread3 = new Thread(yt);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
