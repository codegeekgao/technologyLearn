package com.codegeekgao.volatiledemo;

/**
 * a volatile test for java
 *
 * @author DonnieGao
 * @version Id: VolatileTest.java, v 0.1 2018/5/20 下午10:25 DonnieGao Exp $$
 */
public class VolatileTest {

    /**
     * Thread verification is not safe
     *
     * @param args
     */
    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        Thread thread = new Thread(volatileDemo);
        thread.start();
        while (true) {
            // use synchronized make sure flag can be see in time
            if (volatileDemo.isFlag()) {
                System.out.println("----------");
                break;
            }
        }
    }
}
