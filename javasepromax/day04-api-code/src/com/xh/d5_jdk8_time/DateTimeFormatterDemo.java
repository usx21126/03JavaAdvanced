package com.xh.d5_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss EEE MM a");

        //当前时间格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(dtf));
        System.out.println(dtf.format(now));

        //

        String date = "2022-02-12 12:15:30";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date2 = LocalDateTime.parse(date, dtf2);
        System.out.println(date2.toString());
    }
}
