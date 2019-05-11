/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.strategy;

/**
 * 计算价格的价格接口
 *
 * @author codegeekgao
 * @version Id: CalPrice.java, v 0.1 2018/12/26 0026 16:29 codegeekgao Exp $$
 */
public interface CalPrice {

    // 根据原价返回一个最终的价格
    Double calPrice(Double originPrice);

}