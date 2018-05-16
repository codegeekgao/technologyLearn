package com.codegeekgao.thread;

/**
 * test for unsafeThread
 *
 * @author DonnieGao
 * @version Id: UnsafeThreadTest.java, v 0.1 2018/5/16 上午10:23 DonnieGao Exp $$
 */
public class UnsafeThreadTest {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            UnSafeThread count = new UnSafeThread();
            @Override
            public void run() {
                try {
                    count.count();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
