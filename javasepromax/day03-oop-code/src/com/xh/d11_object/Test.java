package com.xh.d11_object;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

//        Student s1 = new Student("name",32);
//        System.out.println(s1);
//        System.out.println(s1.toString());


        System.out.println("-------------");
        //equal 比较地址
        Student t1 = new Student("name1",32);
        Student t2 = new Student("name1",32);
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        String A ="13";
        Integer B =13;
        System.out.println(Objects.equals(A,B));
    }
}
