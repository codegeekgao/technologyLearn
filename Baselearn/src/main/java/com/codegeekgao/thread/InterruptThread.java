package com.codegeekgao.thread;

import java.time.Duration;
import java.time.Instant;

/**
 * 中断线程演示
 *
 * @author DonnieGao
 * @version Id: InterruptThread.java, v 0.1 2018/5/14 下午2:39 DonnieGao Exp $$
 */
public class InterruptThread implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptThread(), "InterruptThread");
        System.out.println("InterruptThread start");
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(3000L);
        thread.interrupt();
        System.out.println("InterruptThread interrupted");
        //thread.interrupt();
        System.out.println("thread状态" + thread.isInterrupted());
    }

    @Override
    public void run() {
        boolean flag = false;
        while (!flag) {
            System.out.println("InterruptThread is running");
        }
        Instant now = Instant.now();
        while (Duration.between(now, Instant.now()).toMillis() < 1000L) {

        }
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("i am stop");
        }
        System.out.println("under stop");
    }
}
