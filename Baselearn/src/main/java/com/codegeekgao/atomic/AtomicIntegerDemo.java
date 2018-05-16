package com.codegeekgao.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * atomicInteger demo
 *
 * @author DonnieGao
 * @version Id: AtomicIntegerDemo.java, v 0.1 2018/5/16 下午4:24 DonnieGao Exp $$
 */
public class AtomicIntegerDemo {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        System.out.println(ai.get());
        System.out.println(ai.getAndSet(5));
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.getAndDecrement());
        System.out.println(ai.getAndAdd(10));
        System.out.println(ai.get());
    }
}
