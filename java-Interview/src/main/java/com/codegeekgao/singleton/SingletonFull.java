package com.codegeekgao.singleton;

/**
 * full model for singleton
 *
 * @author DonnieGao
 * @version Id: SingletonFull.java, v 0.1 2018/8/27 12:50 DonnieGao Exp $$
 */
public class SingletonFull {

    private static SingletonFull singletonFull = null;

    /**
     * 私有构造方法
     */
    private SingletonFull() {
    }

    /**
     * 饱汉式 饱汉模式的核心就是懒加载。好处是更启动速度快、节省资源，一直到实例被第一次访问，才需要初始化单例
     *
     * @return SingletonFull
     */
    public SingletonFull getSingletonFull() {
        if (singletonFull == null) {
            singletonFull = new SingletonFull();
        }
        return singletonFull;
    }
}