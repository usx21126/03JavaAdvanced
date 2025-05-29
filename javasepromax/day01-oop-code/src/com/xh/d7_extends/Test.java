package com.xh.d7_extends;
//继承
public class Test {
    public static void main(String[] args) {
        //子类对象创建特点：由子类和父类等多张设计图共同创建出类对象，但是能访问什么看权限
        A b = new A();
        System.out.println(b.i);
        System.out.println(b.getJ());
    }
}
