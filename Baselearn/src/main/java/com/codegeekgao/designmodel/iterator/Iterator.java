/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.iterator;

/**
 * 自定义迭代器
 *
 * @author codegeekgao
 * @version Id: Iterator.java, v 0.1 2018/12/25 0025 15:20 codegeekgao Exp $$
 */
public interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();
}