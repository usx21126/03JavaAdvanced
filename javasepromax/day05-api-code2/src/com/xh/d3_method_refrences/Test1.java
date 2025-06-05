package com.xh.d3_method_refrences;

import com.xh.d1_array.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[]students=new Student[4];// students = [nuil, null, null, null]
        students[0]=new Student( "周芷荐",21,'女',169.3);
        students[1]=new Student( "殷素素",38,'女',172.2);
        students[2]=new Student( "小昭",19, '女',168.5);
        students[3]=new Student( "张无总",23,'男',183.5);

//        Arrays.sort(students);
//        Arrays.sort(students,new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(),o2.getHeight());
//            }
//        });
//        Arrays.sort(students,(o1, o2)-> Double.compare(o1.getHeight(),o2.getHeight()));
//        Arrays.sort(students,(o1,o2)->Student.compareByHeight(o1,o2));
        Arrays.sort(students,Student::compareByHeight);
        System.out.println(Arrays.toString(students));
    }
}
