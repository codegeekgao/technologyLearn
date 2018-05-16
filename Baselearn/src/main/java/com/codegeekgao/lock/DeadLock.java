package com.codegeekgao.lock;

/**
 * this is a DeadLock demo
 *
 * @author DonnieGao
 * @version Id: DeadLock.java, v 0.1 2018/5/16 下午3:37 DonnieGao Exp $$
 */
public class DeadLock {

    private String str1 = "碗";
    private String str2 = "筷子";

    public void eat() {

        synchronized (str1) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",锁住" + str1 + "等待获取获取" + str2);
            synchronized (str2) {
                System.out.println(Thread.currentThread().getName() + "已经获取获取" + str2);
            }
        }
    }

    public void get() {

        synchronized (str2) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",锁住" + str2 + "等待获取获取" + str1);
            synchronized (str1) {
                System.out.println(Thread.currentThread().getName() + "已经获取" + str1);
            }
        }
    }

    public static void main(String[] args) {
        // 构造两个线程，一个调用eat，一个调用get
        DeadLock deadLock = new DeadLock();
        ThreadB taskB = new ThreadB(deadLock);
        taskB.setName("线程B");
        taskB.start();
        ThreadA taskA = new ThreadA(deadLock);
        taskA.setName("线程A");
        taskA.start();
    }
}
