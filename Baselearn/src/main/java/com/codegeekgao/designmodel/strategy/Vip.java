/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.strategy;

/**
 * Vip玩家
 *
 * @author codegeekgao
 * @version Id: Ordinary.java, v 0.1 2018/12/26 0026 16:32 codegeekgao Exp $$
 */
@PriceRegion(min = 3001, max = 10000)
public class Vip implements CalPrice {
    private Double priceRate = 0.9;

    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * priceRate;
    }
}