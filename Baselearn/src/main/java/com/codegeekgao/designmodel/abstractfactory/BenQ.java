/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.abstractfactory;

/**
 * 奔驰
 *
 * @author codegeekgao
 * @version Id: BenQ.java, v 0.1 2018/12/24 0024 15:15 codegeekgao Exp $$
 */
public class BenQ extends Car {

    @Override
    Parts getWheels() {
        return new Parts("BenQ Wheels ");
    }

    @Override
    Parts getMirrors() {
        return new Parts("BenQ Mirrors");
    }

    @Override
    Parts getEngine() {
        return new Parts("BenQ Engine");
    }

    @Override
    Parts getBody() {
        return new Parts("BenQ Body");
    }
}