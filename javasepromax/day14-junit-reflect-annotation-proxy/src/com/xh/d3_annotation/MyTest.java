package com.xh.d3_annotation;

public @interface MyTest {
    String name();
    double money() default 100;
    String[] authors();
}
