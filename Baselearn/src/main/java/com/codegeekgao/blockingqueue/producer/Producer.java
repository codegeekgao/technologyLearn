package com.codegeekgao.blockingqueue.producer;


import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Constructing producers
 *
 * @author DonnieGao
 * @version Id: Producer.java, v 0.1 2018/5/16 下午8:53 DonnieGao Exp $$
 */
public class Producer implements Runnable {

    /**
     * define a tag default true
     */
    private volatile boolean isRunning = true;

    /**
     * construct a  BlockingQueue
     */
    private BlockingQueue queue;

    /**
     * define Atomic number
     */
    private static AtomicInteger count = new AtomicInteger();

    /**
     * default sleep time
     */
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;

    /**
     * AllArgsConstructor
     */
    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }


    public void stop() {
        this.isRunning = false;
    }

    @Override
    public void run() {
        // define String data default null
        String data = null;
        Random r = new Random();
        System.out.println("begin the producer thread");
        try {
            while (isRunning) {
                System.out.println("producing data");
                Thread.sleep(r.nextInt(Producer.DEFAULT_RANGE_FOR_SLEEP));
                data = "data:" + count.incrementAndGet();
                System.out.println("begin put data into the queue");
                // Determine whether the queue data has been filled，return boolean value
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("the queue is full cant insert the data");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("\n" +
                    "Exit the producer thread");
        }
    }
}
