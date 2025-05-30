package com.xh.d8_interface;
//接口
public interface A {
    // 1.常量 接口定义常量可以省略public static final,默认会加上
    //public static final String SCHOOL_NAME = "schoolName";
    String SCHOOL_NAME = "SchoolName";
    // 2. 抽象方法 接口定义抽象方法可以省略public abstract,默认会加上
    //public abstract void run();
    void run();
    void go();
}
