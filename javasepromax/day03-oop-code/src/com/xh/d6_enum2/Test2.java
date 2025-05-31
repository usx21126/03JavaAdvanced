package com.xh.d6_enum2;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(handleData(3.1,Constant2.UP));
    }
    public static double handleData(double number,Constant2 constant) {
        System.out.println(constant);
        switch(constant){
            case DOWN:
                System.out.println("向下取整");
                number = Math.floor(number);
                break;
            case UP:
                System.out.println("向上取整");
                number = Math.ceil(number);
                break;
            case HANDLE_UP:
                System.out.println("四舍五入");
                number = Math.round(number);
                break;
            case DELETE_LEFT:
                System.out.println("去掉小数部分");
                number = (int)number;
                break;
        }
        return number;
    }
}
