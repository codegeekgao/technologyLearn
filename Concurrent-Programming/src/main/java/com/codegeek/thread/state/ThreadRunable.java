package com.codegeek.thread.state;

public class ThreadRunable extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": start!");
    }

    public static void main(String[] args) {
        ThreadRunable runable = new ThreadRunable();
        new Thread(runable).start();
    }
}
