package com.xh.d6_static_singleinstance;
//单例设计模式：懒汉式
public class Test2 {
    public static void main(String[] args) {
        B b1 = B.getB();
        B b2 = B.getB();
        System.out.println(b1);
        System.out.println(b2);
    }
}
