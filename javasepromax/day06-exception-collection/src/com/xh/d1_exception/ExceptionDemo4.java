package com.xh.d1_exception;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        while (true) {
            try {
                double price = getPrice();
                System.out.println("商品定价为："+price);
                break;
            } catch (Exception e) {
                System.out.println("你的价格是瞎搞的");
                e.printStackTrace();
            }
        }
    }

    public static double getPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();
        return price;
    }
}
