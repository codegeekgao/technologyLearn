package com.codegeekgao.joda;

import org.joda.time.DateTime;

/**
 * @author codegeekgao
 * @version Id: JodaTimeDemo.java, 2019/5/13 9:05 AM codegeekgao Exp $$
 */
public class JodaTimeDemo {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        // 当前日期
        System.out.println(now.dayOfYear().get()+","+now.dayOfMonth().get()+","+now.dayOfWeek().get()+","+now.hourOfDay().get());
        DateTime dateTime = new DateTime();
        // 指定年月日，时分秒
        DateTime time = dateTime.withYear(2019).withMonthOfYear(5).withDayOfMonth(1).withHourOfDay(10).withMinuteOfHour(45).withSecondOfMinute(45);
        System.out.println(time);

    }
}
