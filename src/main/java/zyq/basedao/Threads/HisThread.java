package zyq.basedao.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @authoradmin
 * @date 2021/11/23 11:24
 * @description HisThread
 */
public class HisThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "执行了，将会返回100");
        return 100;
    }

    public static void main(String[] args) {
        HisThread ht = new HisThread();
        FutureTask<Integer> ft = new FutureTask<>(ht);
        Thread thread = new Thread(ft, "有返回值的线程");
        thread.start();
        try {
            Integer result = ft.get();
            System.out.println("线程的返回值:" + result);
        }catch (InterruptedException| ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}
