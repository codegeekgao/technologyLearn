/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.template;

/**
 * @author codegeekgao
 * @version Id: Game.java, v 0.1 2018/12/25 0025 16:59 codegeekgao Exp $$
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板为防止恶意操作，一般模板方法都加上 final 关键词。
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}