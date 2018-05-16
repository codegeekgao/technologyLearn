package com.codegeekgao.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * lock demo
 *
 * @author DonnieGao
 * @version Id: LockDemo.java, v 0.1 2018/5/16 上午11:51 DonnieGao Exp $$
 */
public class LockDemo {

    private final ReentrantLock lock = new ReentrantLock();

    public void get() {
        // 获得锁
        lock.lock();

        try {
            System.out.println(1);
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}
