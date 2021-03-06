package com.codegeekgao.synchronize;

/**
 * consumer thread
 *
 * @author DonnieGao
 * @version Id: Consumer.java, v 0.1 2018/5/22 下午4:31 DonnieGao Exp $$
 */
public class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(200);
                clerk.sale();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
