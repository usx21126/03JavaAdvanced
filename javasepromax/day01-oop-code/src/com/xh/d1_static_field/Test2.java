package com.xh.d1_static_field;

public class Test2 {
    public static void main(String[] args) {
        new User();
        new User();
        new User();
        System.out.println(User.getNumber());
    }
}
