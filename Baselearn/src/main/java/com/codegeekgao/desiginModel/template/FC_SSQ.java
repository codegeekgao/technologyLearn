/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.template;

/**
 * @author codegeekgao
 * @version Id: FC_SSQ.java, v 0.1 2018/12/25 0025 17:02 codegeekgao Exp $$
 */
public class FC_SSQ extends Game {
    @Override
    void initialize() {
        System.out.println("双色球投注");
    }

    @Override
    void startPlay() {
        System.out.println("双色球待开奖");
    }

    @Override
    void endPlay() {
        System.out.println("双色球开奖");
    }
}