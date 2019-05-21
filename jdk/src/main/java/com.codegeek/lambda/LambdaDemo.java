package com.codegeek.lambda;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Comparator;
import java.util.concurrent.*;
import java.util.function.Consumer;

/**
 * @author codegeekgao
 * @version Id: LambdaDemo.java, 2019/5/13 10:55 AM codegeekgao Exp $$
 */
public class LambdaDemo {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " >---Lambda");
            }
        };
        execute(runnable);
        Runnable r = () -> System.out.println(Thread.currentThread().getName() + " >---Lambda");
        execute(r);
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("xixi");
        Consumer<String> consumer1 = par -> System.out.println(par);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Comparator<Integer> comparator1=(x,y) -> x.compareTo(y);
    }


    public static void execute(Runnable runnable) {

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("lambda-pool-%d").build();
        ExecutorService threadPool = new ThreadPoolExecutor(5, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024));
        threadPool.execute(runnable);
        threadPool.shutdown();
    }

    public static String sayHello(String world, HelloService helloService) {
        return helloService.sayHello(world);
    }

}
