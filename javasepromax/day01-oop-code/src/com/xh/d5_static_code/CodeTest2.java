package com.xh.d5_static_code;
//实例代码块
public class CodeTest2 {

    {
        System.out.println("instance block");
    }
    public CodeTest2() {}{
        System.out.println("constructor block");
    }
    public static void main(String[] args) {
        System.out.println("main block");
        new CodeTest2();
    }
}
