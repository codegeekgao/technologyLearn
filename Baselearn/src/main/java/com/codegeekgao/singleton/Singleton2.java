package com.codegeekgao.singleton;

/**
 * singleton design model demo
 *
 * @author DonnieGao
 * @version Id: Singleton1.java, v 0.1 2018/5/16 下午5:00 DonnieGao Exp $$
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 singleton;

    public static Singleton2 get() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
