package com.codegeekgao.date;

import org.joda.time.DateTime;

/**
 * @author codegeekgao
 * @version Id: JodaUtil.java, 2019/4/10 6:54 PM codegeekgao Exp $$
 */
public class JodaUtil {

    public static void main(String[] args) {
        DateTime now = new DateTime().minusMonths(2);
        // 时间格式化正则
        String formatter = "yyyy-MM-dd HH:mm:ss";
        // 当天开始时间和结束时间
        String startTime = now.withTimeAtStartOfDay().toString(formatter);
        String endTime = now.millisOfDay().withMaximumValue().toString(formatter);
        String endTime1 = now.millisOfDay().withMinimumValue().toString(formatter);
        System.out.println(startTime + "  " + endTime+" "+endTime1);
        // 月中天,年中天,周中天
        System.out.println("月中天" + now.dayOfMonth().get() + " 年中天" + now.dayOfYear().get() + " 周内天" + now.dayOfWeek().get());
        DateTime yes = now.minusDays(1);
        DateTime tomorrow = now.plusDays(1);
        System.out.println(now.isEqual(now.plusDays(1)));
        System.out.println(now.withDayOfMonth(1).toString(formatter));
        System.out.println(now.withMonthOfYear(1).toString(formatter));
        // 本周一0点内到周末23点59分59秒
        String week1 = now.millisOfDay().withMinimumValue().withDayOfWeek(1).toString(formatter);
        String week2 = now.millisOfDay().withMaximumValue().withDayOfWeek(7).toString(formatter);
        String week3 = now.dayOfWeek().withMinimumValue().toString(formatter);
        String week4 = now.dayOfWeek().withMaximumValue().toString(formatter);
        String month1 = now.dayOfMonth().withMinimumValue().withTimeAtStartOfDay().toString(formatter);
        String month2 = now.dayOfMonth().withMaximumValue().millisOfDay().withMaximumValue().toString(formatter);
        System.out.println(week1+" "+week2+" "+week3+" "+week4+ " "+month1+ " "+month2);
    }
}
