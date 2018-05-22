package com.codegeekgao.threadloop;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gaoxinpeng
 * @version Id: ThreadC.java, v 0.1 2018/5/22 下午5:34 gaoxinpeng Exp $$
 */
public class ThreadC implements Runnable {
    private ReentrantLock reentrantLock;
    private String str;
    private boolean num;

    public ThreadC(ReentrantLock reentrantLock, String str, boolean num) {
        this.reentrantLock = reentrantLock;
        this.str = str;
        this.num = num;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " " + str);
        } finally {
            reentrantLock.unlock();
        }
    }
}
