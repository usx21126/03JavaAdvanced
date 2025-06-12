package com.xh.d2_thread_api;



public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread();
        t2.start();
        System.out.println(t2.getName());

        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出:"+i);
        }
    }
}
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public MyThread() {
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(this.getName()+"子线程输出"+i);
        }
    }
}