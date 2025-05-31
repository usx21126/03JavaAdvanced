package com.xh.d4_innerclass4;

public class Test2 {
    public static void main(String[] args) {
        Swimming s1 =new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳贼快~~");
            }
        };
        go(s1);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳贼慢~~");
            }
        });
    }
    public static void go(Swimming s) {
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}



interface Swimming{
    void swim();
}