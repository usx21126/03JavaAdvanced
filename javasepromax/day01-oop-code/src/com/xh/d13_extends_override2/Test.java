package com.xh.d13_extends_override2;
//重写实际应用场景
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏",'女',169.5,"执着");
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
