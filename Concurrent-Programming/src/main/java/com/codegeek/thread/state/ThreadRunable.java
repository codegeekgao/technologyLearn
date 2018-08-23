package com.codegeek.thread.state;

public class ThreadRunable extends Thread {

    @Override
    public void run() {
        System.out.println(1);
        while (!isInterrupted()) {
            System.out.println(11111);
        }
        System.out.println(1);
    }

    public static void main(String[] args) {
        ThreadRunable runable = new ThreadRunable();
        runable.start();
        //  说明：isInterrupted()是判断线程的中断标记是不是为true。当线程处于运行状态，并且我们需要终止它时；可以调用线程的interrupt()方法，使用线程的中断标记为true，即isInterrupted()会返回true。此时，就会退出while循环。
        //   注意：interrupt()并不会终止处于“运行状态”的线程！它会将线程的中断标记设为true。
        runable.interrupt();
    }
}
