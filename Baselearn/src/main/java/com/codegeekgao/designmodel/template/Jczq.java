/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.template;

/**
 * @author codegeekgao
 * @version Id: Jczq.java, v 0.1 2018/12/25 0025 17:01 codegeekgao Exp $$
 */
public class Jczq extends Game {
    @Override
    void initialize() {
        System.out.println("jczq 开始投注");
    }

    @Override
    void startPlay() {
        System.out.println("jczq 待开奖");
    }

    @Override
    void endPlay() {
        System.out.println("jczq 开奖");
    }
}