/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.creativedesignpattern.builder;

import lombok.Setter;
import lombok.ToString;

/**
 * 电脑
 *
 * @author codegeekgao
 * @version Id: Computer.java, v 0.1 2018/12/24 0024 17:14 codegeekgao Exp $$
 */
@Setter
@ToString
public class Computer {
    // 主机
    public String master;

    public String screen;

    public String keyboard;

    public String mouse;

    public String audio;
}