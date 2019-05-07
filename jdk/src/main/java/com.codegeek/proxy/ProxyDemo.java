package com.codegeek.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author codegeekgao
 * @version Id: ProxyDemo.java, 2019/5/7 1:41 PM codegeekgao Exp $$
 */

public class ProxyDemo implements InvocationHandler {

    private Object target;

    public ProxyDemo(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理接口之前要做的事");
        // 开始执行方法
        Object invoke = method.invoke(target, args);
        System.out.println("执行后要做的事");
        return invoke;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        BuyLottery buyLottery = new ProxyDemo(new BuyLotteryImpl()).getProxy();
        buyLottery.buyIsOK("TC_JCLQ");
    }
}
