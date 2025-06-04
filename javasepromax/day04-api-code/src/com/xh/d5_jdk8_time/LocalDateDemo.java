package com.xh.d5_jdk8_time;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        System.out.println(localDate);

        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfWeek().getValue());
        System.out.println(date.getDayOfYear());


    }
}
