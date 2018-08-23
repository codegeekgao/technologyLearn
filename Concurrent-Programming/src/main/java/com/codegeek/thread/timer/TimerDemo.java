package com.codegeek.thread.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * timer demo
 *
 * @author DonnieGao
 * @version Id: TimerDemo.java, v 0.1 2018/8/23 22:02 DonnieGao Exp $$
 */
public class TimerDemo {

    public static void main(String[] args) {
        // 构造timer
        Timer timer = new Timer("myTimer");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务开始");
            }
        }, 0, 2000);
    }
}