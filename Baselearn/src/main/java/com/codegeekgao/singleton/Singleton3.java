package com.codegeekgao.singleton;

/**
 * singleton design model demo
 *
 * @author DonnieGao
 * @version Id: Singleton1.java, v 0.1 2018/5/16 下午5:00 DonnieGao Exp $$
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 singleton;

    public static Singleton3 get() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
