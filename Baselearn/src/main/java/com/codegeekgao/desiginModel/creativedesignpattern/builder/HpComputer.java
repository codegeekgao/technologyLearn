/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.creativedesignpattern.builder;

/**
 * 惠普
 *
 * @author codegeekgao
 * @version Id: HpComputer.java, v 0.1 2018/12/24 0024 17:28 codegeekgao Exp $$
 */
public class HpComputer extends ComputerBuilder {

    @Override
    public void buildMaster() {
        computer.setMaster("i7,32g,1TSSD,1060");
        System.out.println("(i7,32g,1TSSD,1060)的戴尔主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("4k");
        System.out.println("(4k)的dell显示屏");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("cherry 黑轴机械键盘");
        System.out.println("(cherry 黑轴机械键盘)的键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("MI 鼠标");
        System.out.println("(MI 鼠标)的鼠标");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("飞利浦 音响");
        System.out.println("(飞利浦 音响)的音响");
    }

}