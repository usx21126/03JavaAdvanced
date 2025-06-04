package com.xh.d5_jdk8_time;

import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        //总秒数
        long s1 = now.getEpochSecond();
        System.out.println(s1);
        long s2 = now.getNano();
        System.out.println(s2);
    }

}
