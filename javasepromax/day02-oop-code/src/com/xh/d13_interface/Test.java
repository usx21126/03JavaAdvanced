package com.xh.d13_interface;

public class Test {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.run();
//        c.test();
    }
}

// 1.一个接口继承的多个接口 如果存在方法签名冲突，则不支持多继承
/*
interface A1{
    void run();
}
interface B1{
    String run();
}
interface C1 extends A1,B1{}
 */

// 2.一个类实现的多个接口 如果存在方法签名冲突，则不支持多继承
/*
interface A2{
    void run();
}
interface B2{
    String run();
}
class C2 extends A2,B2{}
 */

// 3.一个类继承了父类，又同时实现了接口，优先级：重写方法>继承方法>实现方法
/*
class Animal {
    public void run(){
        System.out.println("跑的贼溜~~");
    }
}
interface Go{
    default void run(){
        System.out.println("gogogo~~");
    }
}
class Cat  extends Animal implements Go{
    public void test(){
        run(); //Animal
        Go.super.run(); //Go
    }
}
*/

// 4.一个类实现多个接口，接口存在多个同名方法，需要重写后不会冲突
interface A3{
    default void run(){
        System.out.println("A3");
    }
}
interface B3{
    default void run(){
        System.out.println("B3");
    }
}
class C3 implements A3, B3{

    @Override
    public void run() {
        System.out.println("C3");
        A3.super.run();
        B3.super.run();
    }
}
