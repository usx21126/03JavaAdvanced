package com.xh.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        //1.快速添加
        Collections.addAll(names,"张无忌","赵敏","小昭");
        System.out.println(names);

        //2.打乱顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.排序
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("赵敏",19,169.5);
        Student s2 = new Student("赵敏",21,169.5);
        Student s3 = new Student("刘亦菲",34,167.5);
        Student s4 = new Student("李若彤",26,168.5);
        Collections.addAll(students,s1,s2,s3,s4);
        Collections.sort(students,(o1, o2) -> o1.getAge()-o2.getAge());

    }
}
