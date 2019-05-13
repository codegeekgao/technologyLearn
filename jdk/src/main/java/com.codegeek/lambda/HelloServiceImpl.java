package com.codegeek.lambda;

/**
 * @author codegeekgao
 * @version Id: HelloServiceImpl.java, 2019/5/13 11:36 AM codegeekgao Exp $$
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String hello) {
        return hello;
    }
}
