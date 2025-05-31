package com.xh.d10_genericity_method;

import com.xh.d9_genericity_interface.Student;

public class Test {
    public static void main(String[] args) {

        String[] names = {"A", "B", "C", "D", "E", "F"};
        printArray(names);

        Student[] students = new Student[60];
        printArray(students);
    }

    public static <T> void printArray(T[] arr) {

    }
}
