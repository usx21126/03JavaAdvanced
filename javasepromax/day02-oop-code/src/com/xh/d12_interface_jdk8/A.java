package com.xh.d12_interface_jdk8;

public interface A {
    //默认方法，必须用default修饰
    default void run(){
        go();
        System.out.println("跑的贼快~~");
    }

    //私有方法（JDK9开始有）
    private void go(){
        System.out.println("开始跑~~");
    }
    int a = 17;
    //静态方法
    static void inAddr(){
        System.out.println("<UNK>~~");
    }
}
