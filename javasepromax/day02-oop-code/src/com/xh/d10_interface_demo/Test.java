package com.xh.d10_interface_demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /**
         * 请设计一个班级学生的信鼻管理模块::学生的数据有:姓名、性别、成绩
         * 功能1：要求打印出全班学生的信息
         * 功能2：要求打印出全班学生的平均成绩。
         *
         * 注意!以上功能的业务实现是有多套方案的，比如:
         * 第1套方案：能打印出班级全部学生的信息;能打印班级全部学生的平均分。
         * 第2套方案：能打印出班级全部学生的信息(包含男女人数);能打印班级全部学生的平均分(要求是去掉最高分、最低分)
         * 要求：系统可以支持灵活的切换这些实现方案。
         */
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("木婉清",'女',80));
        students.add(new Student("钟灵",'女',95));
        students.add(new Student("王语嫣",'女',75));
        students.add(new Student("西夏公主",'女',100));
        students.add(new Student("虚竹",'男',90));
        students.add(new Student("乔峰",'男',100));
        students.add(new Student("段誉",'男',80));

        ClassData data = new ClassDataImpl1(students);
        data.printAllStudentInfos();
        data.printAllStudentAverageScore();

    }
}
