package com.codegeekgao.defaultmethod;

/**
 * 测试接口默认方法
 *
 * @author DonnieGao
 * @version Id: TestInterface.java, v 0.1 2018/5/6 上午12:53 DonnieGao Exp $$
 */
public interface TestInterface {

    /**
     * 测试方法
     *
     * @return
     */
    default String getName() {
        return "hello,TestInterface";
    }
}
