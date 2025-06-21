package com.xh.d2_reflect;

public class Test1Class {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象
        Class c1 = Student.class;
        System.out.println(c1);
        Class c2 = Class.forName("com.xh.d2_reflect.Student");
        System.out.println(c2);

        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c3);
    }
}
