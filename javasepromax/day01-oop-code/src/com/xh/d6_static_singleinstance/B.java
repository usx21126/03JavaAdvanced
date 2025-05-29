package com.xh.d6_static_singleinstance;

public class B {
    private static B b;//b=null
    private B(){}
    public static B getB(){
        if(b==null){
            b = new B();
        }
        return b;
    }
}
