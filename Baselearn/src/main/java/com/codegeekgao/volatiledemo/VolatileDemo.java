package com.codegeekgao.volatiledemo;

import lombok.Getter;
import lombok.Setter;

/**
 * a simple demo for volatile
 *
 * @author DonnieGao
 * @version Id: VolatileDemo.java, v 0.1 2018/5/20 下午10:27 DonnieGao Exp $$
 */
@Setter
@Getter
public class VolatileDemo implements Runnable {

    /**
     * define a boolean value default false
     */
    private boolean flag = false;// use volatile make sure flag can be see in time

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag=" + flag);
    }
}
