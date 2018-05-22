package com.codegeekgao.synchronize;

/**
 * clerk sale product demo
 *
 * @author DonnieGao
 * @version Id: Clerk.java, v 0.1 2018/5/22 下午4:26 DonnieGao Exp $$
 */
public class Clerk {

    private int product = 0;

    // 进货
    public synchronized void get() throws InterruptedException {
        while (product >= 1) {
            System.out.println("货满");
            this.wait();
        }
            System.out.println(Thread.currentThread().getName() + " : " + ++product);
            this.notifyAll();
    }

    public synchronized void sale() throws InterruptedException {
        while (product <= 0) { // use loop avoid spurious wake up
            System.out.println("缺货");
            this.wait();
        }
            System.out.println(Thread.currentThread().getName() + " : " + --product);
            this.notifyAll();
    }
}
