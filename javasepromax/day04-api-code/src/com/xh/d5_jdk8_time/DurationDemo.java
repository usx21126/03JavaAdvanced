package com.xh.d5_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.of(2021,1,1,12,30,0,0);
        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        System.out.println(duration.toMillis());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMinutes());

        System.out.println(duration.toHours());
        System.out.println(duration.toDays());

    }
}
