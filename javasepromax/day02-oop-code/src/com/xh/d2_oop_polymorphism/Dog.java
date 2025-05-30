package com.xh.d2_oop_polymorphism;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("🐕汪汪汪");
    }
    public void lookDoor(){
        System.out.println("🐕看门~~~");
    }
}
