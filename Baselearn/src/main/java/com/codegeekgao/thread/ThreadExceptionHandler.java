package com.codegeekgao.thread;

/**
 * Handling unchecked thread exceptions
 *
 * @author DonnieGao
 * @version Id: ThreadExceptionHandler.java, v 0.1 2018/5/14 下午11:31 DonnieGao Exp $$
 */
public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {

    /**
     * print thread information
     *
     * @param t the thread
     * @param e the exception
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("an exception has been captured\n");
        System.out.printf("Thread: %s\n", t.getId());
        System.out.printf("Exception: %s: %s\n", e.getClass().getName(), e.getMessage());
        System.out.printf("Stack trace: \n");
        e.printStackTrace(System.out);
        System.out.printf("Thread status: %s\n", t.getState());
    }
}
