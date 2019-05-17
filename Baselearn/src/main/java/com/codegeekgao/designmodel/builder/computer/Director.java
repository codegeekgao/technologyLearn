/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.builder.computer;

/**
 * 指导者
 *
 * @author codegeekgao
 * @version Id: Director.java, v 0.1 2018/12/24 0024 17:34 codegeekgao Exp $$
 */
public class Director {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer() {
        computerBuilder.buildComputer();
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildAudio();
    }

    /**
     * 生成器模式包含了一个对象构建序列，会一步步创建生成对象的组件，直到最后一步返回所有对象
     * @param args
     */
    public static void main(String[] args) {
        // 指导者
        Director director = new Director();
        ComputerBuilder computerBuilder = new DellComputer();
        director.setComputerBuilder(computerBuilder);
        director.constructComputer();
        Computer pc = director.getComputer();
        System.out.println(pc);
    }
}