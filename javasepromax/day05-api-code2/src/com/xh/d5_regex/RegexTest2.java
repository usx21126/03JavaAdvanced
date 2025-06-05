package com.xh.d5_regex;

import java.util.Scanner;

public class RegexTest2 {
    public static void main(String[] args) {
        checkMail();
        checkPhone();
    }

    private static void checkPhone() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your phone number");
            String mail = sc.next();

            if(mail.matches("1[3-9]\\d{9}")) {
                System.out.println("Your phone number is valid");
                break;
            }else{
                System.out.println("Invalid phone number");
            }
        }
    }

    private static void checkMail() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your mail address");
            String mail = sc.next();

            if(mail.matches("\\w{2,30}@\\w{2,20}(\\.\\w{2,20}){1,2}")){
                System.out.println("Your mail address is valid");
                break;
            }else{
                System.out.println("Invalid mail address");
            }
        }
    }

}
