package com.xh.d6_thread_synchronized_lock;

public class Test {
    public static void main(String[] args) {
        Account acc =new Account("ICBC-100",100000);
        new MyThread("小明",acc).start();
        new MyThread("小红",acc).start();
    }
}
