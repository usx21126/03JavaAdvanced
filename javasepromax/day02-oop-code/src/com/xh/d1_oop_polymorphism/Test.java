package com.xh.d1_oop_polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.cry();
        a2.cry();
    }
}
