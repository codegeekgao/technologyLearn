package com.codegeekgao.blockingqueue;

import com.codegeekgao.blockingqueue.consumer.Consumer;
import com.codegeekgao.blockingqueue.producer.Producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * just test consumer and producer queue
 *
 * @author gaoxinpeng
 * @version Id: BlockingQueueTest.java, v 0.1 2018/5/16 下午9:17 gaoxinpeng Exp $$
 */
public class BlockingQueueTest {

    public static void main(String[] args) throws Exception {
        // 声明一个容量为10的缓存队列
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();
        // 启动线程
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer);

        // 执行10s
        Thread.sleep(10 * 1000);
        producer1.stop();
        producer2.stop();
        producer3.stop();

        Thread.sleep(2000);
        // 退出Executor
        service.shutdown();

    }
}
