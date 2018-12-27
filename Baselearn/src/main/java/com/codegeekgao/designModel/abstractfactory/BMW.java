/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designModel.abstractfactory;

/**
 * 宝马车
 *
 * @author codegeekgao
 * @version Id: BMW.java, v 0.1 2018/12/24 0024 15:18 codegeekgao Exp $$
 */
public class BMW extends Car {
    @Override
    Parts getWheels() {
        return new Parts("BMW wheels");
    }

    @Override
    Parts getMirrors() {
        return new Parts("BMW mirrors");
    }

    @Override
    Parts getEngine() {
        return new Parts("BMW engine");
    }

    @Override
    Parts getBody() {
        return new Parts("BMW body");
    }
}