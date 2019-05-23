package com.codegeekgao.time;



import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author codegeekgao
 * @version Id: TimeTest.java, 2019/5/19 7:23 PM codegeekgao Exp $$
 */
public class TimeTest {

    public static void main(String[] args) {
        // 创建当前时间
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // 指定时间
        LocalDateTime time = LocalDateTime.of(2019, 5, 23, 14, 33);
        System.out.println(time+"\r");
        // 格林威治时间
        Instant now = Instant.now();
        // 格林时间差8个小时即北京时间
        System.out.println(now.atOffset(ZoneOffset.ofHours(8)));
        // 两个时间相隔时间
        Duration d = Duration.between(Instant.now(),Instant.now());
        System.out.println(d.toMillis()+"  "+d.getNano());
    }

}


