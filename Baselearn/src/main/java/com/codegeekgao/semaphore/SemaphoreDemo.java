package com.codegeekgao.semaphore;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * this is a semaphore demo
 *
 * @author DonnieGao
 * @version Id: SemaphoreDemo.java, v 0.1 2018/5/17 下午3:22 DonnieGao Exp $$
 */
public class SemaphoreDemo {

    private static final int COUNT = 10;
    private static ExecutorService executor = Executors.newFixedThreadPool(COUNT);
    private static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        for (int i = 0; i < COUNT; i++) {
            executor.execute(new SemaphoreDemo.Task());
        }
        executor.shutdown();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                //读取文件操作
                semaphore.acquire();
                System.out.println("读取文件");
                // 存数据过程
                semaphore.release();
                System.out.println("存文件");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }

        }
    }
}
