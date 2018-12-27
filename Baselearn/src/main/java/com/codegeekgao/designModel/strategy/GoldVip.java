/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designModel.strategy;

/**
 * GoldVip玩家
 *
 * @author codegeekgao
 * @version Id: Ordinary.java, v 0.1 2018/12/26 0026 16:32 codegeekgao Exp $$
 */
@PriceRegion(min = 20001)
public class GoldVip implements CalPrice {

    private Double priceRate;

    @Override
    public Double calPrice(Double originPrice) {
        this.priceRate = 0.7;
        return originPrice * priceRate;
    }
}