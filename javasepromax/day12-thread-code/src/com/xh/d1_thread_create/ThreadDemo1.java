package com.xh.d1_thread_create;
//多线程创建方式1：继承Thread类
public class ThreadDemo1 {
    public static void main(String[] args) {


        Thread thread = new MyThread();
        //注册线程 start()
        //如果直接调用run,CPU不会注册线程执行，相当于还是单线程
        thread.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("main线程输出" + i);

        }
    }
}
//自定义Thread的继承类
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出"+i);
        }
    }
}