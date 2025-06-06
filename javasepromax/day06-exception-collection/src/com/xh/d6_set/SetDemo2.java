package com.xh.d6_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {

        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("张继科",'男',"借钱");
        Student s2 = new Student("林丹",'男',"打羽毛球");
        Student s3 = new Student("景甜",'女',"从前的张继科");
        Student s4 = new Student("景甜",'女',"从前的张继科");

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        sets.forEach(s-> System.out.println(s.toString()));
    }
}
