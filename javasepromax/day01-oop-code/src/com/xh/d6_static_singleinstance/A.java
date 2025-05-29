package com.xh.d6_static_singleinstance;
//
public class A {
    private static A a = new A();
    private A() {
    }

    public static A getA() {
        return a;
    }
}
