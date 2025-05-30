package com.xh.d7_abstract_demo2;

public abstract class People {
    public final void write(){
        System.out.println("s1");
        writeMain();
        System.out.println("s3");
        System.out.println("s4");
    }
    public abstract void writeMain();
}
