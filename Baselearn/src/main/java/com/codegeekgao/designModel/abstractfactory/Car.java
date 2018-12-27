/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designModel.abstractfactory;

/**
 * 抽象车
 *
 * @author codegeekgao
 * @version Id: Car.java, v 0.1 2018/12/24 0024 15:01 Administrator Exp $$
 */
public abstract class Car {

    abstract Parts getWheels();

    abstract Parts getMirrors();

    abstract Parts getEngine();

    abstract Parts getBody();
}