package com.xh.d1_innerclass1;

public class Test {
    public static void main(String[] args) {
        //成员内部类创建对象
        Outer.Inner inner = new Outer().new Inner();
        inner.setName("张三");
    }
}
