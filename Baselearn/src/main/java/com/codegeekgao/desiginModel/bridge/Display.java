/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * 显示类
 *
 * @author codegeekgao
 * @version Id: Display.java, v 0.1 2018/12/26 0026 9:39 codegeekgao Exp $$
 */
public class Display {

    private AbstractDisplay abstractDisplay;

    public Display(AbstractDisplay abstractDisplay) {
        this.abstractDisplay = abstractDisplay;
    }

    /**
     * 委托AbstractDisplay.open
     */
    public void open() {
        abstractDisplay.rawOpen();
    }

    /**
     * 委托AbstractDisplay.print
     */
    public void print() {
        abstractDisplay.rawPrint();
    }

    /**
     * 委托AbstractDisplay.rawClose
     */
    public void close() {
        abstractDisplay.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}