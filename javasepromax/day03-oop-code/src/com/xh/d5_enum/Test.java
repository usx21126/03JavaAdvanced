package com.xh.d5_enum;

public class Test {
    public static void main(String[] args) {
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("----------------");
        //values 方法用来获得枚举类的全部对象
        A[] as = A.values();
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i]);
        }
        System.out.println("----------------");
        A y = A.valueOf("Y");
        System.out.println(a2 == y);
        System.out.println("----------------");
        //ordinal
        System.out.println(a1.ordinal());
        System.out.println(a2.ordinal());
    }
}
