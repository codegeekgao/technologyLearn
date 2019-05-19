package com.codegeekgao.designmodel.factory.product;

import java.math.BigDecimal;

/**
 * @author codegeekgao
 * @version Id: SoldProduct.java, 2019/5/19 5:43 PM codegeekgao Exp $$
 */
public class SoldProduct {

    private void soldProduct(int amount, BigDecimal price, String disCountType) {

        BigDecimal soldPrice = price.multiply(BigDecimal.valueOf(amount));
        switch (disCountType) {
            case "1": {
                System.out.println("8折销售价格" + soldPrice.multiply(BigDecimal.valueOf(0.8)));
                break;

            }

            case "2": {
                System.out.println("7折销售价格" + soldPrice.multiply(BigDecimal.valueOf(0.7)));
                break;
            }

            default: {
                System.out.println("正常销售价格："+soldPrice);
            }
        }
    }

    /**
     * 这里有个局限性，就是如果其他活动，每次都需要在soldProduct方法里面switch语句增加一个新的销售逻辑代码
     * 而且判断条件在客户端
     * @param args
     */
    public static void main(String[] args) {
        SoldProduct soldProduct = new SoldProduct();
        soldProduct.soldProduct(5,BigDecimal.valueOf(19.9),"1");
    }
}
