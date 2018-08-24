package com.codegeekgao.spring.asynchronous.service.impl;

import com.codegeekgao.spring.asynchronous.service.AsynchronousService;
import org.springframework.stereotype.Service;

/**
 * Interface implementation class
 *
 * @author DonnieGao
 * @version Id: AsynchronousServiceImpl.java, v 0.1 2018/8/23 22:42 DonnieGao Exp $$
 */
@Service("asynchronousService")
public class AsynchronousServiceImpl implements AsynchronousService {

    /**
     * 异步方法1
     */
    @Override
    public void asynMethod1() {

        try {
            System.out.println("method 1");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 异步方法2
     */
    @Override
    public void asynMethod2() {

        try {
            System.out.println("method 2");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}