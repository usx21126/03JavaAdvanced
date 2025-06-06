package com.xh.d6_set;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private String hobby;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && Objects.equals(name, student.name) && Objects.equals(hobby, student.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, hobby);
    }

    public Student() {
    }

    public Student(String name, char sex, String hobby) {
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
