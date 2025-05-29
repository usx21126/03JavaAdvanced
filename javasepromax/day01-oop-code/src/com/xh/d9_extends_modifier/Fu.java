package com.xh.d9_extends_modifier;

public class Fu {
    //1.private 本类访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }
    //2.缺省 本类，同包访问
    void method() {
        System.out.println("method");
    }
    //3.protected 本类，同包，子孙类访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    //4.public 任意
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
