package com.xh.d5_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("12312312"));
        System.out.println(checkQQ("1231w123"));
        System.out.println(checkQQ("123"));
        System.out.println(checkQQ("01131223"));
    }
    public static boolean checkQQ(String qq) {
        //5位以上，全是数字，禁止以0开头
//        if(qq == null || qq.length() <=5 || qq.startsWith("0")){
//            return false;
//        }
//        for (int i = 0; i < qq.length(); i++) {
//            char c = qq.charAt(i);
//            if(c < '0' || c > '9'){
//                return false;
//            }
//        }
//        return true;

        return qq!=null && qq.matches("[1-9]\\d{5,}");
    }
}
