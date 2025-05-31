package com.xh.d8_interface;

public class Test {
    public static void main(String[] args) {
        Bimpl b = new Bimpl();
        b.go();
        b.run();
        b.eat();
        System.out.println(b.SCHOOL_NAME);
    }
}
