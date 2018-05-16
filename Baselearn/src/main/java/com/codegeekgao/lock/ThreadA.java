/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.lock;

/**
 * @author gaoxinpeng
 * @version Id: ThreadB.java, v 0.1 2018/5/16 下午4:03 gaoxinpeng Exp $$
 */
public class ThreadA extends Thread {

    private DeadLock deadLock;

    public ThreadA(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    @Override
    public void run() {
        deadLock.get();
    }
}
