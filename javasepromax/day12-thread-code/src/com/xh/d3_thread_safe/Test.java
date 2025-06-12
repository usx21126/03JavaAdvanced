package com.xh.d3_thread_safe;

public class Test {
    public static void main(String[] args) {

        Account acc =new Account("ICBC-100",100000);

        new MyThread("小明",acc).start();
        new MyThread("小红",acc).start();


    }
}
class MyThread extends Thread{
    private static Account acc;
    public MyThread() {
        super();
    }

    public MyThread(String name,Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMony(100000);
    }
}