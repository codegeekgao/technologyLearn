package com.codegeekgao.cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * Athlete class demo for cyclicbarrier
 *
 * @author gaoxinpeng
 * @version Id: Athlete.java, v 0.1 2018/5/17 下午4:15 gaoxinpeng Exp $$
 */
public class Athlete implements Runnable {

    private CyclicBarrier cyclicBarrier;
    private String name;

    public Athlete(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "就位");
        try {
            cyclicBarrier.await();
            Random random = new Random();
            double time = random.nextDouble() + 9;
            System.out.println(name + ": " + time);
        } catch (Exception e) {
        }
    }
}
