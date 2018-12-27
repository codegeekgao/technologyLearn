/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designModel.builder;

/**
 * 建造者模式----生成器模式
 *
 * @author codegeekgao
 * @version Id: ComputerBuilder.java, v 0.1 2018/12/24 0024 16:31 codegeekgao Exp $$
 */
public abstract class ComputerBuilder {

    protected Computer computer;

    public void buildComputer() {
        computer = new Computer();
        System.out.println("build a computer");
    }

    public Computer getComputer() {
        return computer;
    }

    public abstract void buildMaster();

    public abstract void buildScreen();

    public abstract void buildKeyboard();

    public abstract void buildMouse();

    public abstract void buildAudio();
}