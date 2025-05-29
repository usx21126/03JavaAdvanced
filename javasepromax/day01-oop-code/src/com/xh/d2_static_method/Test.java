package com.xh.d2_static_method;

public class Test {
    public static void main(String[] args) {
        //类方法
        Student.printHelloWorld();
        //实例方法
        Student s1 = new Student();
        s1.printPass();
        s1.printHelloWorld();

    }
}
