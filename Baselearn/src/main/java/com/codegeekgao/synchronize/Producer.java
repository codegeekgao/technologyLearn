package com.codegeekgao.synchronize;

/**
 * producer thread
 *
 * @author gaoxinpeng
 * @version Id: Producer.java, v 0.1 2018/5/22 下午4:30 gaoxinpeng Exp $$
 */
public class Producer implements Runnable {

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                clerk.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
