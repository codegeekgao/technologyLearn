package com.codegeekgao.designmodel.factory.product;


/**
 * @author codegeekgao
 * @version Id: ClientTest.java, 2019/5/19 6:53 PM codegeekgao Exp $$
 */
public class ClientTest {

    public static void main(String[] args) {

        CashFatory.createCashType(1).acceptCash(100);
    }
}
