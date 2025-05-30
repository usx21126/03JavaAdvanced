package com.xh.d10_interface_demo;

import java.util.ArrayList;

public class ClassDataImpl1 implements ClassData {
    private ArrayList<Student> students;
    public ClassDataImpl1(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("===展示全部学生信息===");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }
    }

    @Override
    public void printAllStudentAverageScore() {
        System.out.println("===展示全部学生平均分===");
        double totalScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            totalScore += s.getScore();
        }
        System.out.println(totalScore/students.size());
    }
}
