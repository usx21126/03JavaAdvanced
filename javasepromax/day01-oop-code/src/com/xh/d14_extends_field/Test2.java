package com.xh.d14_extends_field;

public class Test2 {
    public static void main(String[] args) {
        //就近原则 子类访问成员
        Zi2 z = new Zi2();
        z.run();
        z.go();
    }
}
class Zi2 extends Fu2{
    @Override
    public void run() {
        System.out.println("子类跑");
    }
    public void go(){
        run(); //子类
        super.run();    //父类
    }
}
class Fu2{

    public void run(){
        System.out.println("父类跑");
    }
}
