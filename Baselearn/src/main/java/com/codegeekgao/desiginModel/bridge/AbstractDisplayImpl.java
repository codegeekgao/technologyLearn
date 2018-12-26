/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * @author codegeekgao
 * @version Id: AbstractDisplayImpl.java, v 0.1 2018/12/26 0026 9:49 codegeekgao Exp $$
 */
public class AbstractDisplayImpl implements AbstractDisplay {

    private String description;
    private int width;

    public AbstractDisplayImpl(String description) {
        this.description = description;
        this.width = description.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + description + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}