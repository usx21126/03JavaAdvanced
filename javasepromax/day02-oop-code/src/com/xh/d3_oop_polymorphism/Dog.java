package com.xh.d3_oop_polymorphism;

public class Dog extends Animal {
    public String name = "Dog";
    @Override
    public void cry() {
        System.out.println("🐕汪汪汪");
    }
    public void lookDoor(){
        System.out.println("🐕看门~~~");
    }
}
