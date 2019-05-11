/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.strategy;

/**
 * 普通玩家
 *
 * @author codegeekgao
 * @version Id: Ordinary.java, v 0.1 2018/12/26 0026 16:32 codegeekgao Exp $$
 */
@PriceRegion(max = 3000)
public class Ordinary implements CalPrice {

    private Double priceRate = 1D;

    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}