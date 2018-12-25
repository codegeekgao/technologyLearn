/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.adapter;

/**
 * @author codegeekgao
 * @version Id: Adapter.java, v 0.1 2018/12/25 0025 16:27 codegeekgao Exp $$
 */
public class Adapter extends Banner implements Target {
    @Override
    public void request() {
        super.sayHello();
    }
}