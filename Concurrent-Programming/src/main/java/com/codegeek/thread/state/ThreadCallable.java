package com.codegeek.thread.state;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * use callable method run thread
 *
 * @author :DonnieGao
 * @version ：2018/8/22 22:59
 */
public class ThreadCallable implements Callable<String> {

    /**
     * 实现callable的方法
     *
     * @return String
     * @throws Exception Exception
     */
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) throws Exception {
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<String> futureTask = new FutureTask<>(threadCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}