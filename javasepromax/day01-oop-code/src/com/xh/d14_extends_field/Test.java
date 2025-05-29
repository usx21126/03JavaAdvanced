package com.xh.d14_extends_field;

public class Test {
    public static void main(String[] args) {
        //就近原则 子类访问成员
        Zi zi = new Zi();
        zi.showName();
    }
}
class Zi extends Fu{
    String name = "子类名称";
    @Override
    public void showName(){
        String name = "局部变量";
        System.out.println(name);
        System.out.println(this.name);  //访问子类成员name
        System.out.println(super.name); //访问父类成员name
    }
}
class Fu{
    String name = "父类名称";
    public void showName(){
        System.out.println(name);
    }
}
