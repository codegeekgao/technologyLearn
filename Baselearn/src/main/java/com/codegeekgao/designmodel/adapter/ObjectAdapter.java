/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.adapter;

/**
 * @author codegeekgao
 * @version Id: ObjectAdapter.java, v 0.1 2018/12/25 0025 16:39 codegeekgao Exp $$
 */
public class ObjectAdapter implements Target {

    private Banner banner;

    public ObjectAdapter(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void request() {
        this.banner.sayHello();
    }
}