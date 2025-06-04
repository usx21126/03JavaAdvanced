package com.xh.d5_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate end = LocalDate.now();
        LocalDate begin = LocalDate.of(2018, 1, 1);
        Period period = Period.between(begin, end);
        System.out.println(period);
    }
}
