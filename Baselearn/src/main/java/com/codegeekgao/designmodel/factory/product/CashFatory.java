package com.codegeekgao.designmodel.factory.product;

/**
 * 现金工厂
 *
 * @author codegeekgao
 * @version Id: CashFatory.java, 2019/5/19 6:47 PM codegeekgao Exp $$
 */
public class CashFatory {


    public static AbstractCashSuper createCashType (int type) {

        switch (type) {
            case 1: {
                System.out.println("打折的购买");
                return new CashRebate();
            }

            case 2: {
                System.out.println("返利的购买");
                return new CashReturn();
            }

            default: {
                System.out.println("正常的购买");
                return new CashNormal();
            }
        }
    }
}
