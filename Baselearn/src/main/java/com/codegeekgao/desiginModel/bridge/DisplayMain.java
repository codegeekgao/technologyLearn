/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * @author codegeekgao
 * @version Id: DisplayMain.java, v 0.1 2018/12/26 0026 9:53 codegeekgao Exp $$
 */
public class DisplayMain {

    public static void main(String[] args) {
        Display d1 = new Display(new AbstractDisplayImpl("hello China"));
        Display d2 = new Display(new AbstractDisplayImpl("hello World"));
        CountDisplay d3 = new CountDisplay(new AbstractDisplayImpl("hello Universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}