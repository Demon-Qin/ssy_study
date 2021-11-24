package zyq.basedao.Threads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

/**
 * @authoradmin
 * @date 2021/11/24 22:49
 * @description ConsumerAndCustomer
 */
public class ConsumerAndCustomer {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue queue = new MessageQueue(2);
        // 三个生产者向队列里存值
        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(() -> {
                queue.put(new Message(id, "值" + id));
            }, "生产者" + i).start();
        }

        Thread.sleep(1000);

        // 一个消费者不停地从队列里取值
        new Thread(() -> {
            while (true) {
                queue.take();
            }
        }, "消费者").start();

    }
}


