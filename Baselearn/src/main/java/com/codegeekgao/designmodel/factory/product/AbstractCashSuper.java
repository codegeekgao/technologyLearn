package com.codegeekgao.designmodel.factory.product;

/**
 * 收银台
 *
 * @author codegeekgao
 * @version Id: AbstractCashSuper.java, 2019/5/19 6:33 PM codegeekgao Exp $$
 */
public abstract class AbstractCashSuper {

    /**
     * 抽象接收现金打折的方法
     * @return Double
     */
    public abstract Double acceptCash(double money);

}
