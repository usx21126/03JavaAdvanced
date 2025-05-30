package com.xh.d3_oop_polymorphism;

public class Test {
    public static void main(String[] args) {

        Animal a = new Cat();
        //子类强制类型转换，解决多态下不能直接调用子类方法的问题
        a.cry();
        go(a);

        Cat c = new Cat();
        go(c);

        Dog d = new Dog();
        go(d);

        if(a instanceof Dog){
            Dog d2 = (Dog) a;
            d2.lookDoor();
        }else if(a instanceof Cat){
            Cat c2 = (Cat) a;
            c2.catchFish();
        }

    }

    public static void go(Animal a) {
        System.out.println("开始。。。");
        a.cry();
        if(a instanceof Dog){
            Dog d2 = (Dog) a;
            d2.lookDoor();
        }else if(a instanceof Cat){
            Cat c2 = (Cat) a;
            c2.catchFish();
        }else if(a instanceof Animal){
            a.cry();
        }
        System.out.println("结束。。。");
    }
}
