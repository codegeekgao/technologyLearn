/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.bridge;

/**
 * 统计可以显示的次数
 *
 * @author codegeekgao
 * @version Id: CountDisplay.java, v 0.1 2018/12/26 0026 9:45 codegeekgao Exp $$
 */
public class CountDisplay extends Display {

    public CountDisplay(AbstractDisplay abstractDisplay) {
        super(abstractDisplay);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
             print();
        }
        close();
    }
}