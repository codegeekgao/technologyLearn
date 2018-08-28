package com.codegeekgao.singleton;

/**
 * hungry model for singleton
 *
 * @author DonnieGao
 * @version Id: SingletonHungry.java, v 0.1 2018/8/27 12:50 DonnieGao Exp $$
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry = null;

    /**
     * 私有构造方法
     */
    private SingletonHungry() {
    }

    /**
     * 饱汉式 饱汉模式的核心就是懒加载。好处是更启动速度快、节省资源，一直到实例被第一次访问，才需要初始化单例
     *
     * @return SingletonHungry
     */
    public SingletonHungry getSingletonFull() {
        if (singletonHungry == null) {
            singletonHungry = new SingletonHungry();
        }
        return singletonHungry;
    }
}