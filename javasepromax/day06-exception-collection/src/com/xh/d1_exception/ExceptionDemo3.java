package com.xh.d1_exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {


        System.out.println("start");
        try {
            save(1560);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    public static void save(int age) throws InvalidAgeException {
        if(age < 0 || age > 150){
            throw new InvalidAgeException("年龄超范围！");
        }
    }
}
