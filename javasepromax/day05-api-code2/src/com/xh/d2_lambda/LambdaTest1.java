package com.xh.d2_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {

//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("swim");
//            }
//        };
//        s1.swim();
        Swimming s2 = ()->{
            System.out.println("swim");
        };
        s2.swim();
    }
}

interface Swimming{ //函数式接口有且仅有一个方法
    void swim();
}
