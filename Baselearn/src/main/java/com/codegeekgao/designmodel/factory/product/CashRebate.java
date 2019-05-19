package com.codegeekgao.designmodel.factory.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 打折的子类
 *
 * @author codegeekgao
 * @version Id: CashRebate.java, 2019/5/19 6:37 PM codegeekgao Exp $$
 */
@AllArgsConstructor
@NoArgsConstructor
public class CashRebate extends AbstractCashSuper {

    private double moneyRebate;


    @Override
    public Double acceptCash(double money) {
        System.out.print("消费了"+money * moneyRebate);
        return money * moneyRebate;
    }
}
