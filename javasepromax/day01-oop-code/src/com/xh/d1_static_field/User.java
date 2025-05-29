package com.xh.d1_static_field;

public class User {
    private static int number;  //静态变量，只有一份

    public User() {
        this.number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        User.number = number;
    }
}
