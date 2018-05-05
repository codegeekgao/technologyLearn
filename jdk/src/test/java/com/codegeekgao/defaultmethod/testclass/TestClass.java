/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.defaultmethod.testclass;

import com.codegeekgao.defaultmethod.TestInterface;

/**
 * @author gaoxinpeng
 * @version Id: TestClass.java, v 0.1 2018/5/6 上午12:56 gaoxinpeng Exp $$
 */
public class TestClass extends FutherClass implements TestInterface {

    /**
     * 当一个类继承的父类方法与接口继承的默认方法，优先使用的是父类的方法-----类优先原则
     *
     * @param args
     */
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass.getName());
    }
}
