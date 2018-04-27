/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.constructorreference;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 构造器引用测试
 *
 * @author gaoxinpeng
 * @version Id: ConstructorReferenceTest.java, v 0.1 2018/4/27 下午11:24 gaoxinpeng Exp $$
 */
public class ConstructorReferenceTest {

    @Test
    public void testConsumer() {
        Consumer<String> consumer1 = (x) -> System.out.println();

        // 构造器引用要求：当前函数式接口的参数列表与返回值要与调用方法的返回值一致
        Consumer<String> consumer2 = System.out::println;
    }
}
