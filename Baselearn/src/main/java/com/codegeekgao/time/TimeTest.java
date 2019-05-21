package com.codegeekgao.time;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * @author codegeekgao
 * @version Id: TimeTest.java, 2019/5/19 7:23 PM codegeekgao Exp $$
 */
public class TimeTest {

    public static void main(String[] args) {
        ThreadFactoryBuilder threadFactoryBuilder =  new ThreadFactoryBuilder();
        threadFactoryBuilder.setNameFormat("1").build();

    }

}


