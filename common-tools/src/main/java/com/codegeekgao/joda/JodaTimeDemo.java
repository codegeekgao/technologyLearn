package com.codegeekgao.joda;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author codegeekgao
 * @version Id: JodaTimeDemo.java, 2019/5/13 9:05 AM codegeekgao Exp $$
 */
public class JodaTimeDemo {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        // 获取一天前的时间
        DateTime dateTime = now.minusDays(1);
        DateTime plusDays = dateTime.plusDays(1);
        System.out.println(plusDays);
        // 设定时间为2019年5月15日23点30分30秒
        DateTime time = now.withYear(2019).withMonthOfYear(5).withDayOfMonth(15)
                .withHourOfDay(23).withMinuteOfHour(30).withSecondOfMinute(30);
        System.out.println(time.dayOfYear().get());

        String formatter = "yyyy-MM-dd HH:mm:ss";
        // 当天开始时间和结束时间
        String startTime = now.withTimeAtStartOfDay().toString(formatter);
        String endTime = now.millisOfDay().withMaximumValue().toString(formatter);

        System.out.println(startTime + "|" + endTime);
        // 时间格式化
        System.out.println(DateTime.parse(startTime, DateTimeFormat.forPattern(formatter)));
        System.out.println(now.millisOfDay().withMaximumValue().toDate());
    }
}
