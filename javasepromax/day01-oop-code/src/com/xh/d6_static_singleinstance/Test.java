package com.xh.d6_static_singleinstance;
//单例设计模式:饿汉式
public class Test {
    public static void main(String[] args) {
        A a1 = A.getA();
        A a2 = A.getA();
        System.out.println(a1);
        System.out.println(a2);
    }
}
