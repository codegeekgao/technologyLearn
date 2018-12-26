/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * 分离抽象接口及其实现部分。桥接模式使用“对象间的关联关系”解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。
 * 所谓抽象和实现沿着各自维度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，
 * 以便任何组合子类，从而获得多维度组合对象。在很多情况下，桥接模式可以取代多层继承方案，多层继承方案违背了“单一职责原则”，复用性较差，
 * 且类的个数非常多，桥接模式是比多层继承方案更好的解决方法，它极大减少了子类的个数。桥接模式提高了系统的可扩展性
 * 在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合“开闭原则”。
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