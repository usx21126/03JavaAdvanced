package com.xh.d7_abstract_demo2;

public class Test {
    public static void main(String[] args) {
        People p = new Student();
        p.write();
        People p2 = new Teacher();
        p2.write();
    }
}
