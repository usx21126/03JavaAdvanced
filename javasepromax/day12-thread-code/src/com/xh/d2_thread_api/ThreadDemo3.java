package com.xh.d2_thread_api;

import java.nio.file.Path;

//join线程
public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {


        Thread t = new MyThread("sb");
        t.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("main"+i);
            if(i==2) {
                t.join();//线程插队执行
            }
        }

    }
}
