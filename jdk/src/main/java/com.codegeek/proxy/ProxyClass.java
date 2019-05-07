package com.codegeek.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author codegeekgao
 * @version Id: ProxyClass.java, 2019/5/7 1:52 PM codegeekgao Exp $$
 */
@NoArgsConstructor
@AllArgsConstructor
public class ProxyClass implements InvocationHandler {

    // 代理对象
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---代理方法执行之前准备工作");
        // 这里可以对方法的参数进行拦截校验等一系列操作
        Object invoke = method.invoke(target, args);
        System.out.println("---代理方法执行之后收尾工作");
        return invoke;
    }

    /**
     * 代理动态类
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        BuyLottery proxy = new ProxyClass(new BuyLotteryImpl()).getProxy();
        proxy.buyIsOK("TC_JCLQ");
    }
}
