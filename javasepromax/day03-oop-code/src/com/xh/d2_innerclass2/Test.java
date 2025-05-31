package com.xh.d2_innerclass2;

public class Test {
    public static void main(String[] args) {
        //静态内部类
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
