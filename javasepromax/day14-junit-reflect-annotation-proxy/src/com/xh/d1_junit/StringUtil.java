package com.xh.d1_junit;

/**
 * 字符串工具类
 */
public class StringUtil {
    public static void printNumber(String name){
        if(name == null){
            System.out.println("null");
            return;
        }
        System.out.println("名字长度是："+name.length());
    }
    public static int getMaxIndex(String data){
        if (data == null) {
            return -1;
        }
        return data.length()-1;
    }
}
