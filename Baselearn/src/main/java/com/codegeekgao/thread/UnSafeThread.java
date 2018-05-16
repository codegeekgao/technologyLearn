package com.codegeekgao.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Unsafe thread demo
 *
 * @author DonnieGao
 * @version Id: UnSafeThread.java, v 0.1 2018/5/16 上午9:59 DonnieGao Exp $$
 */
public class UnSafeThread {

    private int num;

    public void count() throws InterruptedException {
        Thread.sleep(51);
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + num);
    }

    public static void main(String[] args) throws Exception {
        UnSafeThread unSafeThread = new UnSafeThread();
        Runnable runnable = () -> {
            try {
                unSafeThread.count();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 2; i++) {
            new Thread(runnable).start();
        }
    }
}
