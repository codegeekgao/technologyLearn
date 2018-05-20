package com.codegeekgao.atomic;

import java.util.concurrent.ExecutionException;


/**
 * Atomic test
 *
 * @author DonnieGao
 * @version Id: AtomicTest.java, v 0.1 2018/5/20 下午11:38 DonnieGao Exp $$
 */
public class AtomicTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicDemo atomicDemo = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(atomicDemo).start();
            // 由于修改了值，但是还是从主存拿的值=10
        }
    }
}
