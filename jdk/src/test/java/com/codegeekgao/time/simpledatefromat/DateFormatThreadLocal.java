package com.codegeekgao.time.simpledatefromat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * 演示线程安全的时间格式化
 *
 * @author DonnieGao
 * @version Id: DateFormatThreadLocal.java, v 0.1 2018/5/6 下午7:06 DonnieGao Exp $$
 */
public class DateFormatThreadLocal {

    public static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd");
        }
    };

    /**
     * 转化日期类
     *
     * @param source
     * @return
     * @throws ParseException
     */
    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }

    public static void main(String[] args) throws Exception {
        Callable<Date> task = () -> DateFormatThreadLocal.convert("20180506");

        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<Date> future = pool.submit(task);
        System.out.println(future.get());
        pool.shutdown();
    }
}
