package com.xh.d2_thread_api;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("输出"+i);
            Thread.sleep(1000);
        }
    }
}
