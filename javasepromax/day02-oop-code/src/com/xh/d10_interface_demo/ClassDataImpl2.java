package com.xh.d10_interface_demo;

import java.util.ArrayList;

public class ClassDataImpl2 implements ClassData {
    private ArrayList<Student> students;
    public ClassDataImpl2(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("===展示全部学生信息===");
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
            if (s.getSex() == '男') count++;
        }
        System.out.println("男人数："+count);
        System.out.println("女人数："+(students.size()-count));
    }

    @Override
    public void printAllStudentAverageScore() {
        System.out.println("===展示全部学生平均分===");
        Student s1 = students.get(0);
        double totalScore = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.size(); i++) {
            Student s = students.get(i);
            totalScore += s.getScore();
            if (s.getScore() > max) max = s.getScore();
            if (s.getScore() < min) min = s.getScore();
        }
        System.out.println((totalScore-max-min)/(students.size()-2));
    }
}
