package com.codegeekgao.designmodel.factory.product;

/**
 * 正常收费的现金
 *
 * @author codegeekgao
 * @version Id: CashNormal.java, 2019/5/19 6:36 PM codegeekgao Exp $$
 */

public class CashNormal extends AbstractCashSuper {

    @Override
    public Double acceptCash(double money) {
        System.out.print("消费了"+money);
        return money;
    }
}
