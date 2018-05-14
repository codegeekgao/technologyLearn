package com.codegeekgao.thread;

/**
 * 中断线程演示
 *
 * @author gaoxinpeng
 * @version Id: InterruptThread.java, v 0.1 2018/5/14 下午2:39 gaoxinpeng Exp $$
 */
public class InterruptThread implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptThread(), "InterruptThread");
        System.out.println("InterruptThread start");
        thread.start();
        Thread.sleep(3000L);
        System.out.println("InterruptThread interrupted");
        thread.interrupt();
        System.out.println("thread状态" + thread.isInterrupted());
    }

    @Override
    public void run() {
        boolean flag = false;
        while (!flag) {
            System.out.println("InterruptThread is running");
        }
        System.out.println("under stop");
    }
}
