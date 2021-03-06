/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.adapter;

/**
 * 适配器兼容性
 * @author codegeekgao
 * @version Id: Adapter.java, v 0.1 2018/12/25 0025 16:27 codegeekgao Exp $$
 */
public class Adapter extends Banner implements Target {
    @Override
    public void request() {
        super.sayHello();
    }
}