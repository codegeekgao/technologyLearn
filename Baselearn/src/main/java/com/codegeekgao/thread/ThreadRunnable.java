package com.codegeekgao.thread;

import java.util.Map;

/**
 * user runnable to create Thread
 *
 * @author gaoxinpeng
 * @version Id: ThreadRunnable.java, v 0.1 2018/5/14 下午12:01 gaoxinpeng Exp $$
 */
public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("线程B");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnable());
        thread.start();
        System.out.println(thread.isAlive());
    }
}
