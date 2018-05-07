package com.codegeekgao;

/**
 * @author DonnieGao
 * @version Id: ThreadApi.java, v 0.1 2018/5/7 下午2:57 DonnieGao Exp $$
 */
public class ThreadApi {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        // 获取当前线程名
        System.out.println("当前线程名" + thread.getName());
        // 获取线程优先级别
        System.out.println("当前线程级别" + thread.getPriority());
        // 获取线程是否运行中
        System.out.println(thread.isAlive());
    }
}
