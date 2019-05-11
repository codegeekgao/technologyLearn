/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.adapter;

/**
 * @author codegeekgao
 * @version Id: AdapterMain.java, v 0.1 2018/12/25 0025 16:32 codegeekgao Exp $$
 */
public class AdapterMain {
    public static void main(String[] args) {
        TargetImpl targetImple = new TargetImpl();
        targetImple.request();
        Adapter adapter = new Adapter();
        adapter.request();
    }
}