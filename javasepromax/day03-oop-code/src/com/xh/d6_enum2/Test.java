package com.xh.d6_enum2;

public class Test {
    public static void main(String[] args) {
        System.out.println(handleData(3.1,1));
    }
    public static double handleData(double number,int flag){
        switch(flag){
            case Constant.Down:
                System.out.println("向下取整");
                number = Math.floor(number);
                break;
            case Constant.UP:
                System.out.println("向上取整");
                number = Math.ceil(number);
                break;
            case Constant.ROUND:
                System.out.println("四舍五入");
                number = Math.round(number);
                break;
            case Constant.DELETE_LEFT:
                System.out.println("去掉小数部分");
                number = (int)number;
                break;
        }
        return number;
    }
}
