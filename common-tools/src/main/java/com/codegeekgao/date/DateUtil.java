package com.codegeekgao.date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期常用类
 *
 * @author DonnieGao
 * @version Id: DateUtil.java, v 0.1 2018/8/9 上午12:21 DonnieGao Exp $$
 */
public class DateUtil {

    /**
     * 获取开始时间到中间时间的所有时间段
     *
     * @param start        开始时间
     * @param end          结束时间
     * @param calendarType 时间类型
     * @param amount       时间间隔
     * @return
     */
    public static Date[] getDateArrays(Date start, Date end, int calendarType, int amount) {
        ArrayList<Date> ret = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        Date tmpDate = calendar.getTime();
        long endTime = end.getTime();
        while (tmpDate.before(end) || tmpDate.getTime() == endTime) {
            ret.add(calendar.getTime());
            calendar.add(calendarType, amount);
            tmpDate = calendar.getTime();
        }
        Date[] dates = new Date[ret.size()];
        return (Date[]) ret.toArray(dates);
    }

    /**
     * 获取传入的时间计算出时间相隔区间
     *
     * @param start
     * @param end
     * @return
     */
    public static Long getHourInterval(Date start, Date end) {
        long timeInterval = end.getTime() - start.getTime();
        return timeInterval / (1000 * 60 * 60);
    }

}
