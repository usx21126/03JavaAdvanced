package com.xh.d3_recursion;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(f(12));
        for (int i = 1; i < 10; i++) {
            System.out.println(i+":"+f2(i));
        }
    }
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }else return f(n-1)*n;
    }

    //猴子吃桃
    //f(10) = 1
    //f(x+1)= f(x)-f(x)/2-1
    //2f(x+1) = f(x)-2  f(9)=4
    public static int f2(int n) {
        if(n==10) return 1;
        else return 2*f2(n+1)+2;
    }
}
