package com.codegeekgao.threadloop;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gaoxinpeng
 * @version Id: ThreadB.java, v 0.1 2018/5/22 下午5:33 gaoxinpeng Exp $$
 */
public class ThreadB implements Runnable {
    private ReentrantLock reentrantLock;
    private String str;
    private boolean num;

    public ThreadB(ReentrantLock reentrantLock, String str, boolean num) {
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
