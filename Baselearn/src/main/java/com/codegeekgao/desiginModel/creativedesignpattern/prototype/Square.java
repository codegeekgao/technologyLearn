/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.creativedesignpattern.prototype;

/**
 * @author codegeekgao
 * @version Id: Square.java, v 0.1 2018/12/25 0025 10:33 codegeekgao Exp $$
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}