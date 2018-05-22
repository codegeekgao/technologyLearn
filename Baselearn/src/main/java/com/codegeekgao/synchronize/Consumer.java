package com.codegeekgao.synchronize;

/**
 * consumer thread
 *
 * @author gaoxinpeng
 * @version Id: Consumer.java, v 0.1 2018/5/22 下午4:31 gaoxinpeng Exp $$
 */
public class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                clerk.sale();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
