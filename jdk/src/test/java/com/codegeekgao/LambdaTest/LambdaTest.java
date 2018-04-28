package com.codegeekgao.LambdaTest;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author gaoxinpeng
 * @version Id: LambdaTest.java, v 0.1 2018/4/26 下午11:02 gaoxinpeng Exp $$
 */

public class LambdaTest {

    /**
     * 传统匿名内部类 jdk8以前
     */
    @Test
    public void testRunnable() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(1111);
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println(111);
    }

    /**
     * Lambda无参且无返回值
     */
    @Test
    public void testLambdaRunnable() {
        int num = 0; //默认被final修饰
        //Runnable runnable = () -> System.out.println(111 +num++); num++报错
        // runnable.run();
        // 语法格式一
        // () -> System.out.println(111 +num++);
    }

    /**
     * Lambda有参且无返回值
     */
    @Test
    public void testLambdaReturnNO() {
        // 接口的实现 语法格式二一个参数：
        // （x）System.out.println(1x;
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("老高来学Lambda");
        // 当一个参数，小括号可以默认不写
        Consumer<Integer> con = y -> System.out.println(++y);
        con.accept(1);
        con.accept(3);
    }

    /**
     *
     * Lambda有参多个执行语句
     */
    @Test
    public void testLambdaReturnYes() {
        Comparator<Integer> IntegerComparator = (x, y) -> {
            System.out.println("Lambda有参多个执行语句");
            return Integer.compare(x, y);
        };

        // 当只有1个执行语句可以省略大括号和return(类型推断为Long)
        Comparator<Long> LongComparator = (x, y) -> Long.compare(x, y);

        List<Long> list = Arrays.asList(1L, 24L, 8L, 4L, 5L);
        Collections.sort(list, LongComparator);
        list.forEach(System.out::println);
    }

    @Test
    public void test() {
        show(new HashMap<>());// jdk8不报错（上下文推断）jdk7编译无法通过
    }

    /**
     * 构造一个方法
     */
    public boolean show(Map<String, Integer> map) {
        return map.entrySet().iterator().hasNext();
    }
}
