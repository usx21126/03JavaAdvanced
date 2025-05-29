package com.xh.d4_static_attention;

public class Test {
    //静态变量
    public static String schoolName = "School Name";
    //静态方法/类方法
    public static void inAddr(){}
    //实例变量
    public String name = "name";
    //实例方法
    public void printInfo(){}

    public static void main(String[] args) {
        testStatic();
    }

    public void testNoStatic(){
        System.out.println(schoolName);
        inAddr();
        System.out.println(this);
        System.out.println(name);
        printInfo();
    }

    public static void testStatic() {
        System.out.println(schoolName);
        inAddr();
        //System.out.println(this);  无法调用
        //System.out.println(name);  无法调用
        //printInfo();               无法调用

    }

}
