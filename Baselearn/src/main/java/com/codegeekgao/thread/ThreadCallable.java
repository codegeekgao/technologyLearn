package com.codegeekgao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * use ThreadCallable to create Thread
 *
 * @author gaoxinpeng
 * @version Id: ThreadCallable.java, v 0.1 2018/5/14 下午12:04 gaoxinpeng Exp $$
 */
public class ThreadCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        System.out.println("线程C");
        return "Thread C";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<String> futureTask = new FutureTask<String>(threadCallable);
        new Thread(futureTask).start();
        String s = futureTask.get();
        System.out.println(s);
    }
}
