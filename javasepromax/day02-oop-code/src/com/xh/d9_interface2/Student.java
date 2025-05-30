package com.xh.d9_interface2;

public class Student extends People implements Driver{
    @Override
    public void driveCar() {
        System.out.println("Driving Car");
    }
}
