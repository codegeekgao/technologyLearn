/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.singleton;

/**
 * static class
 *
 * @author DonnieGao
 * @version Id: SingletonStatic.java, v 0.1 2018/8/28 上午9:23 DonnieGao Exp $$
 */
public class SingletonStatic {

    private SingletonStatic() {

    }

    /**
     * 类对象只会被初始化一次,所以能保证初始化一次对象
     */
    private static class SingletonStaticHolder {
        private static SingletonStatic singletonStatic = new SingletonStatic();
    }

    public static SingletonStatic getSingletonStatic() {
        return SingletonStaticHolder.singletonStatic;
    }
}
