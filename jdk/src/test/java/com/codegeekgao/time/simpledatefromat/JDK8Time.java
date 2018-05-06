package com.codegeekgao.time.simpledatefromat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author DonnieGao
 * @version Id: JDK8Time.java, v 0.1 2018/5/6 下午7:42 DonnieGao Exp $$
 */
public class JDK8Time {

    public static void main(String[] args) throws Exception {
        // 构造
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        Callable<LocalDate> task = () -> LocalDate.parse("20170520", dtf);
        ExecutorService pool = Executors.newFixedThreadPool(10);
        // pool
        Future<LocalDate> future = pool.submit(task);
        System.out.println(future.get());
        pool.shutdown();
    }
}
