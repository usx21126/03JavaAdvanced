package com.xh.d1_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(3, 0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int divide(int a,int b){

        int c = a/b;
        return c;
    }
}
