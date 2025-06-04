package com.xh.d4_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);

//        BigDecimal a1 = new BigDecimal(String.valueOf(a));
//        BigDecimal b1 = new BigDecimal(String.valueOf(b));
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        Double c11 = c1.doubleValue();
        System.out.println(c11);

        System.out.println("----------------------------");
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);

        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k.doubleValue());
    }
}
