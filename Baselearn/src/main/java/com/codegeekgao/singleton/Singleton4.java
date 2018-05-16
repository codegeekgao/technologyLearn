package com.codegeekgao.singleton;

/**
 * singleton design model demo
 *
 * @author DonnieGao
 * @version Id: Singleton1.java, v 0.1 2018/5/16 下午5:00 DonnieGao Exp $$
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonHolder {
        private static Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 get() {
        return SingletonHolder.singleton4;
    }
}
