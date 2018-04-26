package com.codegeekgao.interfaces;


/**
 * 条件过滤器
 *
 * @author DonnieGao
 * @version Id: MyFilter.java, v 0.1 2018/4/26 上午12:30 DonnieGao Exp $$
 */
public interface MyFilter<T> {

    /**
     * 获取指定想要的employee对象
     *
     * @param t
     * @return
     */
    boolean getWant(T t);
}
