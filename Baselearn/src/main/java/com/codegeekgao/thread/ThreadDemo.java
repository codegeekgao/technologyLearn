package com.codegeekgao.thread;

/**
 * how to create Thread
 *
 * @author DonnieGao
 * @version Id: ThreadDemo.java, v 0.1 2018/5/14 上午11:54 DonnieGao Exp $$
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("线程A");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        System.out.println("线程的名称：" + threadDemo.getName());
        System.out.println("线程的优先级：" + threadDemo.getPriority());
        System.out.println("线程的ID：" + threadDemo.getId());
        System.out.println("线程的线程组：" + threadDemo.getThreadGroup());
        System.out.println("线程是否存活：" + threadDemo.isAlive());
        System.out.println("线程是否为守护线程：" + threadDemo.isDaemon());
        System.out.println("线程状态：" + threadDemo.getState());
        System.out.println("线程组活动线程的数目：" + Thread.activeCount());
        // 停止线程的方法
        threadDemo.interrupt();
    }
}
