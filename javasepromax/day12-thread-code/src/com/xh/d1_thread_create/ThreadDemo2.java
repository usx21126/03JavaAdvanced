package com.xh.d1_thread_create;
//2.实现runnable接口
public class ThreadDemo2 {
    public static void main(String[] args) {

//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//        for (int i = 0; i < 4; i++) {
//            System.out.println("main线程输出："+i);
//        }

        new Thread(() ->{
            for (int i = 0; i < 4; i++) System.out.println("main线程输出："+i);
        }).start();
    }
}
/**
 * 定义类实现runnable接口
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出："+i);
        }
    }
}