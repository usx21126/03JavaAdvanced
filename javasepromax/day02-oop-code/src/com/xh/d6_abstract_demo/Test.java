package com.xh.d6_abstract_demo;

public class Test {
    public static void main(String[] args) {
        //抽象类应用场景
        Animal a1 = new Cat();
        a1.cry();

        Animal a2 = new Dog();
        a2.cry();
    }
}
