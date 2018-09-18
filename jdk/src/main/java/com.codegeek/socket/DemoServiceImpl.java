package com.codegeek.socket;

/**
 * @author CodeGeekGao
 * @version Id: DemoServiceImpl.java, v 0.1 2018/9/18 9:51 CodeGeekGao Exp $$
 */
public class DemoServiceImpl implements DemoService {
    /**
     * 说话的方法
     *
     * @param hello
     * @return
     */
    @Override
    public String sayHello(String hello) {
        return  "hello".equals(hello)?hello:"bye!";
    }
}
