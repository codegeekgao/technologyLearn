package com.codegeekgao.thread;


/**
 * Unsafe thread demo
 *
 * @author DonnieGao
 * @version Id: UnSafeThread.java, v 0.1 2018/5/16 上午9:59 DonnieGao Exp $$
 */
public class UnSafeThread {

    private int num;

    public void count() {
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName() + "-" + num);
    }
}
