/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.prototype;

/**
 * @author codegeekgao
 * @version Id: Rectangle.java, v 0.1 2018/12/25 0025 10:32 codegeekgao Exp $$
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}