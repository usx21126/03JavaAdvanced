package com.xh.d5_jdk8_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        String startTime = "2025-06-07 09:00:00";
        LocalDateTime localDate2 = LocalDateTime.parse(startTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime localDate1 = LocalDateTime.now();
        Duration duration = Duration.between(localDate1, localDate2);
        System.out.println("距离2025年高考开始还有"+duration.toDays()+"天"+duration.toHoursPart()+"小时"+duration.toMinutesPart()+"分"+duration.toSecondsPart()+"秒");

    }
}
