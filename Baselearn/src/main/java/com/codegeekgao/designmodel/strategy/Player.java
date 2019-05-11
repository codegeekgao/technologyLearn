/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.designmodel.strategy;

/**
 * 玩家
 *
 * @author codegeekgao
 * @version Id: Player.java, v 0.1 2018/12/26 0026 16:56 codegeekgao Exp $$
 */
public class Player {

    private Double totalAmount = 0D;
    private Double amount = 0D;
    private CalPrice calPrice = new Ordinary();

    //计算客户最终要付的钱
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }  //客户购买皮肤，就会增加它的总额

    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        /* 变化点，我们将策略的制定转移给了策略工厂，将这部分责任分离出去 */
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }


}