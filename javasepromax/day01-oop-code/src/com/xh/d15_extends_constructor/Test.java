package com.xh.d15_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //子类的全部构造器优先调用父类构造器，再执行自己的构造器
        Wolf wolf = new Wolf();
        Wolf wolf2 = new Wolf("Wolf");
    }
}
