package zyq.basedao.Threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @authoradmin
 * @date 2021/11/23 11:04
 * @description MyThread
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Running" + Thread.currentThread().getName());
        try{
            for (int i=0; i<10; i++) {
                System.out.println(df.format(new Date()));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread" + Thread.currentThread().getName()+ "exited");
    }
    public static void main(String[] args){
        new MyThread().start();
        System.out.println("Running"+ Thread.currentThread().getName());
    }
}
