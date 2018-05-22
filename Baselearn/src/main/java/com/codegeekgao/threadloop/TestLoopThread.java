package com.codegeekgao.threadloop;

import java.util.concurrent.locks.ReentrantLock;

/**
 * test loop thread
 *
 * @author gaoxinpeng
 * @version Id: TestLoopThread.java, v 0.1 2018/5/22 下午5:32 gaoxinpeng Exp $$
 */
public class TestLoopThread {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new ThreadA(reentrantLock, "123"), "线程A").start();
        new Thread(new ThreadB(reentrantLock, "123"), "线程B").start();
        new Thread(new ThreadC(reentrantLock, "123"), "线程C").start();
    }

}
