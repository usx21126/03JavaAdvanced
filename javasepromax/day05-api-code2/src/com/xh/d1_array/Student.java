package com.xh.d1_array;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private char gender;
    private double height;

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    public static int compareByHeight(Student o1, Student o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
    public Student() {
    }

    public Student(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                "}\n";
    }
}
