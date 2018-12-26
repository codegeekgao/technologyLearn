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

    /**
     * 抽象化：其概念是将复杂物体的一个或几个特性抽出去而只注意其他特性的行动或过程。在面向对象就是将对象共同的性质抽取出去而形成类的过程。
     * 实现化：针对抽象化给出的具体实现。它和抽象化是一个互逆的过程，实现化是对抽象化事物的进一步具体化。
     * 脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联，将两个角色之间的继承关系改为关联关系。
     * 对于那句话：将抽象部分与他的实现部分分离就是实现系统可能有多个角度分类，每一种角度都可能变化，那么把这种多角度分类给分离出来让他们独立变化，减少他们之间耦合。
     *桥接模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化之间使用关联关系（组合或者聚合关系）而不是继承关系，从而使两者可以相对独立地变化，这就是桥接模式的用意。
     */
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