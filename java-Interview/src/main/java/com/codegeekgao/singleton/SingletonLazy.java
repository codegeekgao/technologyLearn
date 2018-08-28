package com.codegeekgao.singleton;

/**
 * lazy and safe singleton object
 *
 * @author gaoxinpeng
 * @version Id: SingletonLazy.java, v 0.1 2018/8/28 上午9:17 gaoxinpeng Exp $$
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy() {

    }

    public static SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
