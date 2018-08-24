package com.codegeekgao.spring.asynchronous.service;

import org.springframework.scheduling.annotation.Async;

/**
 * /**
 * asynchronous config class
 *
 * @author DonnieGao
 * @version Id: AsynchronousService.java, v 0.1 2018/8/23 22:33 DonnieGao Exp $$
 */
public interface AsynchronousService {

    /**
     * 异步方法1
     */
    @Async
    void asynMethod1();

    /**
     * 异步方法2
     */
    @Async
    void asynMethod2();
}
