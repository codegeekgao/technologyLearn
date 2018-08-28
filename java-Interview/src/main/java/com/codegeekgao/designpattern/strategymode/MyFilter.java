/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.designpattern.strategymode;

/**
 * 自定义策略模式的接口
 *
 * @author gaoxinpeng
 * @version Id: MyFilter.java, v 0.1 2018/8/28 上午9:39 gaoxinpeng Exp $$
 */
public interface MyFilter<T> {

    boolean getWant(T t);
}
