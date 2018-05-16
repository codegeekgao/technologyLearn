package com.codegeekgao.blockingqueue;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * This is blockingQueue demo
 *
 * @author DonnieGao
 * @version Id: BlockingQueueDemo.java, v 0.1 2018/5/16 下午8:39 DonnieGao Exp $$
 */
public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(16);

        // 4个线程
        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        String take = bq.take();
                        parseLog(take);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int j = 0; j < 16; j++) {
            String log = UUID.randomUUID().toString().substring(0, 8);
            bq.put(log);
        }
    }

    /**
     * 构造parseLong方法
     */
    public static void parseLog(String param) {
        System.out.println(param + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
