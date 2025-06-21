package com.xh.d2_reflect;

public class Teacher {
    private String name;
    private double salary;
    public Teacher(){}
    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
