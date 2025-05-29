package com.xh.d15_extends_constructor;

public class Wolf extends Animal{
    public Wolf(){
        super();    //写不写都有
        System.out.println("Wolf --无参");
    }
    public Wolf(String name){
        super(name); //写不写都有
        System.out.println("Wolf --有参");
    }
}
