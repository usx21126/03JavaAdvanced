package com.xh.d4_thread_synchronized_code;

public class Test {
    public static void main(String[] args) {

        Account acc =new Account("ICBC-100",100000);

        new MyThread("小明",acc).start();
        new MyThread("小红",acc).start();


    }
}
