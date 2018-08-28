/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.singleton;

/**
 * full model for singleton
 *
 * @author gaoxinpeng
 * @version Id: SingletonFull.java, v 0.1 2018/8/28 上午9:14 gaoxinpeng Exp $$
 */
public class SingletonFull {

    /**
     * initialize the singleton object
     */
    private static SingletonFull singletonFull = new SingletonFull();

    /**
     * private the constructor
     */
    private SingletonFull() {
    }

    /**
     * get the singleton
     *
     * @return
     */
    public static SingletonFull getSingletonFull() {
        return singletonFull;
    }
}
