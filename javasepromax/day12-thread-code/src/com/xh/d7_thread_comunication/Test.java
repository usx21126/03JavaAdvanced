package com.xh.d7_thread_comunication;
//线程通信
public class Test {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Desk desk = new Desk();
        //创建2个消费者线程
        new ConsumerThread(desk,"consumer1").start();
        new ConsumerThread(desk,"consumer2").start();
        //创建3个生产者进程
        new ProductorThread(desk,"productor1").start();
        new ProductorThread(desk,"productor2").start();
        new ProductorThread(desk,"productor3").start();
    }
}
