package com.codegeekgao.blockingqueue.consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * constructing consumer
 *
 * @author DonnieGao
 * @version Id: Consumer.java, v 0.1 2018/5/16 下午9:09 DonnieGao Exp $$
 */
public class Consumer implements Runnable {

    /**
     * construct a  BlockingQueue
     */
    private BlockingQueue<String> queue;

    /**
     * default sleep time
     */
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;

    /**
     * AllArgsConstructor
     */
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("begin the consumer thread");
        Random random = new Random();
        boolean isRunning = true;
        try {
            while (isRunning) {
                System.out.println("take data from the queue");
                String data = queue.poll(2, TimeUnit.SECONDS);
                if (null != data) {
                    System.out.println("get data：" + data);
                    System.out.println("consumer the data：" + data);
                    Thread.sleep(random.nextInt(DEFAULT_RANGE_FOR_SLEEP));
                } else {
                    //There is no data for more than 2s
                    // It is considered that all production threads have exited
                    // and the consumer thread is automatically exited.
                    isRunning = false;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("exit the consumer thread！");
        }
    }
}
