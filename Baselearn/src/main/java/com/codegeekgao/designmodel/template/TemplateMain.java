/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.template;

/**
 * @author codegeekgao
 * @version Id: TemplateMain.java, v 0.1 2018/12/25 0025 17:06 codegeekgao Exp $$
 */
public class TemplateMain {
    public static void main(String[] args) {
        Game game = new FC_SSQ();
        game.play();
        game=new Jczq();
        game.play();
    }
    /**
     * Template Method优点在于父类的编辑了算法，这样子类就无需再编写算法
     */
}