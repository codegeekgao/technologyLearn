package com.codegeek.function;

/**
 * @author DonnieGao
 * @version Id: FunctionTest.java, v 0.1 2018/4/27 上午12:40 DonnieGao Exp $$
 */
@FunctionalInterface
public interface FunctionTest<String> {

    /**
     * 任意方法
     *
     * @param t
     * @return string
     */
    String getWant(String t);
}
