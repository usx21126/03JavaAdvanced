package com.xh.d2_oop_polymorphism;

public class Test {
    public static void main(String[] args) {
        //1.多态下，右边对象解耦合
        Animal a = new Cat();
        a.cry();

        Cat c = new Cat();
        go(c);

        Dog d = new Dog();
        go(d);


    }

    //2.父类作为方法形参，可以接受子类对象
    public static void go(Animal a) {
        System.out.println("开始。。。");
        a.cry();
        //多态下的问题，不能调用子类独有的功能
        //a.lookDoor();     //报错
        System.out.println("结束。。。");
    }
}
