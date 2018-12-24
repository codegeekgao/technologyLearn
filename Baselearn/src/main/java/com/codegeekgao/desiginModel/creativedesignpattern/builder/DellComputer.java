/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.creativedesignpattern.builder;

/**
 * dell
 *
 * @author codegeekgao
 * @version Id: DellComputer.java, v 0.1 2018/12/24 0024 17:26 codegeekgao Exp $$
 */
public class DellComputer extends ComputerBuilder {
    @Override
    public void buildMaster() {
        computer.setMaster("i7,16g,512SSD,1060");
        System.out.println("(i7,16g,512SSD,1060)的戴尔主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("1080p");
        System.out.println("(1080p)的戴尔显示屏");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("cherry 青轴机械键盘");
        System.out.println("(cherry 青轴机械键盘)的键盘");
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