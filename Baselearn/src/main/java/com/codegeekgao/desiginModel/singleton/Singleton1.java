/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.singleton;

/**
 * @author codegeekgao
 * @version Id: Singleton1.java, v 0.1 2018/12/25 0025 9:46 codegeekgao Exp $$
 */
public class Singleton1 {

    private Singleton1() {

    }

    private static Singleton1 singleton1 = null;

    /**
     * 这种仍然是线程不安全，为啥？假设线程A进入同步代码块但是还没有完成对象的实例化，
     * 线程B进入到方法进入了if判断，虽然线程B会等待线程A，但是这种情况会造成实例化2个不同的对象
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                singleton1 = new Singleton1();
            }
        }
        return singleton1;
    }

    /**
     * 改进后的单列懒汉式
     *
     * @return
     */
    public static Singleton1 improveGetInstanve() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    /**
     * 静态内部类
     */
    private static class Singleton1static {
        private static Singleton1 Singleton1 = new Singleton1();
    }

    public static Singleton1 staticInstance() {
        return Singleton1static.Singleton1;
    }
}