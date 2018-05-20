package com.codegeekgao.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * atomicDemo
 *
 * @author DonnieGao
 * @version Id: AtomicDemo.java, v 0.1 2018/5/20 下午11:29 DonnieGao Exp $$
 */
public class AtomicDemo implements Runnable {

    private AtomicInteger num = new AtomicInteger();

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getNum());
    }

    public int getNum() {
        return num.getAndIncrement();
    }
}
