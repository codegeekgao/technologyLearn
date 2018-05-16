package com.codegeekgao.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * simulation boss case
 *
 * @author gaoxinpeng
 * @version Id: Boss.java, v 0.1 2018/5/16 下午11:38 gaoxinpeng Exp $$
 */
public class Boss implements Runnable {

    private CountDownLatch downLatch;

    public Boss(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        System.out.println("老板正在等所有的工人干完活......");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("工人活都干完了，老板开始检查了！");
    }
}
