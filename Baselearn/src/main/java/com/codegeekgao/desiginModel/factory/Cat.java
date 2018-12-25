/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.factory;

/**
 * 猫的实现类
 *
 * @author Administrator
 * @version Id: Cat.java, v 0.1 2018/12/24 0024 14:04 codegeekgao Exp $$
 */
public class Cat implements Pet {

    @Override
    public String petSound() {
        return "喵喵!";
    }
}