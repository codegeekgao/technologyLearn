package com.codegeek.thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * executor demo
 *
 * @author DonnieGao
 * @version Id: ExecutorDemo.java, v 0.1 2018/8/23 22:12 DonnieGao Exp $$
 */
public class ExecutorDemo {

    public static void main(String[] args) {
        //Initialize build 10 threads
        Executor threadPool = Executors.newFixedThreadPool(10);
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1111);
            }
        });
        ((ExecutorService) threadPool).shutdown();
    }
}