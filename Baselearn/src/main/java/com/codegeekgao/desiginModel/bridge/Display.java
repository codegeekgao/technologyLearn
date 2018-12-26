/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * 在软件开发中如果一个类或一个系统有多个变化维度时，都可以尝试使用桥接模式对其进行设计。桥接模式为多维度变化的系统提供了一套完整的解决方案，并且降低了系统的复杂度。
 *
 * @author codegeekgao
 * @version Id: Display.java, v 0.1 2018/12/26 0026 9:39 codegeekgao Exp $$
 */
public  class Display {

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