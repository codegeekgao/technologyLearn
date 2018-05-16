package com.codegeekgao.singleton;

/**
 * singleton design model demo
 *
 * @author DonnieGao
 * @version Id: Singleton1.java, v 0.1 2018/5/16 下午5:00 DonnieGao Exp $$
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 singleton = new Singleton1();

    public static Singleton1 get() {
        return singleton;
    }
}
