package com.xh.d2_static_method;

public class Student {
    double score;
    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hello world");
        }
    }
    public void printPass(){
        System.out.println(score>=60?"pass":"fail");
    }
}
