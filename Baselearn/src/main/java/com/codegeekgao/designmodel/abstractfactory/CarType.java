/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.abstractfactory;

/**
 * 抽象工厂相当于工厂方法模式的抽象层次更高,抽象工厂返回的是一组类的工厂,与工厂方法模式类似(返回多个子类的一个)
 * 此方法会返回一个工厂(与工厂方法模式不同，抽象工厂模式会返回一个工厂,此工厂会返回多个子类),
 *
 * @author codegeekgao
 * @version Id: CarType.java, v 0.1 2018/12/24 0024 14:48 codegeekgao Exp $$
 */
public class CarType {

    private Car car;

    public static void main(String[] args) {
        CarType carType = new CarType();
        // 这里通过不同的参数创建不同的工厂，对客户端是解耦的
        Car benQ = carType.getCar("BenQ");
        System.out.println("wheels:" + benQ.getWheels().getSpecification() +
                " Mirrors:" + benQ.getMirrors().getSpecification() + " Engine:"
                + benQ.getEngine().getSpecification()+"body:"+benQ.getBody().getSpecification());
    }

    public Car getCar(String carType) {
        if ("BenQ".equals(carType)) {
            car = new BenQ();
        } else if ("BMW".equals(carType))
            car = new BMW();
        return car;
    }

}