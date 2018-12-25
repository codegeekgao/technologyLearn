/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.abstractfactory;

/**
 * 零部件类
 *
 * @author codegeekgao
 * @version Id: Parts.java, v 0.1 2018/12/24 0024 15:01 Administrator Exp $$
 */
public class Parts {


    private String specification;

    /**
     * 获取零部件的方法
     * @param spec
     */
    public Parts(String spec) {
        specification = spec;
    }

    public String getSpecification() {
        return specification;
    }

}