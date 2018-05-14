/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.thread;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Demonstration of a local thread
 *
 * @author gaoxinpeng
 * @version Id: ThreadLocalDemo.java, v 0.1 2018/5/14 下午8:15 gaoxinpeng Exp $$
 */
public class ThreadLocalDemo {

    public static final ThreadLocal<Integer> df = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static int getnext() {
        return df.get();
    }

    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> ThreadLocalDemo.getnext();
        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<Integer> future = pool.submit(task);
        System.out.println(future.get());
        pool.shutdown();
    }

}
