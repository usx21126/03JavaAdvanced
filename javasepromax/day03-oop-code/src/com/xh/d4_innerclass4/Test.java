package com.xh.d4_innerclass4;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.cry();
        //匿名内部类本质是一个子类，同时会立即创建一个子类对象
        Animal b = new Animal() {
            @Override
            public void cry() {
                System.out.println("🐱喵喵喵~~");
            }
        };
        b.cry();
    }
}
class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("🐕汪汪汪~~");
    }
}

abstract class Animal {
    public abstract void cry();
}
