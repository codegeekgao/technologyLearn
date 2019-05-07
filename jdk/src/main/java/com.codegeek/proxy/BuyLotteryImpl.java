package com.codegeek.proxy;

/**
 * @author codegeekgao
 * @version Id: BuyLotteryImpl.java, 2019/5/7 1:37 PM codegeekgao Exp $$
 */
public class BuyLotteryImpl implements BuyLottery {
    @Override
    public boolean buyIsOK(String lottery) {
        System.out.println("购买彩种" + lottery);
        return false;
    }
}
