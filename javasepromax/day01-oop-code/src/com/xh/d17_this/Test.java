package com.xh.d17_this;

public class Test {
    public static void main(String[] args) {
        //this调用兄弟构造器
        Student s1 = new Student("孙悟空",500,"三星洞");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("蜘蛛精",900);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSchoolName());

    }
}
