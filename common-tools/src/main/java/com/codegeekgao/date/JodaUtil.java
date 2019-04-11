package com.codegeekgao.date;

import org.joda.time.DateTime;

/**
 * @author codegeekgao
 * @version Id: JodaUtil.java, 2019/4/10 6:54 PM codegeekgao Exp $$
 */
public class JodaUtil {

    public static void main(String[] args) {
        DateTime now = new DateTime();
        // 时间格式化正则
        String formatter = "yyyy-MM-dd HH:mm:ss";
        // 当天开始时间和结束时间
        String startTime = now.withTimeAtStartOfDay().toString(formatter);
        String endTime = now.millisOfDay().withMaximumValue().toString(formatter);
        System.out.println(startTime + "  " + endTime);
        // 月中天,年中天,周中天
        System.out.println("月中天" + now.dayOfMonth().get() + " 年中天" + now.dayOfYear().get() + " 周内天" + now.dayOfWeek().get());
        DateTime yes = now.minusDays(1);
        DateTime tomorrow = now.plusDays(1);
        System.out.println(now.isEqual(now.plusDays(1)));
        System.out.println(now.withDayOfMonth(1).toString(formatter));
        System.out.println(now.withMonthOfYear(1).toString(formatter));
    }
}
