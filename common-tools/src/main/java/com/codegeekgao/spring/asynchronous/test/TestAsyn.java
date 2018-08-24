package com.codegeekgao.spring.asynchronous.test;

import com.codegeekgao.spring.asynchronous.config.AsynchronousConfig;
import com.codegeekgao.spring.asynchronous.service.AsynchronousService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DonnieGao
 * @version Id: TestAsyn.java, v 0.1 2018/8/23 22:47 DonnieGao Exp $$
 */
public class TestAsyn {

    public static void main(String[] args) {
        // Initialize spring annotationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsynchronousConfig.class);
        AsynchronousService service = context.getBean(AsynchronousService.class);
        service.asynMethod1();
        service.asynMethod2();
    }
}