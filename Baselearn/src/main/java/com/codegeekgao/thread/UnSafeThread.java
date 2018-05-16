package com.codegeekgao.thread;



/**
 * Unsafe thread demo
 *
 * @author DonnieGao
 * @version Id: UnSafeThread.java, v 0.1 2018/5/16 上午9:59 DonnieGao Exp $$
 */
public class UnSafeThread {

    private int num;

    public void count() throws InterruptedException {
        Thread.sleep(51);
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + num);
    }

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> {
            UnSafeThread unSafeThread = new UnSafeThread();
            try {
                unSafeThread.count();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
