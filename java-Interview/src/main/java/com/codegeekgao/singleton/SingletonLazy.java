package com.codegeekgao.singleton;

/**
 * lazy and safe singleton object
 *
 * @author DonnieGao
 * @version Id: SingletonLazy.java, v 0.1 2018/8/28 上午9:17 DonnieGao Exp $$
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy() {

    }

    public static SingletonLazy getSingletonLazy() {
        // 一层减少获取锁的次数
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                // 没有对象就创建对象
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
