package com.xh.d2_lambda;

import com.xh.d1_array.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

public class LambdaTest2 {
    public static void main(String[] args) {
        int[] arr3 = {40,10,30,20};
//        Arrays.setAll(arr3, new IntUnaryOperator(){
//            @Override
//            public int applyAsInt(int operand) {
//                return arr3[operand]+10;
//            }
//        });

        Arrays.setAll(arr3, operand -> arr3[operand]+10);
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------");

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

        Arrays.sort(students,(o1,o2)->Double.compare(o1.getHeight(),o2.getHeight()));
        System.out.println(Arrays.toString(students));
    }
}
