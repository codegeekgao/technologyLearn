package com.codegeekgao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * the demonstration of error Thread
 *
 * @author DonnieGao
 * @version Id: ErrorThread.java, v 0.1 2018/5/14 下午11:43 DonnieGao Exp $$
 */
public class ErrorThread implements Callable<Integer> {

    /**
     * return Integer call
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        System.out.println(1111);
        return Integer.parseInt("tttt");
    }

    public static void main(String[] args) throws Exception {
        ErrorThread errorThread = new ErrorThread();
        FutureTask<Integer> task = new FutureTask<Integer>(errorThread);
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ThreadExceptionHandler());
        thread.start();
    }
}
