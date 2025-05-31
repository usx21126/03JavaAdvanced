package com.xh.d3_oop_polymorphism;

public class Cat extends Animal {
    public String name = "cat";
    @Override
    public void cry() {
        System.out.println("🐱喵喵喵~");
    }
    public void catchFish(){
        System.out.println("🐱抓鱼~~~");
    }
}

