package com.codegeekgao.designmodel.factory.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author codegeekgao
 * @version Id: CashReturn.java, 2019/5/19 6:44 PM codegeekgao Exp $$
 */
@AllArgsConstructor
@NoArgsConstructor
public class CashReturn extends AbstractCashSuper {

    private double moneyCondition;

    private double moneyReturn;

    @Override
    public Double acceptCash(double money) {
        // 支出的钱达到返现钱
        if (money >= moneyCondition) {
            double returnMoney = money - Math.floor(money / moneyCondition) * moneyReturn;
            System.out.println("消费了" + returnMoney);
            return returnMoney;
        }
        return money;
    }
}
