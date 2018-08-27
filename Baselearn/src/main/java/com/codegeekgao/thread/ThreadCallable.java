package com.codegeekgao.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * use ThreadCallable to create Thread
 *
 * @author DonnieGao
 * @version Id: ThreadCallable.java, v 0.1 2018/5/14 下午12:04 DonnieGao Exp $$
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
        // 只有当运算完成的时候结果才能取回，如果运算尚未完成get方法将会阻塞
        FutureTask<String> futureTask = new FutureTask<String>(threadCallable);
        new Thread(futureTask).start();
        String s = futureTask.get();
        System.out.println(s);
    }
}
