package com.xh.d11_interface_extends;

public class Test {
    public static void main(String[] args) {
        //类与类是单继承，一个类只能继承一个父类

        //类和接口是多实现的，一个类可以实现多个接口

        //接口和接口是多继承的，一个接口可以同时继承多个接口
    }
}
class D implements A {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}
interface A extends B, C {
    void a();
}
interface B {
    void b();
}
interface C {
    void c();
}
